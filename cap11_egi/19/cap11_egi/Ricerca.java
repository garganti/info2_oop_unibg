package cap11_egi;

import java.util.Arrays;

public class Ricerca {

	/**
	 * 
	 * @param a
	 * @param chiave
	 * @return posizione della chiave se presente, -1 altrimenti
	 */
	static int cerca1(int[] a, int chiave) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == chiave) {
				index = i;
				break; // return i
			}
		}
		return index;
	}

	// assumo che a sia ordinato
	static int cercaInOrdinato(int[] a, int chiave) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == chiave) {
				index = i;
				break; // return i
			} else if (a[i] > chiave) {
				break; // return -1
			}
		}
		return index;
	}

	// assumo che a sia ordinato
	static int cercaInOrdinatoDic(int[] a, int chiave) {
		return cercaInOrdinatoDic(a, 0, a.length - 1, chiave);
	}

	// cerca chiave in a tra low e high (compreso)
	static int cercaInOrdinatoDic(int[] a, int low, int high, int chiave) {
		System.out.println("cerca " + chiave + " da " + low + "a" + high + " in " + Arrays.toString(a));
		// caso base: l'array è vuoto - chiave non c'è
		if (low > high) return -1;
		// prende l'elemento in mezzo nella parte in cui cercare chiave
		int middle = (high + low) / 2;
		// se l'elemento in mezzo è la chiave, ho finito
		if (a[middle] == chiave)
			return middle;
		// altrimenti cerco a sx o ddx?
		if (a[middle] > chiave) {
			// cerca a sinistra (ad esempio chiave = 2 e a[middle] = 100
			return cercaInOrdinatoDic(a, low, middle - 1, chiave);
		} else {
			return cercaInOrdinatoDic(a, middle + 1, high, chiave);
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 9, 11, 14, 28 };
		System.out.println(cercaInOrdinatoDic(a, 4));
		System.out.println(cercaInOrdinatoDic(a, 28));
		System.out.println(cercaInOrdinatoDic(a, 15));
	}

}
