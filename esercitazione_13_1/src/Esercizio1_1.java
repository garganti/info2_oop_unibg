import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// conteggio vocali
public class Esercizio1_1 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String stringaLetta = in.readLine("inserisci una frase");
		// stampo il risultato
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println("la frase contiene " + contaVocali(stringaLetta)
				+ " vocali");
	}

	// restitusce le vocali in s
	static int contaVocali(String s) {
		// conto le vocali:
		int contaVoc = 0;
		for (int i = 0; i < s.length(); i++) {
			char iesimo = s.charAt(i);
			if (isVocale(iesimo)) {
				contaVoc++;
			}
		}
		return contaVoc;
	}

	// dato un carattere dice se è vocale o no
	static boolean isVocale(char c) {
		if (c == 'a' || c == 'A' || c == 'i' || c == 'I' || c == 'o'
				|| c == 'O' || c == 'u' || c == 'U' || c == 'e' || c == 'E')
			return true;
		else
			return false;
	}
}
