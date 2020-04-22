package ristorante_4_8;

import java.util.ArrayList;
import java.util.List;
// non controllata
class PiattoIDSbagliatoException extends RuntimeException{

	PiattoIDSbagliatoException(){
		super("piatto con id sbagliato");
	}
} 

public class Piatto {
	// memorizza tutti gli id di tutti piatti
	static List<String> idPiattiCreati = new ArrayList<String>();
	// id si questo piatto
	String id;
	
	/**
	 * 
	 * @param id identificavo univoco del piatto
	 * @param quan quantità
	 * @param prezzo prezzo
	 */
	public Piatto(String id, int quan, int prezzo) {
		if (idPiattiCreati.contains(id)) {
			throw new PiattoIDSbagliatoException();
		}
		idPiattiCreati.add(id);
		this.id = id;
	}	
	
}
