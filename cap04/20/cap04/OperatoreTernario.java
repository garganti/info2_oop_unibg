package cap04;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// domando all'utente un numero 
// scrivo pari o dispari con operatore ternario
public class OperatoreTernario {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int x = in.readInt("inserisci un numero");
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println(x % 2 == 0 ? "PARI" : "DISPARI");
		
		
	}

}
