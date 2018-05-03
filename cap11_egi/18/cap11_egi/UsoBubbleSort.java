package cap11_egi;

import java.util.Arrays;

// un sorter di array che uso il bubble sort

class BubbleSorter<T extends Comparable<T>>{
	
	/**
	 * @param a array da ordinare
	 *  @return array ordinato
	 */
	void sort(T[] array){
		boolean scambiato;
		// fino a quando ho scambiato qualche elemento
		do {
			scambiato = false;
			// continuo a scorrere l'array alla ricerca di elementi fuori posto
			for(int i = 0; i < array.length -1; i++) {
				// confronta i-esemio elemento con (i+1)-esimo elemento
				// i va da 0 a length -1 escluso
				if(array[i].compareTo(array[i+1]) > 0) {
					// scambio
					T temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					scambiato = true;
				}
			}
		}while(scambiato);
		
	}
}


public class UsoBubbleSort {
	
	public static void main(String[] args) {
		Integer[] a = {8,5,3,90,4};
		BubbleSorter<Integer> sorter = new BubbleSorter<>();
		System.out.println(Arrays.toString(a));
		sorter.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
