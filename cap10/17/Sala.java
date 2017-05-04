
// id viene generato al momento della creazione in modo univoco del 
// tipo s1, s2, s3 ,...

public class Sala {
	String id;

	final static String idprefix = "sala";
	
	static int numeroSaleCreate = 0;

	public Sala() {
		id = idprefix + (numeroSaleCreate + 1);
		numeroSaleCreate++;
	}

	public static void main(String[] args) {
		Sala a = new Sala();
		Sala b = new Sala();
		System.out.println( a.id + "   " + b.id);
		
	}
}
