package cap05;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

// domanda all'utente le frazioni una a una
// se scrive "finito" smetti
// stampa il contenuto della sequenza
// calcola la somma
public class InserisciFrazioniSequenza {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		//
		// Sequenza<Frazione> frazioni = new Sequenza<>();
		SequenzaOrdinata<Frazione> frazioni = new SequenzaOrdinata<>();
		// domando le nf frazioni
		for (;;) {
			out.println("inserisci la frazione (exit per uscire)");
			String nl = in.readLine("numeratore (exit per uscire)?");
			if (nl.equals("exit"))
				break;
			int n = Integer.parseInt(nl);
			int d = in.readInt("denominatore?");
			frazioni.add(new Frazione(n, d));
		}
		// stamp le frazioni
		for (Frazione f : frazioni) {
			out.println(f);
		}
		// calcolo della somma
		Frazione somma = new Frazione(0);
		for (Frazione f : frazioni) {
			somma = somma.piu(f);
		}
		out.println("la somma è " + somma);

	}

}
