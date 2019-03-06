package cap04;

public class Conversioni {

	public static void main(String[] args) {
		int x = 2000000000;
		int y = 2000000000;
		long h = y; // comversione implicita int -> long
		long z = x + y; // converisione implicita
		System.out.println(z);
		// convertire x e y PRIMA della somma
		// conversione esplicita
		long z2 = (long)y + (long)x;
		System.out.println(z2);

		long q = 7l;
		// da long a int
		int w = (int)q;
		
		// 
		double d1 = 9.6;
		int e = (int)d1;
		System.out.println("d1 " + d1 + " -> e " + e);
		
		double d2 = 99832055405408.6544545;
		int e2 = (int)d2;
		System.out.println("d2 " + d2 + " -> e2 " + e2);
		
		
	}

}
