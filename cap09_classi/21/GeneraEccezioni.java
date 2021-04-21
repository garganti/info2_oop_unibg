import java.io.IOException;

class FrazioneNonValidaException extends RuntimeException {

}

// frazione + eccezione 
class FrazioneP {
	int num, den;

	FrazioneP(int n, int d) throws IOException {
		if (d == 0) {
			System.err.println("non puoi mettere d = 0");
			// oltre al messaggio interrompo il costruttore
			// sollevare una eccezione
			// non controllata
			// RuntimeException e = new RuntimeException();
			// ArithmeticException e = new ArithmeticException();
			// controllata
			IOException e = new IOException();
			throw e;
			// personalizzata
			// throw new FrazioneNonValidaException();
		}
		num = n;
		den = d;
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

}

public class GeneraEccezioni {

	public static void main(String[] args) {
		try {
			FrazioneP f1 = new FrazioneP(1, 2);
			System.out.println(f1);
			FrazioneP f2 = new FrazioneP(5, 0);
			System.out.println(f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void fooo() {
		try {
			int y = 0;
			int x = 90;
			if (x > 0)
				throw new IOException("error");
			int H = x * y;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
