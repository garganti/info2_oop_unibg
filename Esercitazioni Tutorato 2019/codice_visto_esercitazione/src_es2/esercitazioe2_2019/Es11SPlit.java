package esercitazioe2_2019;

import java.util.StringTokenizer;

public class Es11SPlit {
	
	public static void main(String[] args) {
		String numeri = "5;6;90;78;1";
		// -> calcola la somma
		int somma = 0;
		String[] tokens = numeri.split(";");
		for(String n: tokens) {
			somma += Integer.parseInt(n);
		}
		System.out.println(somma);
		
	}

}
