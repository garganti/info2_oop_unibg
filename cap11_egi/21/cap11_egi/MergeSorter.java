package cap11_egi;

import java.util.Arrays;

public class MergeSorter {

// ordina l'array a
	static void mergeSort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

// ordina 'array a nella porzione da min a max (compresi)
	private static void mergeSort(int[] a, int min, int max) {
		// BASE della ricorsione
		if (min >= max)
			return;
		int middle = (max + min) / 2;
		mergeSort(a, min, middle);
		mergeSort(a, middle + 1, max);
		merge(a, min, middle, max);
	}

// assume che la parte di a tra min e med sia ordinato
// e così anche tra med +1 e max
// fonde le due parti mettendo la fuzione tra min e max
	private static void merge(int[] a, int min, int med, int max) {
		// prendo due indici
		int sx = min, dx = med + 1;
		int[] temp = new int[max - min + 1];
		int i = 0;
		while (i < temp.length) {
			// copio l'elemento di sinistra nell'array temporaneo
			if (dx > max || (sx <= med && a[sx] < a[dx])) {
				// copio l'elemento di sinistra
				temp[i++] = a[sx++];
			} else {
				// copio l'elemento di destra
				temp[i++] = a[dx++];
			}
		}
		// ricopio temp in a
		for (i = 0; i < temp.length; i++) {
			a[min + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int a[] = {5,2,9,23,6,1,89};
		System.out.println(Arrays.toString(a));
		mergeSort(a);
		System.out.println(Arrays.toString(a));		
	}
}
