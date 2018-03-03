

import prog.utili.Frazione;

public class Conversioni {
	public static void main(String[] args) {
		// conversioni a stringa
		
		Frazione f = new Frazione(0);
		
		System.out.println("frazione " + f.toString());
		// equivalente
		System.out.println("frazione " + f);

		
		int o = 90;
		int q = 100;
		System.out.println("oggi sono " + q);
		// equivalenti
		System.out.println("oggi sono " + Integer.toString(q));
		System.out.println("oggi sono " + String.valueOf(q));

		// attenzione la somma
		System.out.println("oggi sono " + q + o);
		System.out.println(("oggi sono " + q) + o);
		System.out.println("oggi sono " + (q + o));

		System.out.print("oggi sono ");
		System.out.println(q + o);

/*		
		
		// double

		double n = 0.0 / 0.0;
		System.out.println("n " + n);

		/// CONVERSIONI ESPLICITE
		double uno = 1.0;
		int unoi = (int) uno;
		System.out.println("uno " + unoi);

		double p = 3.145667;
		int pi = (int) p;
		System.out.println(" pi intero " + pi);

		long ll = -300000000000l;
		int lli = (int) ll;
		System.out.println(" ll intero " + lli);

		/// CONVERSIONI IMPLICITE
		int m = 0;
		long l = m;
		System.out.println("long " + l);
		//
		int sommavoti = 299;
		// int numero_esami = 10;
		double numero_esami = 10;
		double media = sommavoti / numero_esami;
		System.out.println("media " + media);
		//
		long di = 1111111111;
		float dif = di;
		System.out.println("debito " + di);
		System.out.println("debito " + dif);*/

	}

}
