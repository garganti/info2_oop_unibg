package gestore;

import telecamere.Telecamera;
import telecamere.TelecameraAllarme;
import telecamere.TelecameraNormale;

public class ProvaGestore {

	public static void main(String[] args) {
		GestoreTelecamere gt  = new GestoreTelecamere();
		Telecamera a1 = new TelecameraAllarme("bivio A4", 10.5f, "SONY");
		gt.addTelecamera(a1);
		Telecamera tn = new  TelecameraNormale("rettilineo", 20.5f);
		gt.addTelecamera(tn);
		Telecamera tn3 = new  TelecameraNormale("rettilineo", 30.5f);
		gt.addTelecamera(tn3);
		// stampa le telecamere
		gt.stampa();
		// opera su telecamere
		gt.opera(1, Operazione.SPEGNIMENTO);
		
		System.out.println("*******************");
		/// caso di lettera da file
		GestoreTelecamere gt2 = GestoreTelecamere.caricaTelecamereDaFile();
		gt2.stampa();
	}

}
