

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class UsoEquals {
	
	// domanda una parola magica
	// e se è "atalanta"
	// ha accesso a dei comandi particolari
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String mw = in.readLine("inserisci la parola magica");
		// 
		if (mw.equals("atalanta")) {
			out.println("bravo ! hai accesso alla sezione riservata");
		} else {
			out.println("vai via!");
		}
		
		for(int i = 0, j = 10; i < 10 && j > 20 ; i++, j--) {
			
		}
		
	}

}
