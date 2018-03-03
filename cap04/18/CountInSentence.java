

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/** doimanda ll'utente una frase e scrivi
 * quante lettere maiuscole e quanti numeri ci sono in esssa
 */
public class CountInSentence {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String frase = in.readLine("inserisci una frase");
		int nlm = 0;
		int nn = 0;
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (Character.isUpperCase(c)) nlm ++;
			nn += Character.isDigit(c) ? 1 : 0;
		}
		System.out.println("numero di lettere maiuscole" + nlm);
		System.out.println("numero di numeri " + nn);
		
	}

}
