package tasse_Es39;

import java.util.List;

public class Studente extends Persona {
	
	private Integer matricola;
	private List<Esame> esami;
	private Double mediaVoti;
	
	public Studente(String nome, String cognome, Integer matricola, List<Esame> esami) {
		super(nome, cognome);
		this.matricola=matricola;
		this.esami=esami;
	}
	
	public Double getMediaVoti() {
		double sum = 0;
		for (Esame e : esami) sum += e.voto;
		return mediaVoti = sum / esami.size();
	}
	
	public double getTasse(int tassaMassima, int fascia) {
		int sconto = 0;
		switch (fascia) {
		case 1: sconto = 50; break;
		case 2: sconto = 35; break;
		case 3: sconto = 25; break;
		case 4: sconto = 10; break;
		default: sconto = 0;
		}
		return getTasse(tassaMassima) * (100-sconto) / 100.0;
	}

	public double getTasse(int tassaMassima) {
		int sconto = 0;
		getMediaVoti();
		if (mediaVoti>=29.5) sconto = 10;
		else if (mediaVoti>=28.5) sconto = 8;
		else if (mediaVoti>=27.5) sconto = 6;
		else if (mediaVoti>=26.5) sconto = 4;
		return tassaMassima * (100-sconto) / 100.0;
	}
	
	@Override
	public String toString() {
		return "Stud "+matricola+" "+super.toString();
	}

}
