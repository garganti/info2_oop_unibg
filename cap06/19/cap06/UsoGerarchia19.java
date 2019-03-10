package cap06;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class UsoGerarchia19 {

	public static void main(String[] args) {
		// un programma che a caso costruisce un rettangolo o
		// un quadrato e stampa i dati
		Rettangolo r;
		if (Math.random() > 0.5) {
			r = new Rettangolo(5, 6);
		} else {
			r = new Quadrato(8);
		}
		System.out.println(r.toString());
		System.out.println(r.getArea());
		System.out.println(r.getPerimetro());
		System.out.println(r.getBase());

	}

}
