import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2C {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		int n1= in.readInt("Inserisci primo numero");
		int n2 = in.readInt("Inserisci secondo numero");
		
		out.print("La somma è: " + (n1+n2));
	}
}
