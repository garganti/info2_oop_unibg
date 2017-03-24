package esercitazione_17_03_24;

import java.util.StringTokenizer;

import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Esercizio3 {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		out.println(prodotto("3/4;1/2"));
	}
	
	public static Frazione prodotto(String s) {
		String[] fraz = s.split(";");
		Frazione prod = new Frazione(1);
		for (int i=0; i<fraz.length; i++) {
			StringTokenizer st = new StringTokenizer(fraz[i], "/");
			int num = Integer.parseInt(st.nextToken());
			int den = Integer.parseInt(st.nextToken());
			Frazione f = new Frazione(num, den);
			prod = prod.per(f);
		}
		return prod;
	}
}
