

import java.util.Arrays;

public class BinarySearchGen<T extends Comparable<T>> {
	// cerca x in a e restituisce la posizione se
	// trovato o altrimenti -1
	public int cerca(T[] a, T x) {
		int i = 0; // sinistra
		int j = a.length - 1;// destra
		for (;;) {
			// log per vedere comportamento
			System.out.println("cerca in a "+ Arrays.toString(a) + "da "+ i + " a "+ j);
			int m = (i + j) / 2; // calcolo elemento centrale
			int c = a[m].compareTo(x);
			if (c == 0)
				return m;
			if (c < 0) {
				// cerco a destra
				i = m + 1;
			} else {
				// c>0 : cerco a sinistra
				j = m - 1;
			}
			if (j <i)
				return -1;
		}
	}
	public static void main(String[] args) {
		String[] test = {"aa","bb","ccc","rrr","zzz"};
		System.out.println(new BinarySearchGen<String>()
				.cerca(test, "aaaa"));
	}

}
