package cap11_egi;

import java.util.Arrays;

enum GiornoSettimana {
	LUN(8), MAR(8), MER(8), GIO(8), VEN(8), SAB(4), DOM(0);
	
	// campi
	int numeroOreLavorative;
	
	// costruttore
	GiornoSettimana(int n){numeroOreLavorative = n;}
	
	
	// definire dei metodi
	// definiti nelle super classi -> ridefiniti (override)
	@Override
	public String toString() {
		switch (this) {
		case LUN: return "lunedì";
		case MAR: return "martedì";
		case MER: return "mercoledì";
		default: return "altro giorno";
		}
		//throw new RuntimeException("non so che giorno sia");
	}
	// NUOVI METODI
	String mood() {
		switch (this) {
		case LUN: return "triste";
		case VEN: return "contento";
		case DOM: return "depresso";
		default: return "tutto ok";
		}}
	// restituisce il giorno di domani
	GiornoSettimana domani(){
		/*switch (this) {
		case LUN: return MAR;
		..*/
		int indiceDiOggi = this.ordinal();
		int indiceDidomani = (indiceDiOggi +1) % values().length; // 7
		GiornoSettimana domani = values()[indiceDidomani];
		return domani;
	}
	
}

public class UsoEnum19 {
	public static void main(String[] args) {
		GiornoSettimana oggi = GiornoSettimana.VEN;
		// nome 
		System.out.println(oggi.name());
		// ordinale
		System.out.println(GiornoSettimana.LUN.ordinal());
		// comparable
		System.out.println("oggi è dopo SAB?");
		System.out.println(oggi.compareTo(GiornoSettimana.SAB)>0);
		
		// stampo i possibili valori di GiornoSettimana
		System.out.println(GiornoSettimana.values());
		System.out.println(Arrays.toString(GiornoSettimana.values()));
		
		// d aun intero ad un enum:
		// esempio 0 -> LUN
		GiornoSettimana primoGIorno = GiornoSettimana.values()[0];
		System.out.println(primoGIorno);
		
		System.out.println(oggi.mood());
		
		System.out.println(oggi.numeroOreLavorative);
		
	}
	
}
