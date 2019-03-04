import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class UsoInOout {
	// domando all'utente due numeri interi e stampo la somma
	// usiamo ConsoleInputManager e ConsoleOutpurManager
	public static void main(String[] args) {
		// per domandare info in console usiamo ConsoleInputManager
		ConsoleInputManager in = new ConsoleInputManager();
		int a = in.readInt("inserisci il primo numero");
		int b = in.readInt("inserisci il secondo numero");
		int somma = a +b;
		// per stampare invece che System.out uso COnsoleOutputM.
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.print("la somma è:");
		out.println(somma);
	}

}