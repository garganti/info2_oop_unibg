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
	
	// per aggiungere un risultato singolo
	public void addRisultato(String descrizione, float valore) {
		DescrizioneValore descrizioneValore = new DescrizioneValore();
		descrizioneValore.descrizione = descrizione;
		descrizioneValore.valore = valore;
		risultati.add(descrizioneValore);
	}

	
	
	

}
