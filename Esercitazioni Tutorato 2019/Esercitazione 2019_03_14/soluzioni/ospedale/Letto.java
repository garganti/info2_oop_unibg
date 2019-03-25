package ospedale;

public class Letto {

	int numprogLetto;
	int numstanza; 
	int libero; ////1 letto libero
	char tipoStanza;
	
	public Letto(int numprogLetto, int numstanza, int libero, char tipoStanza) {
		this.numprogLetto=numprogLetto;
		this.numstanza=numstanza;
		this.libero=libero;
		this.tipoStanza=tipoStanza;
	}
	
	public int getLibero() {
		return libero;
	}
	
	public char getTipoStanza() {
		return tipoStanza;
	}
	
	public int getNumprogLetto() {
		return numprogLetto;
	}
	
	public void setLibero(int libero) {
		this.libero = libero;
	}

}
