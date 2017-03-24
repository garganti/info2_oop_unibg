package esercitazione1_14;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Palindroma {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String frase = in.readLine();
		ConsoleOutputManager out = new ConsoleOutputManager();

		out.print(" la frase \n:" + frase + " è palindroma "
				+ palindroma(frase));
	}

	private static boolean palindroma(String frase) {
		int l = 0;
		int r = frase.length() -1;
		while(l<r){
			char left = frase.charAt(l);
			if (left==' '){
				l++;
				continue;
			}
			char right = frase.charAt(r);
			if (right==' '){
				r--;
				continue;
			}
			if (left != right) return false;
			r--;
			l++;
		}
		return true;
	}

}
