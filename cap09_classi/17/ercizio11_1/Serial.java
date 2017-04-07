package ercizio11_1;

// una serie TV
public class Serial {

	String titolo;
	Episode first;

	public Serial(String n, Episode primo) {
		titolo = n;
		first = primo;
	}

	void stampaEpisodi() {
		System.out.println(" **** "+ titolo + " ****");
		Episode current = first;
		do {
			System.out.println(current.toString());
			current = current.prossimo;
		} while (current != null);
	}

	public static void main(String[] args) {
		Episode ga2 = new Episode("ga 2;paul tradisce mary");
		Episode ga1 = new Episode("ga 1;mary meets paul",ga2);

		Serial ga = new Serial("gray's anatomy", ga1);
		ga.stampaEpisodi();
	}

}
