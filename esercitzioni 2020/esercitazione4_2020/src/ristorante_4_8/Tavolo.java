package ristorante_4_8;

import java.util.ArrayList;
import java.util.List;

import javax.activity.InvalidActivityException;

public class Tavolo {

	private int numerocomperti;
	
	private List<Piatto> piattiOrdinati;
	private List<Persona> personeAlTavolo;
	
	public Tavolo(int nc) {
		this.numerocomperti = nc;
		piattiOrdinati = new ArrayList<Piatto>();
		personeAlTavolo = new ArrayList<Persona>();
	}

	/**
	 * 
	 * @param p
	 * @throws Exception 
	 */
	public void addPiatto(Piatto p) throws Exception {
		// 
		if (p==null)
			throw new Exception("p non può essere null");
		piattiOrdinati.add(p);
	}

	/**
	 * @param p persona da aggiungere
	 * @throws TavoloPienoException 
	 */
	public void aggiungi(Persona p) throws TavoloPienoException {
		if (personeAlTavolo.size() == numerocomperti)
			throw new TavoloPienoException();
		personeAlTavolo.add(p);
	}

	@Override
	public String toString() {
		return "pesone:" + personeAlTavolo;
	}
}
