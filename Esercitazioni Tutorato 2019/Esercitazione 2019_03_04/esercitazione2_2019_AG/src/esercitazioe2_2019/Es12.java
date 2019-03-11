package esercitazioe2_2019;

import prog.utili.Frazione;

public class Es12 {

	public static void main(String[] args) {
		String s = "3/4;5/6;7/8";
		// separo le frazioni tra di loro
		String[] frazioni = s.split(";");
		Frazione prodotto = new Frazione(1);
		for(String fraz:frazioni) {
			// fraz -> NUM/DEN
			String[] nd = fraz.split("/");
			int num = Integer.parseInt(nd[0]);
			int den = Integer.parseInt(nd[1]);
			prodotto = prodotto.per(new Frazione(num , den));
		}
		System.out.println(prodotto);
	}
}
