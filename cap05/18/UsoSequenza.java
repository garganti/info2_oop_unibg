import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Sequenza;

/**
 * che domanda tante stringhe fino a quando non inserisce la stringa vuota e poi
 * le ristampa
 */
public class UsoSequenza {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		// dove memorizzare
		Sequenza<String> frasi = new Sequenza<>();
		do {
			String s = in.readLine("frase da inserire");
			if (s.equals("")) {
				break;
			}
			// altirmenti aggiungi in frase
			frasi.add(s);
		} while (true);
		// stampa le frasi inserite
		for(String i: frasi) {
			out.println(i);
		}
	}

}
