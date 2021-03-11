import java.math.BigInteger;

import prog.utili.Frazione;

public class CastImpliciti {
	public static void main(String[] args) {
		int x = 0;

		long h = x; // cast (conversione) implicita
		//
		// vogliamo calcolare la media dei nostri voti
		//
		int v1 = 25, v2 = 30, v3 = 27;
		
		double media = (v1 + v2 + v3) /(double)3;
		
		System.out.println(media);
		
		
		System.out.println((int)Math.PI);
		
		System.out.println((byte)12345);
		
		long l = 1000000000000000123L;
		System.out.println(l);
		double d = l;
		System.out.println(d);
		
		//BigInteger bg 
		
		
		String s = "ciao" + 3 +7;
		String s2 = 3 + 7 + "ciao";
		
		
		Frazione f = new Frazione(5,6);
		
		String s3 = " il risultato è " + f.toString();		
		// equivalente
		String s4 = " il risultato è " + f;
		
		
	}
}
