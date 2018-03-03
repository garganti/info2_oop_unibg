

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/* domanda all'utente una frase e calcola e scrive il 
 * numero di vocali in totale
 */
public class OccorrenzeVocali {

	public static boolean isVocale(char c) {
		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'o':
		case 'O':
		case 'i':
		case 'I':
		case 'u':
		case 'U':
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String line = in.readLine("leggi frase");
		//
		int vocCounter = 0;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			/*
			 * boolean v = isVocale(c); if (v){ vocCounter ++; }
			 */
			// vocCounter = isVocale(c) ? vocCounter +1 : vocCounter;
			vocCounter = vocCounter + (isVocale(c) ? 1 : 0);
		}
		out.println("numero vocali " + vocCounter);

	}

}
