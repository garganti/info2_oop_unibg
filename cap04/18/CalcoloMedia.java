

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class CalcoloMedia {

	/** domanda voti all'utente, se inserisce 0 esci */
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int somma = 0;
		int nvoti;
		for (nvoti = 0;; nvoti++) {
			int voto = in.readInt("voto (0 per finire)?");
			if (voto == 0)
				break;
			somma += voto;
		}
		out.println("la media è:" + (somma / (float) nvoti));

	}

}
