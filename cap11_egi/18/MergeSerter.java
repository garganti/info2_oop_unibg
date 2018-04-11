import java.util.Arrays;

public class MergeSerter {

	/**
	 * @param a
	 *            array da ordinare (in parte)
	 * @param min
	 *            la prima posizione della parte da ordinare
	 * @param max
	 *            l'ultima posizione della parte da ordinare
	 */
	static void sort(int[] a, int min, int max) {
		// se la parte da ordinare ha solo 1 elemento non fare nulla
		if (min == max)
			return;
		// min < max
		// trovo l'elemento centrale
		int m = (min + max) / 2;
		// ordino tra min e m
		sort(a, min, m);
		// ordino l'altra metà
		sort(a, m + 1, max);
		// merge delle due metà
		merge(a, min, m, max);
	}

	/**
	 * fa il merge due sottoarray da min a m e da m+1 a max che sono già ordinati
	 * (merge = mette nelle posizioni da min a max i valori tutti ordinati)
	 */
	private static void merge(int[] a, int min, int m, int max) {
		System.out.println("merge min " + min + " med "+ m + "max " + max + " " + Arrays.toString(a));
		int sx = min; // primo elemento della parte sinistra
		int dx = m + 1; // primo elemento della parte destra
		int[] temp = new int[max - min + 1]; // array temporaneo per ospitare gli elelemtni di merge
		int i = 0; // indice dell'array temporaneo
		while (i < temp.length) {
			if ( dx > max || a[sx] < a[dx] && sx <= m) {
				// se l'elemento a sinistra è < di quello di destra 
				// ed è valido (ancora nella parte sinitra)
				// oppure ho finito di copiare tutti gli elelemnti di desta
				// prendo quello di sinistra
				temp[i] = a[sx];
				sx++;
				i++;
			} else {
				// prendo quello di destra
				temp[i] = a[dx];
				dx++;
				i++;
			}
		}
		// devo ricopiare temp in a
		for(int j= 0; j < temp.length; j++) {
			a[min+j] = temp[j];
		}
		

	}

	static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	public static void main(String[] args) {
		int[] a = { 100, 6, 78, 10, 34 };
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
