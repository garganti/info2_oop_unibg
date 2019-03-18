package esercizio34;

import java.util.ArrayList;

public class Volo {

	private String id;
	String da;
	String a;
	int numeroPostiE;
	int numeroPostiP;
	ArrayList<Passeggero> passeggeri;
	private static int idNumero = 1;
	private static char idCarattere = 'A';

	Volo(String parteza, String arrivo, int pE, int pP) {
		id = idNumero + ":" + idCarattere;
		// incrementa i contatori per gli ID
		if (idCarattere == 'Z') {
			idCarattere = 'A';
			idNumero++;
		} else
			idCarattere++;
		//
		this.da = parteza;
		this.a = arrivo;
		numeroPostiE = pE;
		numeroPostiP = pP;
		passeggeri = new ArrayList<>();
	}

	public void aggiungiPasseggero(Passeggero s) throws ExceedingPassengerCapacityExcp {
		// controllo che si sia posto
		if (s.getClasse() == 'E') {
			if (numeroPostiE > 0) {
				passeggeri.add(s);
				numeroPostiE--;
			} else {
				throw new ExceedingPassengerCapacityExcp("posti in classe economica finiti");
			}
		} else if (s.getClasse() == 'P') {
			if (numeroPostiP > 0) {
				passeggeri.add(s);
				numeroPostiP--;
			} else {
				throw new ExceedingPassengerCapacityExcp("posti in prima classe finiti");
			}
		}
	}
	/** rimuove passeggere con id, lancia eccezione se non trovato */
	public void rimuoviPasseggero(int id) throws PassengerNotFoundException{
		for(int i = 0; i < passeggeri.size() ; i++) {
			if (passeggeri.get(i).idBiglietto == id) {
				// rimuoverlo
				passeggeri.remove(i);
				return;
			}
		}
		// il passeggero non è stato trovat
		throw new PassengerNotFoundException();
	}

}
