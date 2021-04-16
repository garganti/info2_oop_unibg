package cap07ecc;

import java.util.List;

class Aula {
	List<String> studenti;

	NullPointerException a;
}

public class GeneraEcc {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 4);
		System.out.println("x " + x + " y  " + y);
		try {
			stampadivisione(x, y);
			System.out.println("divisione fatta");
		} catch (NullPointerException e) {
			System.out.println("attenzione nul Pointer");
		} catch (ArithmeticException e) {
			System.out.println("attenzione nul Pointer");
		}catch (Exception e) {
			System.out.println("attenzione divisione con 0");
		}
		System.out.println("fine");

	}

	private static void stampadivisione(int x, int y) {
		System.out.println("x/y " + x / y);
	}

}
