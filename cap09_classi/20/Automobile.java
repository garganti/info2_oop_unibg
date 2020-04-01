import java.util.List;

enum Cambio{  MANUALE,AUTOMATICO;}

class Ruota{ }

public class Automobile {
	// campi
	private String colore;
	String marca,modello;
	int numeroposti, porte;
	char[] targa;
	boolean cambioManuale;
	Cambio cambio;
	List<Ruota> ruote;
	// costruttori
	public Automobile(char[] t){
		targa = t;
		cambio = Cambio.MANUALE;
		colore = "bianco";
		numeroposti = 4;
		//...
	}
	
}
