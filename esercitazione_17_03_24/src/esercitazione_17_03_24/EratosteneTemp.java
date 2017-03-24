package esercitazione_17_03_24;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class EratosteneTemp {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int n = in.readInt("numero di numeri primi?");
		
		boolean[] multiplo = new boolean[n];
		// multiplo[i] vero se e solo se i non è primo
		for(int i=2; i < multiplo.length; i++){
			// se i è primo
			if (!multiplo[i]){
				// tutu i multipli di i
				for(int j = i+i; j < multiplo.length; j +=i){
					multiplo[j] = true;
				}
			}
		}
		for(int i = 2; i < multiplo.length; i++){
			if (!multiplo[i]) 
				out.print(i+ " ");
		}

	}
}
