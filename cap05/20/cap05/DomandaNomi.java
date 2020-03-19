package cap05;

import prog.io.ConsoleInputManager;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

public class DomandaNomi {

	public static void main(String[] args) {
		// chiedi i nomi
		SequenzaOrdinata<String> nomi = chiediNomi();
		// ristampa i nomi inseriti
		stampaNomi(nomi);
	}

	// chiedi i nomi
	public static SequenzaOrdinata<String> chiediNomi() {
		ConsoleInputManager in = new ConsoleInputManager();
		// domanda nomi fino a quando l'utente inserisce ""
		//
		// NOO String nomi = new String[]
		SequenzaOrdinata<String> nomi = new SequenzaOrdinata<String>();
		for (;;) { // while(true)
			String n = in.readLine("inserisci un nome");
			if (n.equals(""))
				break; // interrompe
			nomi.add(n);
		}
		return nomi;
	}

	// stampa i nomi
	public static void stampaNomi(SequenzaOrdinata<String> nn) {
		int size = nn.size();
		System.out.println("hai inserito " + size + " nomi");
		for (String n : nn) {
			System.out.print(n + " ");
		}
	}

}
