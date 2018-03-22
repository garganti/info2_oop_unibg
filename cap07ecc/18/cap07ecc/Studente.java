package cap07ecc;

public class Studente {

	public Studente(int m, String n, String c) throws Exception {
		// matricola deve essre > 0
		if (m <= 0)
			throw new Exception("matricola <= 0");
		if (n == null || n.length() <= 1)
			throw new Exception("nome troppo corto");
		if (c == null || c.length() <= 1)
			throw new Exception("conome troppo corto");
	}
	
	public static void main(String[] args) {
		try {
			Studente s = new Studente(-1, "jjk", "dddd");
		} catch (Exception e) {
			System.out.println("che cose hai scritto?");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
