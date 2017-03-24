package cap05;

import java.util.Arrays;

public class UsoArraySP {

	/**
	 * riempiei un array
	 * @param numeri l'array da riempire
	 */
	static void riempiArray(int[] numeri) {
		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = i;
		}
	}
	static void stampaArray(int[] numeri) {
		for (int i = 0; i < numeri.length; i++) {
			System.out.print(numeri[i] + " ");
		}
	}

	// voglio ripire un array di 10 elementi da 0 a 9
	public static void main(String[] args) {
		// dichiarare
		int[] numeri;
		// creare array
		int nnumeri = 10;
		numeri = new int[nnumeri];
		// riempio
		riempiArray(numeri);
		// numeri[10] = 10;
		//
		// System.out.println(Arrays.toString(numeri));
		stampaArray(numeri);
		for (int p : numeri) {
			System.out.print(p + " ");
		}

	}


}
