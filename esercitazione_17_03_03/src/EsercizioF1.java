import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class EsercizioF1 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int n = 1;
		int d = 3;
		Frazione f1 = new Frazione(n, d);
		Frazione f2 = new Frazione(2, 3);
		// calcolo della somma di f1 + f2
		Frazione f3 = f1.piu(f2);
		out.print("la somma è ");
		out.println(f3);		
	}
}
