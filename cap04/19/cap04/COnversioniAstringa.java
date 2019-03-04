package cap04;

import prog.utili.Frazione;

public class COnversioniAstringa {
	public static void main(String[] args) {
		Frazione f = new Frazione(5,6);
		System.out.println("la mia frazione è " + f.toString());
		// conversione implifica a string cale anche per i riferimenti
		// --> 
		System.out.println("la mia frazione è " + f);
		
		
	}

}
