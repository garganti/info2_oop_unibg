package gestore;

import telecamere.PosizioneOutOfBoundException;
import telecamere.Telecamera;
import telecamere.TelecameraAllarme;
import telecamere.TelecameraNormale;

public class ProvaGestore {

	public static void main(String[] args) {
		GestoreTelecamere gt  = new GestoreTelecamere();
		try {
			Telecamera a1 = new TelecameraAllarme("bivio A4", 10.5f, "SONY");
			gt.addTelecamera(a1);
			Telecamera tn = new  TelecameraNormale("rettilineo", 20.5f);
			gt.addTelecamera(tn);
			Telecamera tn3 = new  TelecameraNormale("rettilineo", 30.5f);
			gt.addTelecamera(tn3);
		} catch (PosizioneOutOfBoundException e) {
			System.err.println("Stano, non dovrebbe generare eccezione su questi esempi: "+e.getMessage());
			e.printStackTrace();
		}
		// stampa le telecamere
		gt.stampa();
		// opera su telecamere
		gt.opera(1, Operazione.SPEGNIMENTO);
		
		System.out.println("*******************");
		/// caso di lettera da file
		GestoreTelecamere gt2 = GestoreTelecamere.caricaTelecamereDaFile();
		gt2.stampa();
		
		//Tentativo di spegnere una telecamera allarmata (dovrebbe dare false)
		System.out.println("Tentativo di spegnere telecamera 4 (allarmata): "+gt2.opera(4, Operazione.SPEGNIMENTO));
		
		// Blocco immagine a una telecamera normale
		System.out.println("Tentativo di blocco immagine telecamera 3 (normale): "+gt2.opera(3, Operazione.BLOCCOIMMAGINE));
		// Spengo una telecamera normale:
		System.out.println("Tentativo di spegnimento telecamera 3 (normale): "+gt2.opera(3, Operazione.SPEGNIMENTO));
		// Spengo la telecamera normale adiacente (dovrebbe dare false perché non si può):
		System.out.println("Tentativo di spegnimento telecamera 3 (normale) adiancente a una spenta: "+gt2.opera(2, Operazione.SPEGNIMENTO));
		// Riaccendo una telecamera normale:
		System.out.println("Tentativo di riaccensione telecamera 3 (normale): "+gt2.opera(3, Operazione.ACCENSIONE));
		
		//Tentativo di bloccare una telecamera semplice (non si dovrebbe potere: dovrebbe dare false)
		System.out.println("Tentativo di spegnere telecamera 5 (semplice): "+gt2.opera(5, Operazione.BLOCCOIMMAGINE));
		
	}

}
