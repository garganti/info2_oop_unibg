import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Pappagallo {

	// chiede una frase e la ripete tale quale
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String frase = in.readLine("Frase?");
		out.print("\"");
		out.print(frase.toUpperCase());
		out.print("\"");
	}

}
