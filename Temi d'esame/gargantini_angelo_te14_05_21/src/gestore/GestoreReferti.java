package gestore;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import dati.Paziente;
import dati.Referto;
import dati.RefertoSingolo;
import dati.RisultatoReferto;
import prog.io.FileInputManager;
import prog.utili.Data;

// classe principale che contiene
// tutti i referti del laboratorio
public class GestoreReferti {

	// memorizzo tutti i referti
	private List<Referto> referti = new ArrayList<>();
	
	public void leggiDaDile() {
		FileInputManager fim = new FileInputManager("referti.txt");
		for(;;) {
			String line = fim.readLine();
			if (line == null) break;
			String[] data = line.split(";");
			// il primo mi dice il tipo di referto
			switch (data[0]) {
			case "S":
				// leggo la data del referto
				Data dataRef = new Data(data[1]);
				Paziente p = new Paziente(data[2]);
				RisultatoReferto ris = RisultatoReferto.valueOf(data[4]);
				RefertoSingolo ref = new RefertoSingolo(dataRef,p, data[3], ris);
				inserisciReferto(ref);		
				break;	
			default:
				System.out.println("linea non riconosciuta");
			}
		}
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
		System.out.println("*** referti per crtiticità ***");
		// ordinare per data
		Collections.sort(referti,new ComparatorPerCriticita());
		// alternativamente SequenzaOrdinata, oppure scrivere voi l'ordimento
		for(Referto r: referti) {
			System.out.println(r);
		}
	}
}

class ComparatorPerCriticita implements Comparator<Referto>{

	@Override
	public int compare(Referto o1, Referto o2) {
		return Double.compare(o1.criticity(), o2.criticity());
		//if (o1.criticity() > o2.criticity()) return 1;
		
	}
	
}
