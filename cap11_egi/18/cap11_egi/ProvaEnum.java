package cap11_egi;

enum GiornoSettimana {	
	LUN(9,"lunedì"), MAR(9,"martedì"), MER(9,"mecoledì"), GIO(9,"giovedì"), VEN(6,"venerdì"), SAB(0,"sabato"), DOM(0,"domenica");
	// campi
	private int oreDaLavorare;
	private String nomeIntero;

	GiornoSettimana(int odl, String nomeIntero) {
		//System.out.println(" chiamo costuttore per " + this.name());
		oreDaLavorare = odl;
		this.nomeIntero = nomeIntero;
	}

	// altri metodi
	boolean isFeriale() {
		return this != SAB && this != DOM;
	}

	// domani: che giorno è domani
	UsoEnum19 domani() {
		int oggi_ord = this.ordinal();
		int dom_ord = (oggi_ord + 1) % 7;
		UsoEnum19 domani = values()[dom_ord];
		return domani;
		/*
		 * switch (this) { case LUN: return MAR; // .... default: break; }
		 */
	}

	// ieri: che giorno fu ieri
	UsoEnum19 ieri() {
		int oggi_ord = this.ordinal();
		int ieri_ord = (oggi_ord + 6) % 7;
		UsoEnum19 ieri = values()[ieri_ord];
		return ieri;
	}

	int oreDaLavorare() {
		// LUN -> GIO => 9
		// VEN => 6
		// SAB, DOM => 0
		/*
		 * switch (this) { case LUN: return 9; default: break; }
		 */
		// INVECE uso un campo
		return oreDaLavorare;
	}

	// metodo che data una stringa restituisce il giorno della settimana
	static UsoEnum19 parse(String s) {
		for (UsoEnum19 gs : UsoEnum19.values()) {
			if (gs.name().equals(s)) {
				return gs;
			}
		}
		throw new RuntimeException("giorno non valido " + s);
	}

	@Override
	public String toString() {
		return nomeIntero;
	}
}

public class ProvaEnum {
	public static void main(String[] args) {
		String giorno = "VEN";
		UsoEnum19 gs = UsoEnum19.parse(giorno);
		System.out.println(gs.name());
		System.out.println(gs.ordinal());
		System.out.println("ieri era " + gs.ieri());
		System.out.println("domani sarà " + gs.domani());
		System.out.println(" dovrò lavorare " + gs.domani().oreDaLavorare() + " ore");
		
		UsoEnum19.parse("kkkk");
	}

}
