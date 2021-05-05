package cap11_egi;

import java.util.Arrays;

class JJJ<T extends Comparable<T>>{}

public class BubbleSorter {
	
	//generico rispetto T
//	<T> void sort(T[] a) {
//		
//	} 

	// ordina a in ordine crescente
	void sort(int[] a) {
		boolean scambiato;
		do {
			// System.out.println("nuovo ciclo");
			// passare in rassegna l'array per vedere se è già ordinato
			scambiato = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					// System.out.println("scambio " + a[i] + " con " + a[i+1]);
					// trovato una coppia non in ordine
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					scambiato = true;
					// System.out.println(Arrays.toString(a));
				}
			}
		} while (scambiato);
	}

	<T extends Comparable<T>> void sort(T[] a) {
		boolean scambiato;
		do {
			// System.out.println("nuovo ciclo");
			// passare in rassegna l'array per vedere se è già ordinato
			scambiato = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i].compareTo(a[i + 1]) > 0) {
					// System.out.println("scambio " + a[i] + " con " + a[i+1]);
					// trovato una coppia non in ordine
					T temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					scambiato = true;
					// System.out.println(Arrays.toString(a));
				}
			}
		} while (scambiato);
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 9, 1 };
		System.out.println(Arrays.toString(a));
		new BubbleSorter().sort(a);
		System.out.println(Arrays.toString(a));
		String[] b = { "aaa", "aggh" , "zzz", "jjk"};
		System.out.println(Arrays.toString(b));
		new BubbleSorter().sort(b);
		System.out.println(Arrays.toString(b));
		
		Integer[] c = { 6,0,5};
		System.out.println(Arrays.toString(c));
		new BubbleSorter().sort(c);
		System.out.println(Arrays.toString(c));
		
		Studente[] s = {};
		//new BubbleSorter().sort(s); -> non è comparable
	}
}

class Studente{}
