package cap11_egi;

import java.util.Arrays;

public class MergeSort {

	// ordina l'array a dalla posizione min a max
	static void mergeSort(int[] a, int min, int max) {
		// se la parte da ordinale è un solo elemento, ho finito
		if (min == max)
			return;
		// altrimenti scelgo un elemento in centro
		int middle = (max + min) / 2;
		// ordiniamo gli elementi da min a middle
		mergeSort(a, min, middle);
		// ordino gli altri
		mergeSort(a, middle + 1, max);
		// a questo punto gli elementi da min a middle e da middle a max
		// sono ordinati tra di loro nelle due parti
		merge(a, min, middle, max);
	}

	// assume a ordinato da min a middle e da middle +1 a max
	// merge gli elementi di a da min a max
	private static void merge(int[] a, int min, int middle, int max) 
{
		// scorro i due sotto array con sx e dx
		int sx = min, dx = middle + 1;
		// array di support che conterrà gli elementi merged
		int temp[] = new int[max - min + 1];
		for (int i = 0; i < temp.length; i++) {
			// copio quello di sinistra se minore oppure 
			// ho copiayto guià tutti quelli di destra
			// ma non ho cpiato ancora tutti quelli di sinistra
			if (dx > max  || (a[sx] < a[dx] && sx <= middle))  {
				// copio a[sx] e avanzo sx
				temp[i] = a[sx];
				sx++;
			} else {
				// copio a{dx} e avanzo dx
				temp[i] = a[dx];
				dx++;
			}
		}
		// ricopio temp dentro in a
		for (int i = 0; i < temp.length; i++) {
			a[i + min] = temp[i];
		}
	}

	// ordina l'array
	static void mergeSort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 5, 4 };
		System.out.println(Arrays.toString(a));
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
}
