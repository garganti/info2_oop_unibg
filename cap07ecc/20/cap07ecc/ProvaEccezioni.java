package cap07ecc;

public class ProvaEccezioni {
	public static void main(String[] args) {
		try {
			int y = (int) (Math.random() * 10);
			int x = 10 / y;
			System.out.println(x);
			int a[] = { 6, 7, 8, 9 };
			System.out.println(a[y]);
		} catch (ArithmeticException e) {
			System.out.println("mi spiace y è zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("mi spiace non posso accedere a quella posizione");
		} catch (Exception e) {
			System.out.println("errore !");
		}

	}

}
