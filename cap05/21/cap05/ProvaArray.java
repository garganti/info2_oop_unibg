package cap05;

import java.util.Arrays;
import java.util.Collections;

public class ProvaArray {
	
	public static void main(String[] args) {
		
		int[] a = new int [10];
		
		//System.out.println(a[10]);
		System.out.println(a[0]);
		
		String names[] = new String[80];
		
		
		//System.out.println(names[0].toLowerCase());
		names[0] = "PIERO";
		System.out.println(names[0].toLowerCase());
		names['A'] = "Alessandro";
		System.out.println(names['A']);
		
		// accedere a tutti gli elementi di un array
		// stampa
		// esempio a
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// foreach
		for(int current : a) {
			System.out.print(current + " ");
		}
		System.out.println();
		
		for(String name: names) {
			if (name != null) 
				System.out.println(name);
		}
		// voglio inizializzare names
		System.out.println(Arrays.toString(names));
		// NON FUNZIONA
		for(String name: names) {
			name = "ddd";
		}
		System.out.println(Arrays.toString(names));
		// devo per forza usare i cicli normali
		for(int i = 0; i < names.length; i++) {
			names[i] = "ddd";
		}
		System.out.println(Arrays.toString(names));
		
		// java 11
		Arrays.asList(names)
		.forEach(x -> System.out.println(x));
		// solo quando dichiarate
		int[] vals = {6,7,8};
		// equivalente a scrivere
		int[] vals2 = new int[] {6,7,8};
		
		// NO
		//vals = {8,9,10,11}
		vals = new int[4];
		vals[0] = 8; //...
		
	}

}
