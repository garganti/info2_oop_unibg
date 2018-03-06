import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2B {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		out.println(in.readLine("Inserisci una stringa: "));
	}
}
