package dado;

import java.util.Random;

// dado a N facce
public class Dado {

	static Random rnd = new Random();

	int nFacce;
	
	public Dado(int n) {
		nFacce = n;
	}
	public Dado(){
		this(6);
	}
	// restituisce un valore a caso tra 1 e 6
	public int lancio() {
		return 1 + (int)(Math.random()*nFacce);
		//return 1 + rnd.nextInt(6);
	}

	public static void main(String[] args) {
		Dado miod = new Dado(10);
		Dado dadoPC = new Dado();
		for (int i = 0; i < 100; i++) {
			System.out.print(miod.lancio());
			System.out.print(" ");
			System.out.println(dadoPC.lancio());
		}
	}

}
