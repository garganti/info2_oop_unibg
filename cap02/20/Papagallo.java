import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Papagallo {

	public static void main(String[] args) {
		// creare gli oggetti
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		// domando all'utente
		String testo = in.readLine("inseirsci una frase");
		out.println(testo);
	}

}
