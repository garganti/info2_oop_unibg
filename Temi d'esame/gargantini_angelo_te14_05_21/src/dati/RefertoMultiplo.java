package dati;

import prog.utili.Data;
import prog.utili.Sequenza;

// per rappresentare le coppie del referto string e valore
// ad esempio emoblobina 10
class DescrizioneValore{
	String descrizione;
	float  valore;
}

public class RefertoMultiplo extends Referto {

	Sequenza<DescrizioneValore> risultati = new Sequenza<DescrizioneValore>();
	
	public RefertoMultiplo(Data d, Paziente p) {
		super(d, p);
	}
	
	/**
	 * per aggiungere un risultato singolo
	 * @param descrizione descrizione del singolo risulato tipo "piastrine"
	 * @param valore valore del rferto singolo come numero
	 */
	public void addRisultato(String descrizione, float valore) {
		DescrizioneValore descrizioneValore = new DescrizioneValore();
		descrizioneValore.descrizione = descrizione;
		descrizioneValore.valore = valore;
		risultati.add(descrizioneValore);
	}

	@Override
	public double criticity() {
		// calcolo la media e il massimo
		float max = 0; // assumo che tutti i valori siano maggiori di 0
		float somma = 0;
		int n = 0;
		for(DescrizioneValore c : risultati) {
			if (c.valore > max) max = c.valore;
			somma += c.valore;
			n++;
		}
		// se n è uguale a 0 non risco a calcolare la criticità
		if (n == 0) return 0;
		return (max - (somma/n)) * 10;
	}

	@Override
	public boolean validity() {
	}

	
	
	

}
