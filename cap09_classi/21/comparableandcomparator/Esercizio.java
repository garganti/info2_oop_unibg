package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Esistono diversi nazioni, ognuna con un nome e
 * con un numero di abitanti
 * Costruisci delle nazioni
 * mettile in un arraylist 
 * stampale in ordine di nome
 * stampale in ordine di popolazione
 * ==> usiamo comparable
 */

class Nazione implements Comparable<Nazione>{
	String name;
	long popolazione;
	public Nazione(String n, long p) {
		name = n; popolazione = p;
	}
	@Override
	public String toString() {return name + ":" + popolazione;	}
	
	public int compareTo(Nazione o) {
		return this.name.compareTo(o.name);
	}
	
}

class ComparatorPerPopolazione implements Comparator<Nazione>{
	// > 0 se o1 > o2
	// = 0 se o1 = o2
	// < 0 se o1 < o2
	@Override
	public int compare(Nazione o1, Nazione o2) {
		//return (int) (o1.popolazione - o2.popolazione);
		return Long.compare(o1.popolazione,o2.popolazione);
		// oppure metto
	}
	
}

public class Esercizio {
	public static void main(String[] args) {
		Nazione italia = new Nazione("Italia", 60000000);
		Nazione germania = new Nazione("Germania", 80000000);
		Nazione usa = new Nazione("USA", 300000000);
		Nazione cina = new Nazione("Cina", 1398000000);
		ArrayList<Nazione> onu = new ArrayList<>();
		onu.add(italia);
		onu.add(germania);
		onu.add(usa);
		onu.add(cina);
		System.out.println(onu);
		System.out.println("ordina");
		Collections.sort(onu);
		System.out.println(onu);		
		System.out.println("in ordine di popolazione (crescente)");
		ComparatorPerPopolazione c = new ComparatorPerPopolazione();
		Collections.sort(onu, c);
		System.out.println(onu);		
	}

}
