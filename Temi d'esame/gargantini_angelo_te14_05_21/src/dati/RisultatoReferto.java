package dati;

public enum RisultatoReferto{
	POSITIVO(1), NEGATIVO(-1), DUBBIO(0);

	public int valore;
	
	RisultatoReferto(int i) {
		valore = i;
	}
}