package cap07ecc;

public class FinallyExample {

	public static void main(String[] args) {

		try {
			System.out.println("open connection ");
			System.out.println("write data " + (8 / (int)(Math.random() * 2)));
			System.out.println("data written");
		} catch (Exception e) {
			System.err.println("errore nella scrittura");
			return;
		} finally {
			// il codice che viene eseguito comunque sia che sia che si completi 
			// il blocco try sia in caso di eccezioni
			System.out.println("close connection");
		}
		System.out.println("continue computation ... ");
	}

}
