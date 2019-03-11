/** bubble sort per array di interi
 * NOTA: il bubble sort se l'array è già ordinato fa solo una passata
 * 
 * **/
import java.util.Arrays;

public class BubbleSortInt {
	public static void main(String[] args) {
		int numeri[] = { 5, 3, 8, 10, 0, 2 };
		System.out.println(Arrays.toString(numeri));
		bubbleSort(numeri);
		System.out.println("fine:" + Arrays.toString(numeri));

	}

	private static void bubbleSort(int[] numeri) {
		// ORDINO CON BUBBLESORT
		boolean ordinati = true;
		// fino a quando non sono ordinati
		do {
			ordinati = true;
			// scorro l'array e scambio posizioni sbagliate contigue
			for (int i = 0; i < numeri.length - 1; i++) {
				// confronto la posizione i con i +1
				if (numeri[i] > numeri[i + 1]) {
					// scambio
					int temp = numeri[i];
					numeri[i] = numeri[i + 1];
					numeri[i + 1] = temp;
					ordinati = false;
				}
			}
			System.out.println("intermedio:" + Arrays.toString(numeri));
		} while (!ordinati);
	}

}
