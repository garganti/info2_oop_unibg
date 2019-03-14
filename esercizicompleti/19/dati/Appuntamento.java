package dati;

import prog.utili.Data;
import prog.utili.Orario;

public class Appuntamento {
	
	private String descrizione;

	private Data giorno;
	private Orario inizio, fine;
	
	public Appuntamento(String descrizione, String day, String start, String end) {
		this.descrizione = descrizione;
		this.giorno = new Data(day);
		inizio = new Orario(start);
		fine = new Orario(end);
	}
	
	@Override
	public String toString() {
		return giorno + " " + inizio + "->" + fine + ":" + descrizione;
	}

}
