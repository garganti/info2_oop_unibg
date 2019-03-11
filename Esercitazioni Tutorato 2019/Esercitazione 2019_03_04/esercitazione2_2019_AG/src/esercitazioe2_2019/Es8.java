package esercitazioe2_2019;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es8 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String s = in.readLine("?");
		String nuova = ""; // senza le vocali
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!isVocale(c))	
				nuova = nuova + c;
			// atrimenti non lo aggiungo
		}
		System.out.println(nuova);
	}
	
	static boolean isVocale(char c) {
		switch(c) {
		case 'A':
		case 'E':
		case 'I':
			return true;
		}
		return false;
	}

}
