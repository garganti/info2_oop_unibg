

public class Conversioni {
	public static void main(String[] args) {
		
		long l = 10000000000000000l;
		float f = l;
		System.out.println(l);
		System.out.println(f);
		
		int g = (int)l;
		System.out.println(g);	
		
		double d = 100.0/0.0;
		System.out.println(d);
		double d2 = 0.0/0.0;
		System.out.println(d2);
		
		int k = 10/0;
	}

}
