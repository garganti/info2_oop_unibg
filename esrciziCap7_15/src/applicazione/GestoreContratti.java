package applicazione;

import java.util.ArrayList;
import java.util.List;

import applicazione.data.Contratto;

public class GestoreContratti {
// campi
	List<Contratto> contratti;
	// costruttore
	public GestoreContratti(){
		contratti = new ArrayList<>();
	}
	/**
	 * 
	 * @param c contratto da ggiungere
	 */
	public void add(Contratto c){
		contratti.add(c);
	}

	public void print() {
		System.out.println("CONTRATTI REGISTRATI");
		for(Contratto c: contratti){
			System.out.println("*******");
			System.out.println(c);
		}
	}
	
}
