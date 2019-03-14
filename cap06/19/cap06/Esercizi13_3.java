package cap06;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class A{}

class B{}

class Esercizi13_3 {

	public static void main(String[] args) {
		Esercizi13_3 e = new Esercizi13_3();
		System.out.println(e.toString());

		/*
		 * Rettangolo r = new Rettangolo(7, 8);
		 * 
		 * Object o = (Rettangolo) r;
		 * 
		 * Rettangolo r2 = (Rettangolo) r;
		 */

		Rettangolo r = Math.random() > 0.5 ? new Quadrato(4) : new Rettangolo(8, 9);
		System.out.println(r.getClass().getSimpleName());
		r.getArea();
		if (r instanceof Quadrato) {
			Quadrato q = (Quadrato) r;
			System.out.println(q.getLato());
		} else {
			System.out.println("non è un quadrato non ha lato");
		}
	}

}
