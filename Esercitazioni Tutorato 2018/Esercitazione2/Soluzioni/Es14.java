

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es14 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int n = in.readInt("fino a che numero vuoi calcolare i numeri primi?");
		// array che mi dice se un numero è ultiplo di qualche altro numero
		// muliplo[i] <=> i non è primo
		boolean[] multiplo = new boolean[n];
		for (int i = 2; i < multiplo.length; i++) {
			// se i è primo
			if (!multiplo[i]) {
				// metto tutti i multipli
				for (int j = 2 * i; j < multiplo.length; j += i) {
					multiplo[j] = true;
				}
			}
		}
		// stampa
		for (int i = 2; i < multiplo.length; i++) {
			if (!multiplo[i]) {
				out.println(i);
			}
		}
	}
}
