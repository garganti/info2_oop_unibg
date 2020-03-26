package cap05;

import prog.io.ConsoleInputManager;

public class CrivelloEratostene {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int N = in.readInt("fino a che numero vuoi cercare i numeri primi?");
		// tengo traccia di quelli NON primi con un array di booleani
		boolean[] multipli = new boolean[N + 1];
		// primoindice cerca i numeri primi
		for (int i = 2; i <= N; i++) {
			// controllo se i è un numero primo
			if (!multipli[i]) {
				// trovato un numero primo, marco tutti i suoi multipli
				for (int j = i + i; j <= N; j += i) {
					multipli[j] = true;
				}
			}
		}
		for (int i = 2; i <= N; i++) {
			if (!multipli[i]) System.out.println(i + " è un numero primo");
		}
	}

}
