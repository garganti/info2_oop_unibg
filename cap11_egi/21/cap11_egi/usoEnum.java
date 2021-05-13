package cap11_egi;

import java.util.Arrays;

enum GiornoSettimana {	
	//LUN, MAR, MER, GIO, VEN, SAB, DOM;
	// così chiamo il costuttore
	LUN(-1), MAR(8), MER(8), 
	GIO(8), VEN(8), SAB(10), DOM(20);

	// qualità del giorno 
	// LUN -> -1,  MAR... VEN -> 8, SAB -> 10, DOM -> 20
	// campo
	private int qualita;
	// costruttore
	GiornoSettimana(int q){
		qualita = q;}
	// metodo
	int getQualita() {return qualita;}

	
	// ridefinire dei metodi
	@Override
	public String toString() {
/* java 14		return switch (this) {
		case LUN -> "Lunedì";
		case MAR -> "Martedì";		
		default ->
			super.toString();
		};*/
		switch (this) {
		case LUN : return "Lunedì";
		case MAR : return "Martedì";		
		default :
			return super.toString();
		}
	}
	// nuovi metodi
	public int numHLavorative() {
		switch (this) {
		case SAB: return 4;
		case DOM: return 0;
		default:
			return 8;
		}
	}


}

public class usoEnum{	
	public static void main(String[] args) {
		GiornoSettimana bestDay = GiornoSettimana.SAB;
		//GiornoSettimana cg = new GiornoSettimana("KIO")
		
		System.out.println(
				GiornoSettimana.LUN.compareTo(bestDay));
		
		System.out.println(
		Arrays.toString(GiornoSettimana.values()));
		
		
		System.out.println(GiornoSettimana.GIO.numHLavorative());
		System.out.println(GiornoSettimana.DOM.getQualita());
		
	}
}


