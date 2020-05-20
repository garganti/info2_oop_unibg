import java.util.Arrays;

public class MergeSorter {

	// ordina a (sul posto) utilizzando il merge sort
	static void mergesort(int[] a) {
		// utiliziamo un helper in cui diciamo qualche patrte di a si deve ordinare
		mergesort(a, 0, a.length - 1);
	}

	// ordina a da min a max (compreso)
	static void mergesort(int[] a, int min, int max) {
		System.out.println("sort da "+ min + " a " + max + " array" + Arrays.toString(a));
		// se ho solo 1 elemento da ordinare ho finito
		if (min == max)	return;
		//
		int med = (min + max) / 2;
		// ordiniamo la prima metà
		mergesort(a, min, med); // ricorsiva
		// ordino la seconda meta
		mergesort(a, med + 1, max);
		// merge delle due parti
		merge(a,min,med,max);
	}

	// a da merge
	// prima parte (ordinata) va da min a med
	// seconda parte (ordinata) va da med +1 a max (compreso)
	// risultato è far eil merge in a delle due parti in modo che siano ordinati
	private static void merge(int[] a, int min, int med, int max) {	
		System.out.println("merge da "+ min + " med " + med + " end " + max + " array" + Arrays.toString(a));
		int sx = min;
		int dx = med +1;
		int temp[] = new int[max-min+1];
		// faccio il merge in un array temporaneo
		for(int i= 0; i < temp.length; i++) {
			// quando devo copiare l'elemento di sx in temp
			// 1. se a dx non ho più elementi  dx > max
			// oppure 2. ho ancora qualche elemento a sx da copiare (sx <= med)
			// e questo elemento è minore dell'elemento alla posizione dx
			if (dx > max || sx <= med && a[sx]<a[dx]) {
				// copio l'elemento di sinistra
				temp [i] = a[sx];
				sx ++;
			} else {
				// copio quello di destra
				temp[i] = a[dx];
				dx ++;
			}
		}
		// ricopiare gli elementi in a
		for(int i = 0; i < temp.length; i++) {
			a[min+i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int a[] = {1,6,4,9,2};
		System.out.println(Arrays.toString(a));
		mergesort(a);
		System.out.println(Arrays.toString(a));
	}
	
}
