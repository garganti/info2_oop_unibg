package ospedale;

import java.util.ArrayList;
import java.util.List;

public class Reparto {

	String nome;
	String desc;
	List<Letto> listaLetti = new ArrayList<>();
	int numprogLetto = 1;
	int numstanza = 1;
	char tipoStanza = 'F';
	List<Paziente> listapazienti = new ArrayList<>();

	public Reparto(String nome, String desc) {
		this.nome = nome;
		this.desc = desc;
	}

	void aggiungiLetto() {
		listaLetti.add(new Letto(numprogLetto, numstanza, 1, tipoStanza)); // 1 letto libero
		numprogLetto++;
		if (numprogLetto % 4 == 0) {
			numstanza++;
			if (tipoStanza == 'F')
				tipoStanza = 'M';
			else
				tipoStanza = 'M';
		}
	}

	void aggiungiPaziente(Paziente p) {
		int lettoassegnato = 0;
		// scegli a quale letto assegnarlo
		for (int i = 0; i < listaLetti.size(); i++) {
			if (listaLetti.get(i).getLibero() == 1 && listaLetti.get(i).getTipoStanza() == p.getGenere()) {
				lettoassegnato = listaLetti.get(i).getNumprogLetto();
				listaLetti.get(i).setLibero(0);
				i = listaLetti.size();
			}
		}
		// assegna il letto al paziente
		if (lettoassegnato != 0) {
			p.setNumletto(lettoassegnato);
			// inserisci il paziente nella lista pazienti
			listapazienti.add(p);
		} else
			System.out.println("Letto non trovato");
	}

	void rimuoviPaziente(Paziente p) {
		for (int i = 0; i < listapazienti.size(); i++) {
			if (listapazienti.get(i).getCF() == p.getCF()) {
				listapazienti.remove(i);
				for (int j = 0; j < listaLetti.size(); j++)
					if (p.getNumletto() == listaLetti.get(i).getNumprogLetto()) {
						listaLetti.get(i).setLibero(1);
						j = listaLetti.size();
					}
				i = listapazienti.size();
			}
		}
	}

	void stampaPazienti() {
		ordinaListaPazienti();
		for (int i = 0; i < listapazienti.size(); i++) {
			System.out.println(listapazienti.get(i).getNumletto()+ " " + listapazienti.get(i).getCF());
			 for (int j=0; j<listapazienti.get(i).getElencoMedicine().size(); j++)
				 System.out.println(listapazienti.get(i).getElencoMedicine().get(j).getNome());
		}
	}

	private void ordinaListaPazienti() {
		boolean ordinato = true;
		do {
			ordinato = true;
			for (int i = 0; i < listapazienti.size() - 1; i++) {
				// confronto
				if (listapazienti.get(i).getNumletto()>listapazienti.get(i+1).getNumletto()) {
					// scambio
					Paziente temp = listapazienti.get(i);
					listapazienti.set(i, listapazienti.get(i + 1));
					listapazienti.set(i + 1, temp);
					ordinato = false;
				}
			}
		} while (!ordinato);
	}

}
