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
	static List<String> idPizze = new ArrayList<String>();
	/**
	 * 
	 * @param id identificavo univoco del piatto
	 * @param quan quantità
	 * @param prezzo prezzo
	 */
	public Piatto(String id, int quan, int prezzo) {
		if (idPizze.contains(id)) {
			throw new PiattoIDSbagliatoException();
		}
		idPizze.add(id);
	}	
	
}
