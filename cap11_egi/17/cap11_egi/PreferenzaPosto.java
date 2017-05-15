package cap11_egi;

public enum PreferenzaPosto {
	FINESTRINO(60), CORRIDOIO(70), INDIFFERENTE(0);
	PreferenzaPosto(int c){
		costo = c;
	}
	// costo delle preferenza:
	// FIN -> 60, CORRIDOIO -> 70, INDIFF -> 0
	
	private int costo;
	
	public int getCosto(){
		return costo;
	}
	
	
}
