package interfacce;

import java.util.ArrayList;
import java.util.Collections;

// esercizio 26 
public class Automobile implements Comparable<Automobile>{
	
	private int kmPercorsi;
	
	public Automobile(int k) {
		kmPercorsi = k;
	}
	
	@Override
	public String toString() {
		return "auto con km " + kmPercorsi;
	}
	// return 0 se this è uguale in km a o
	// return < 0 se this è < di o in km percorsi
	// return > 0 se this > o
	public int compareTo(Automobile o) {
		if (this.kmPercorsi == o.kmPercorsi)
			return 0;
		else if (this.kmPercorsi < o.kmPercorsi)
			return -1;
		// this.km > o.km
		return 1;
		// sintetico in laternativa:
		//return this.kmPercorsi - o.kmPercorsi
	}

	public static void main(String[] args) {
		Automobile a1 = new Automobile(10);
		Automobile a2 = new Automobile(230000);
		Automobile a3 = new Automobile(230000);
		
		// a1 < a2
		System.out.println(a1.compareTo(a2));
		System.out.println(a2.compareTo(a3));
		//
		System.out.println(a2.compareTo(a1));
		
		//
		ArrayList<Automobile> parcoAuto = new ArrayList<>();
		parcoAuto.add(a2);
		parcoAuto.add(a1);
		parcoAuto.add(a3);
		// stamparle in ordine di km 
		System.out.println(parcoAuto);
		// ordino con una libreria
		Collections.sort(parcoAuto);
		System.out.println(parcoAuto);
		
		
	}
}
