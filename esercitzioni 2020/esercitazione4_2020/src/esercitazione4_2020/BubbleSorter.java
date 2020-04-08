/**
 *  @author AngeloGargantini
 */
package esercitazione4_2020;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSorter {

	// array di interi e vogliamo ordinarlo
	/**
	 * metodo che ordina
	 * @param n	 array da ordinare 
	 */
	public static void sort(int[] n) {
		// per sapere quando fermarsi
		// usiamo un flag
		boolean ordinato = true;
		do {
			ordinato = true;
			for (int i = 0; i < n.length - 1; i++) {
				// se troviamo due elementi fuori posto li scambiamo
				if (n[i] > n[i + 1]) {
					System.out.println("scambio posizione " + i + " con " + (i + 1));
					// scambio (collections.swap)
					int temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					// potrebbe non essere più ordinato
					ordinato = false;
				}
			}
		} while (!ordinato);
	}

	// array di interi e vogliamo ordinarlo
	public static void sort(List<String> n) {
		// per sapere quando fermarsi
		// usiamo un flag
		boolean ordinato = true;
		do {
			ordinato = true;
			for (int i = 0; i < n.size() - 1; i++) {
				// se troviamo due elementi fuori posto li scambiamo
				if (n.get(i).compareTo(n.get(i + 1))> 0 ) {
					System.out.println("scambio posizione " + i + " con " + (i + 1));
					// scambio (collections.swap)
					Collections.swap(n, i, i+1);
					// potrebbe non essere più ordinato
					ordinato = false;
				}
			}
		} while (!ordinato);
	}

	/// anticipo con i generics 
	// vedremo più avanti
	public static <T extends Comparable<T>> void sortgenerico(List<T> n) {
		// per sapere quando fermarsi
		// usiamo un flag
		boolean ordinato = true;
		do {
			ordinato = true;
			for (int i = 0; i < n.size() - 1; i++) {
				// se troviamo due elementi fuori posto li scambiamo
				if (n.get(i).compareTo(n.get(i + 1))> 0 ) {
					System.out.println("scambio posizione " + i + " con " + (i + 1));
					// scambio (collections.swap)
					Collections.swap(n, i, i+1);
					// potrebbe non essere più ordinato
					ordinato = false;
				}
			}
		} while (!ordinato);
	}
	
	
	public static void main(String[] args) {
		int a[] = { 1, 10, 3, 7, 4, 9 };
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		int b[] = { 1, 10, 3, 7, 4, 2 };
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
		int c[] = { 1, 2, 3, 7, 10 };
		System.out.println(Arrays.toString(c));
		sort(c);		
		System.out.println(Arrays.toString(c));
		List<String> l = Arrays.asList("a", "hh", "bb");
		System.out.println(l);
		sort(l);
		System.out.println(l);
	}
}
