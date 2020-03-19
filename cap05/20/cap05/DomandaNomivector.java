package cap05;

import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

public class DomandaNomivector {

	public static void main(String[] args) {
		// chiedi i nomi
		Vector<String> nomi = chiediNomi();
		// ristampa i nomi inseriti
		stampaNomi(nomi);
	}

	// chiedi i nomi
	public static Vector<String> chiediNomi() {
		ConsoleInputManager in = new ConsoleInputManager();
		// domanda nomi fino a quando l'utente inserisce ""
		//
		// NOO String nomi = new String[]
		Vector<String> nomi = new Vector<String>();
		for (;;) { // while(true)
			String n = in.readLine("inserisci un nome");
			if (n.equals(""))
				break; // interrompe
			nomi.add(n);
		}
		return nomi;
	}

	// stampa i nomi
	public static void stampaNomi(Vector<String> nn) {
		int size = nn.size();
		System.out.println("hai inserito " + size + " nomi");
		// stampo in ordine inverso
		for(int i = nn.size()-1; i>= 0; i--) {
			System.out.println(nn.get(i));
		}
		
	}

}
