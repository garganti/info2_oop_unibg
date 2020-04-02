import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import prog.utili.SequenzaOrdinata;
// voglio ordinare anche per nome?
// usare comparator
class ComparatorPerNome implements Comparator<Persona>{
	// singleton
	static final ComparatorPerNome  instance = new ComparatorPerNome();
	
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.nome.compareTo(o2.nome);
	}}
//
public class Persona implements Comparable<Persona>{	
	// int eta;
	double eta;
	String nome;
	public Persona(double eta, String nome) {
		this.eta = eta;
		this.nome = nome;
	}
	// confronta per età
	// se this < o return < 0 (ad esempio +1)
	// se this == o return 0
	// se this > o return > 0
	public int compareTo(Persona o) {
		// NO perchè adesso è double return this.eta - o.eta;
		// prima alternativa uso di if
		// if (this.eta > o.eta) return 1;
		// ..
		return Double.compare(this.eta, o.eta);
	}
	
	@Override
	public String toString() {
		return nome + " -> " + eta;
	}
	
	public static void main(String[] args) {
		Persona a = new Persona(40.5, "sergio");
		Persona b = new Persona(50, "mario");
		Persona c = new Persona(40.1, "giovanni");
		
		SequenzaOrdinata<Persona> amici = new SequenzaOrdinata<Persona>();
		amici.add(a);
		amici.add(b);
		amici.add(c);
		for(Persona p: amici) System.out.println(p);
		
		List<Persona> amici2 = new ArrayList<Persona>();
		amici2.add(a);
		amici2.add(b);
		amici2.add(c);
		System.out.println(amici2);
		Collections.sort(amici2);
		System.out.println(amici2);
		// voglio confrontare/ordinare per nome
		// uso il comparator
		//Collections.sort(amici2,new ComparatorPerNome());
		Collections.sort(amici2,ComparatorPerNome.instance);
		System.out.println(amici2);
		// faccio un mescolatura
		Collections.shuffle(amici2);
		System.out.println(amici2);
		// 
		System.out.println(Collections.min(amici2));
	}

	
	
}
