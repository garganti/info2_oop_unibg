
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
		
		long l = 1000000000000000001L;
		System.out.println(l);
		System.out.println((double)l);
		
	}
}
