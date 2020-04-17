package ristorante_4_8;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {

	private int numerocomperti;
	
	private List<Piatto> piattiOrdinati;
	
	public Tavolo(int nc) {
		this.numerocomperti = nc;
		piattiOrdinati = new ArrayList<Piatto>();
	}

}
