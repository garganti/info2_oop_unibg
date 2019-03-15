package esercitazioe2_2019;

import java.util.Arrays;

import prog.io.ConsoleInputManager;

public class EsCrivello {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int N = in.readInt("fino a che numero vuoi calcolare i numeri primi?");
		// creo uno struttura per etichettare
		boolean[] multiplo = new boolean[N];
		for(int n = 2; n < N; n++) {
			// controllo se n è primo
			if (!multiplo[n]) {
				// n è primo
				// devo escludere tutti i multipli di n
				for(int i = 2*n; i < N ; i += n) {
					// i -> n -> 2n -> 3n
					multiplo[i] = true;
				}
			}
			System.out.println(Arrays.toString(multiplo));
		}
		// stampo i numeri primi
		for(int i = 2; i < N; i++) {
			if (!multiplo[i]) System.out.println("primo " + i);
		}
		
	}
}
