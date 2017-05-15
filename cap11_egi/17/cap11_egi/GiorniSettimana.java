package cap11_egi;

public enum GiorniSettimana {
	
	LUN(8),MAR(8),MER(8),
	GIO(8),VEN(8),SAB(4),
	DOM(0);
	// POSSO FARE COSTRUTTORE
	/**
	 * @param n numero di ore lavorative per quel giorno
	 */
	GiorniSettimana(int n){
		nOreLav = n;
	}
	
	
	public GiorniSettimana nextDay(){
		/*switch (this) {
		case DOM:
			return LUN;
		default:
			return values()[this.ordinal()+1];
		}*/
		return values()[(this.ordinal()+1) % values().length];
	}
	/** da LUN a VEN -> 8, SAB -> 4, DOM -> 0*/
	// invece che switch, introduco un CAMPO che indica il numero di 
	// ore lavorative per quel giorno
	private int nOreLav;
	
	public int oreLavorative(){
		return nOreLav;
	}
}
