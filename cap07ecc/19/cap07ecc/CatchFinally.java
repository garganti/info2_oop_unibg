package cap07ecc;

import java.util.Random;

public class CatchFinally {
	
	static Random random = new Random();

	public static void main(String[] args) {
		try {
			int u = 10/random.nextInt(2);
			System.out.println("il valore è " + u);
			//
		} catch (IndexOutOfBoundsException e) {
			//
		} catch (ArithmeticException ae) {
			System.out.println(" non posso calcolarlo");
			//
		} catch (Exception e) {
			//
		} finally {
			// codice che viene esegutio sia con ecc che senza
			System.out.println("ritenta");
		}
	}
	
}
