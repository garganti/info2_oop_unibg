package esercitazioe2_2019;

import java.util.StringTokenizer;

public class Es11 {
	
	public static void main(String[] args) {
		String numeri = "5;6;90;78;1";
		// -> calcola la somma
		int somma = 0;
		StringTokenizer st = new StringTokenizer(numeri, ";");
		// fino a quando non ho finito di scorrere la string
		while(st.hasMoreTokens()) {
			// prendi il prossimo elemento
			String n = st.nextToken();
			// elabora
			somma = somma + Integer.parseInt(n);
		}
		System.out.println(somma);
		
	}

}
