package esercitazioe2_2019;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es10 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String s = in.readLine("?");
		String sM = s.toLowerCase();
		// ciclo sulla lettera da cercARE
		for(char c= 'a'; c <'z'; c++) {
			Integer counterC = 0; // autoboxing primitivo -> wrapper
			for(int i= 0; i< sM.length(); i++) {
				if (sM.charAt(i) == c) counterC++;
			}
			// stampo frequanza solo per i caratteri nella string
			if (counterC>0) {
				out.println(c + " -> " + counterC);
			}
		}
	}

}
