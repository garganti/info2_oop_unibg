package cap7;

public class provaecc {
	public static void main(String[] args) {
		int x = 6;
		int y = 0;

		try {
			int[] ii = new int[10];
			ii[10] = 90;
			int h = x / y;
			System.out.println("risultato è " + h);
		} catch (ArithmeticException ae) {
			System.err.println("attento");
		} catch (IndexOutOfBoundsException io){
			// ...
			System.err.println("attento attento");
		}

		System.out.println("finito");

	}

}
