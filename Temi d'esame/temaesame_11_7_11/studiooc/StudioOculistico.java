package temaesame_11_7_11.studiooc;

import prog.utili.Data;
import prog.utili.Sequenza;

public class StudioOculistico {

	Sequenza<Paziente> pazienti;

	StudioOculistico() {
		pazienti = new Sequenza<>();
	}

	// aggiunge
	void aggiuntaPaziente(String n, String c, Data d) {
		Paziente p = new Paziente(n, c, d);
		pazienti.add(p);
	}

	// cerca un paziente
	Paziente cerca(String n, String c) {
		for (Paziente p : pazienti) {
			if (p.nome.equals(n) && p.cognome.equals(c)) {
				return p;
			}
		}
		return null;
	}

	void aggiungiVisita(String n, String c, Visita v) {
		Paziente p = cerca(n, c);
		if (p == null) {
			throw new RuntimeException("non trovato");
		}
		p.aggiungiVisita(v);

	}

	void printPazienti() {
		for (Paziente p : pazienti) {
			System.out.println(p.toString());
		}

	}

}
