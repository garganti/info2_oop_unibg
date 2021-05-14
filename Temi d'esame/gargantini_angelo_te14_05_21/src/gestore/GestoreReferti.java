package gestore;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import dati.Paziente;
import dati.Referto;

// classe principale che contiene
// tutti i referti del laboratorio
public class GestoreReferti {

	// memorizzo tutti i referti
	private List<Referto> referti = new ArrayList<>();
	
	public void leggiDaDile() {
		// TODO Auto-generated method stub

	}
	
	// inserisce il referto passato come argomento
	public void inserisciReferto(Referto r) {
		referti.add(r);
	}
	
	// cancella tutti i referti di un dato paziente
	// passato l'id (oppure altre soluzioni possibili)
	public void cancella(int pazienteID) {
		//  uso il'iteratore perchè la rimozione con il ciclo for each ha problemi
		//
		for (Iterator<Referto> iterator = referti.iterator(); 
				iterator.hasNext();) {
			Referto r = iterator.next();
			if (r.getPazienteID() == pazienteID) {
				iterator.remove();
			}
		}
	}

	public void stampaGruppoPaziente() {
		System.out.println("*** referti per paziente ***");
		// trova tutti i pazienti (i loro id)
		List<Integer> pazienti = new ArrayList<>();
		for(Referto r: referti) {
			pazienti.add(r.getPazienteID());
		}
		// stampo per pazienti
		for(int pid: pazienti) {
			System.out.println("paziente : " + pid);
			for(Referto r: referti) {
				if (r.getPazienteID() == pid)
					System.out.println(r);
			}
		}
	}
	
	public void stampaPerData() {
		System.out.println("*** referti per data ***");
		// ordinare per data
		Collections.sort(referti);
		// alternativamente SequenzaOrdinata, oppure scrivere voi l'ordimento
		for(Referto r: referti) {
			System.out.println(r);
		}
	}
	
	public void stampaPerCriticita(){
		// TODO usa Comparator
	}
}

