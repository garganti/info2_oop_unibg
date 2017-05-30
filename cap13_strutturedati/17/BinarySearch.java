

import java.util.Arrays;

public class BinarySearch {
	// cerca x in a e restituisce la posizione se
	// trovato o altrimenti -1
	public static int cerca(int[] a, int x) {
		int i = 0; // sinistra
		int j = a.length - 1;// destra
		for (;;) {
			// log per vedere comportamento
			System.out.println("cerca in a "+ Arrays.toString(a) + "da "+ i + " a "+ j);
			int m = (i + j) / 2; // calcolo elemento centrale
			if (a[m] == x)
				return m;
			if (a[m] < x) {
				// cerco a destra
				i = m + 1;
			} else {
				// a[m]> x : cerco a sinistra
				j = m - 1;
			}
			if (j <i)
				return -1;
		}
	}
	public static void main(String[] args) {
		int[] test = {1,4,7,9,10};
		System.out.println(cerca(test, 10));
		System.out.println(cerca(test, 40));
	}

}
