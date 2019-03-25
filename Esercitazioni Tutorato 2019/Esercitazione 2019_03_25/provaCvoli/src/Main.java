
import eccezioni.ExistIDException;
import eccezioni.PrenotazioneEsistenteException;
import eccezioni.VoloPienoException;
import prenotazioni.*;
import prog.utili.Data;
import voli.*;

public class Main {

	public static void main(String[] args) throws VoloPienoException, NumberFormatException, ExistIDException, PrenotazioneEsistenteException {
		Data d1 = new Data();
		GestorePrenotazioneVoli primoGestore = new GestorePrenotazioneVoli();

		System.out.println("1.LETTURA DA FILE");
		primoGestore.caricaDaFile("data.txt");
		primoGestore.stampa();

		// 2.inserimento volo
		System.out.println("2.INSERIMENTO VOLI CON STAMPA PER CONTROLLO \n");
		primoGestore.inserisciVolo("WAS", "NYC", d1, 3);
		primoGestore.inserisciVolo("BWI", "BER", d1, 3);
		primoGestore.inserisciVolo("WAS", "CDG", d1, 3);

		//primoGestore.inserisciVolo("WAS", "CDG", d1, 2,1); --> ID esistente
		System.out.println(primoGestore.toString());

		// 3.inserimento prenotazione
		primoGestore.inserisciPrenotazione(new PrenotazioneIndividuale("BOSIS", "ROLANDO", "CORRIDOIO", 3), 1);
		primoGestore.inserisciPrenotazione(new PrenotazioneIndividuale("BOSIS", "Walter", "FINESTRINO", 9), 1);
		primoGestore.inserisciPrenotazione(new PrenotazioneIndividuale("cambia", "ciccio", "CORRIDOIO", 5), 1);
		// 6.stampa voli con prenotazioni
		System.out.println("\n\n3.ESEGUITO \n6.STAMPA VOLI CON PRENOTAZIONI E COSTI\n");
		primoGestore.stampa();
		System.out.println("7. RICERCA VOLI \n");

		Volo v1 = primoGestore.cercaOrigine("BGY");
		System.out.println(v1.toString());
	}

}
