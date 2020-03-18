package cap04;

import prog.io.ConsoleInputManager;
// domandiamo un serie di numeri terminati da -1
// calcoliamo la media
public class CalcolaMedia {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int somma = 0;
		int x = 0;
		while(true) {
			int n = in.readInt("?");
			if (n ==-1) break;
			somma += n; x++;			
		}
		// conversione esplicita per forzare 
		// la divsione tra double
		System.out.println("media " + somma/(double)x);
		System.out.println("media " + (double)somma/x);
		// non va bene
		System.out.println("media " + (double)(somma/x));
	}

}
