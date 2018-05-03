import java.util.Arrays;

public class RicercaRicorsiva {

	/**
	 * @param a array in cui cercare
	 * @param c chiave da cercare
	 * @param pos a partire dalla posizione
	 * @return true se c è in a, false altrimenti
	 */
	static boolean cerca(int[] a, int c, int pos) {
		if (pos >= a.length) return false;
		if (a[pos] == c) return true;
		else return cerca(a,c,pos+1);
	}

	// a potrebbe essere non ordinato
	static boolean cerca(int[] a, int c) {
		return cerca(a, c, 0);
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 3, 10, 6 };
		System.out.println(Arrays.toString(a1));
		System.out.println(cerca(a1, 1)); // --> true
		System.out.println(cerca(a1, 5)); // --> false
		System.out.println(cerca(a1, 2)); // --> false
		System.out.println(cerca(a1, 100)); // --> false

	}

}
