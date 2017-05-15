package cap11_egi;

import java.util.Arrays;

public class MergeSorter {

	/** ordina l'array a nella parte da min a max (compreso) */
	void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	/** ordina l'array a nella parte da min a max (compreso) */
	void sort(int[] a, int min, int max) {
		System.out.println("sorting" + Arrays.toString(a) + " min "+ min + " max" + max);
		// base: se ho finito - ordina una sola posizione
		if (min == max)
			return;
		// altrimenti
		int middle = (max + min) / 2;
		sort(a, min, middle);
		sort(a, middle + 1, max);
		merge(a, min, middle, max);
	}

	private void merge(int[] a, int min, int middle, int max) {
		System.out.println("merging" + Arrays.toString(a) + " min "+ min + " middle "+ middle + " max" + max);
		int sx = min;
		int dx = middle +1;
		int[] temp = new int[max-min+1];
		for(int i = 0; i < temp.length; i++){
			// metto nella posizione temp[i]?
			// copio da sx?
			if (dx > max || (sx <= middle && a[sx] < a[dx])){
				temp[i]= a[sx];
				sx++;
			} else{
				temp[i] = a[dx];
				dx++;
			}
		}
		// copio temp in a
		for(int i = 0; i < temp.length; i++){
			a[min+i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		int[] a = {7,0,8,5,9,1};
		new MergeSorter().sort(a);
		System.out.println(Arrays.toString(a));
	}

}
