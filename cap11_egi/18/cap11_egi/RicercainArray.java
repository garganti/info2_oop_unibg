package cap11_egi;

import java.util.Arrays;

public class RicercainArray {

	/**
	 * 
	 * @param a
	 *            array in cui cercare ORDINATO
	 * @param c
	 *            elemento da cercare
	 * @return vero se trovato
	 */
	static public boolean cerca(int[] a, int c) {
		/*
		 * boolean trovato = false; for(int k: a) { if (k == c) trovato = true; } return
		 * trovato;
		 */
		for (int k : a) {
			System.out.println("ciclo confronto k = " + k);
			if (k == c)
				return true;
			else if (k > c) {
				return false;
			}

		}
		return false;
	}

	static public boolean cercaBin(int[] a, int c) {
		int sx = 0;
		int dx = a.length - 1;
		// cerco tra sx e dx
		while (sx <= dx) {
			// prendo indice elemento in mezzo
			int m = (sx + dx) / 2;
			System.out.printf("sx:%d dx %d m %d  \n", sx, dx, m);
			if (a[m] == c)
				return true;
			else if (a[m] > c) {
				// cerco a sinistra
				dx = m - 1;
			} else {
				assert a[m] < c;
				// cerco a destra
				sx = m + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 3, 10, 6 };
		System.out.println(Arrays.toString(a1));
		ordinaBS(a1);
		System.out.println(Arrays.toString(a1));
		System.out.println(cerca(a1, 1)); // --> true
		System.out.println(cerca(a1, 5)); // --> false
		System.out.println(cerca(a1, 2)); // --> false
		System.out.println(cerca(a1, 100)); // --> false
		// uso binaria
		System.out.println(cercaBin(a1, 1)); // --> true
		System.out.println(cercaBin(a1, 5)); // --> false
		System.out.println(cercaBin(a1, 2)); // --> false
		System.out.println(cercaBin(a1, 100)); // --> false
	}

	/** ordina usando il bubble sort */
	private static void ordinaBS(int[] a1) {
		boolean ordinato;
		do {
			ordinato = true;
			for (int i = 1; i < a1.length; i++) {
				if (a1[i] < a1[i - 1]) {
					int temp = a1[i - 1];
					a1[i - 1] = a1[i];
					a1[i] = temp;
					ordinato = false;
				}
			}
		} while (!ordinato);
	}
}
