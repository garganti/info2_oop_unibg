package cap06;

import java.util.Collections;
import java.util.Vector;

import prog.utili.Rettangolo;
import prog.utili.SequenzaOrdinata;

class Worker implements Comparable<Worker>{
	public int compareTo(Worker o) { return 0;	}
}
public class UsoSeqOrdinata {
	public static void main(String[] args) {
		SequenzaOrdinata<String> nomi = new SequenzaOrdinata<>();
		SequenzaOrdinata<Integer> numeri= new SequenzaOrdinata<>();		
		// NO 
		// SequenzaOrdinata<int> numeri= new SequenzaOrdinata<>();
		
		// sequenza ordinata di rettangoli
		// SequenzaOrdinata<Rettangolo> rettangoli = new SequenzaOrdinata<>();
		String s1 = "maria";
		String s2 = "giovanni";
		
		System.out.println(s1.compareTo(s2));
		// -> 0 se sono uguali
		// se s1 < s2 -> un valore < 0
		// se s1 > s2 -> un valore  0
		Comparable<Studente> cs = new Studente();		
		// 
		SequenzaOrdinata<Worker> lavoratori = new SequenzaOrdinata<Worker>();		
		
		Vector<String> nomiV = new Vector<>();
		Collections.sort(nomiV);
		nomiV.forEach(x -> System.out.println(x));
		
	}
}
