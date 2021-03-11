
public class EsempiClassiWrapper {
	public static void main(String[] args) {
		
		
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println(Double.NaN);
		
		if ( 4.0 / 0.0 == Double.POSITIVE_INFINITY)
			System.out.println("CIAO");
		
		
		Integer x1 = new Integer(100);
		
		Integer x2 = Integer.valueOf(100);
		
		// parsing
		int x = Integer.parseInt("10");
		
		double g = Double.max(4, 5);
	}
}
