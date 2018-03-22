package cap07ecc;

public class Frazione {

	
	public Frazione(int n, int d) {
		if (d == 0 ) throw new ArithmeticException("denominatore nullo");
	}
}
