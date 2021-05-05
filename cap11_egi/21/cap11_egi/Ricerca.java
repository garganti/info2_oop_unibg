package cap11_egi;

import java.util.Arrays;

//public class Ricerca<T> {
public class Ricerca<T extends Comparable<T>> {

	// cerca in a val e se lo trova restituisce true,
	// alrtimenbti false
	private boolean cercaSeq(T[] a, T val) {
		for(int i  = 0; i < a.length ; i++) {
			System.out.print('.');
			if (a[i].equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean cercaBinario(T[] a, T val) {
		// ordina a
		new BubbleSorter().sort(a);
		// adesso cerca in a
		int sx = 0, dx = a.length-1;
		do {
			System.out.print(".");
			// calcolo m
			int m = (dx + sx) /2;
			int compareTo = val.compareTo(a[m]);
			if (compareTo == 0) return true; // equals
			if (compareTo > 0) {
				// val > a[m] cercare a destra
				sx = m+1;
			} else {
				// val < a[m] cerco a sinistra
				dx = m-1;
			}
		} while(sx <= dx);
		return false;
	}
	
	
	
	public static void main(String[] args) {
		String[] b = { "aaa", "aggh" , "zzz", "jjk", "tty", "ghj", "opo"};
		System.out.println(Arrays.toString(b));
		Ricerca<String> ricerca = new Ricerca<String>();
		System.out.println(ricerca.cercaSeq(b,"aa"));
		System.out.println(ricerca.cercaSeq(b,"aaa"));		
		System.out.println(ricerca.cercaSeq(b,"opo"));		

		System.out.println(ricerca.cercaBinario(b,"aa"));
		System.out.println(ricerca.cercaBinario(b,"aaa"));		
		System.out.println(ricerca.cercaBinario(b,"opo"));		

	}

}
