package esercitazioe2_2019;

import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.utili.Sequenza;

public class Es11Sequenza {
	
	public static void main(String[] args) {
		String numeri = "5;6;90;78;1";
		// -> calcola la somma
		int somma = 0;
		String[] tokens = numeri.split(";");
		ArrayList<Integer> nn = new ArrayList<>();
		for(String n: tokens) {
			nn.add(Integer.parseInt(n));
		}
		System.out.println(nn);
		System.out.println(somma);
		// cerca il massimo in un vector
		// assumi che il massimo sia il primo elemento
		int max = nn.get(0);
		for(int i = 1; i < nn.size(); i++) {
			// cambio massimo
			if (nn.get(i)> max) max = nn.get(i);
		}
	}

}
