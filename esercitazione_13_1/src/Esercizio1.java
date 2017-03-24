import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// conteggio vocali
public class Esercizio1 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String stringaLetta = in.readLine("inserisci una frase");
		// conto le vocali:
		int contaVoc = 0;
		for (int i = 0; i < stringaLetta.length(); i++) {
			char iesimo = stringaLetta.charAt(i);
			if (iesimo == 'a' || iesimo == 'A' || iesimo == 'i'
					|| iesimo == 'I' || iesimo == 'o' || iesimo == 'O'
					|| iesimo == 'u' || iesimo == 'U'
					|| iesimo == 'e' || iesimo == 'E') {
				contaVoc ++;
			}
		}
		// stampo il risultato
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println("la frase contiene "+ contaVoc + " vocali");
	}
	
}
