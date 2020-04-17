package ristorante_4_8;

import java.util.ArrayList;
import java.util.List;

public class Piatto {

	static List<String> idPizze = new ArrayList<String>();
	
	public Piatto(String id, int quan, int prezzo) {
		if (idPizze.contains(id)) {
			throw new RuntimeException("piatto con id già creato");
		}
		idPizze.add(id);
		
	}

}
