package cap11_egi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jdk.nashorn.internal.runtime.ListAdapter;
import prog.utili.Figura;

class Persona implements Comparable<Persona>{

	public int compareTo(Persona persona) {
		// TODO
		return 0;
	}
	
}

public class Ordinamenti {

	static void ordinaBubbleSort(int a[]) {
		boolean scambiato;
		do {
			scambiato = false;
			for (int i = 0; i < a.length - 1; i++) {
				// coppia disordinata
				if (a[i] > a[i + 1]) {
					// scambio
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					scambiato = true;
				}
			}
		} while (scambiato);
	}

	static void ordinaBubbleSort(String a[]) {
		boolean scambiato;
		do {
			scambiato = false;
			for (int i = 0; i < a.length - 1; i++) {
				// coppia disordinata
				if (a[i].compareTo(a[i + 1])> 0) {
					// scambio
					String temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					scambiato = true;
				}
			}
		} while (scambiato);
	}
								//*****		
	static void ordinaBubbleSort(Persona a[]) {
		// dovrei copaire e dadaatare
	}
	// metodo generico
	// T sarà un tipo qualunque
	// vincolo su tipo T generico
	static <T extends Comparable<T>> void ordinaBubbleSort(T a[]) {
		boolean scambiato;
		do {
			scambiato = false;
			for (int i = 0; i < a.length - 1; i++) {
				// coppia disordinata
				if (a[i].compareTo(a[i + 1])> 0) {
					T temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					scambiato = true;
				}
			}
		} while (scambiato);

	}
	
	public static void main(String[] args) {
		int[] a = {7,4,9,2,0,100};
		/*System.out.println(Arrays.toString(a));
		ordinaBubbleSort(a);
	/	System.out.println(Arrays.toString(a));
		*/
		String nomi[] = {"aaa", "zzz", "carrie", "peter"};
		//System.out.println(Arrays.toString(nomi));
		//ordinaBubbleSort(nomi);
		//System.out.println(Arrays.toString(nomi));
		
		
		// array -> lista
		List<String> listaNomi = Arrays.asList(nomi);
		System.out.println(listaNomi);
		Collections.sort(listaNomi);
		System.out.println(listaNomi);
		
		List<Figura> listaFIgure = new ArrayList<>();
		//Collections.sort(listaFIgure);
	}

}
