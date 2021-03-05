package cap03;

import prog.io.ConsoleInputManager;

public class EsempioContbreak{
	
	
	// chiediamo all'utente un numero
	// se � 0 usciamo
	// se � pari lo sommiamo a somma
	// se dispari non facciamo nulla, ridomandiamo un altro numero
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int somma = 0;
		// ciclo infinito
		//while(true) {		
		for(;;) {
			int x = in.readInt("?");
			if(x == 0) break; // esce dal for
			// se x � dispari domanda un nuovo numero
			if (x%2 == 1) continue;
			// vuol dire che � pari
			somma += x;
		}
		System.out.println(somma);
		
	}
	
	
}