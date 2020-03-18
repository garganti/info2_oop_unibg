package cap04;

import prog.utili.Frazione;

public class Conversioni {

	public static void main(String[] args) {
		long h = 9000000000l;
		System.out.println(h);
		int j = (int)h;
		System.out.println(j);
		
		double f = 0.0/0.0;
		System.out.println(f);
		
		// conversioni implicita
		// perdiat di precisione
		int x = 10;
		float y = x; // implicta da int a float
		System.out.println(y);
		
		x = 1000000004;
		y = x; // implicta da int a float
		System.out.println(x);
		System.out.println(y);
		int l = (int)y;
		System.out.println(l);		
		
		Frazione fr = new Frazione(5);
		
		System.out.println("la frazione è " + fr);
		// --> fr viene convertito in stringa
		System.out.println("la frazione è " + fr.toString());
		
		String s = "pippo";
		System.out.println("benvenuto, " + s);
		
		
		char z = 'z';
		int nZ = z; // OK
		System.out.println(nZ);
		
		char t = (char) nZ;
		System.out.println(t);
		
	}

}
