package provaB.gargantiniangelo;

class Persona implements Comparable<Persona> {
	String nome;

	@Override
	public int compareTo(Persona o) {
		return nome.compareTo(o.nome);
	}

	@Override
	public String toString() {
		return nome;
	}
}

// per ora inserisco in cima (come se fosse una coda)
class ListaPersone {

	class NodoLista {
		Persona dato;
		NodoLista pros;
	}

	NodoLista head = null;

	// insert di inserimento di una persona in ordine passato come argomento
	void insert(Persona p) {
		NodoLista nl = new NodoLista();
		nl.dato = p;
		nl.pros = head;
		head = nl;
	}

	// print che stampa il contenuto della lista in ordine
	void print() {
		for (NodoLista i = head; i != null; i = i.pros) {
			System.out.print(i.dato + " ");
		}
		System.out.println();
	}

	// countNomeIniziaconA
	int countNomeIniziaconA() {
		int result = 0;
		for (NodoLista i = head; i != null; i = i.pros) {
			if (i.dato.nome.startsWith("A"))
				result++;
		}
		return result;
	}
}

public class GargantiniAngelo {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.nome = "ANNA";
		ListaPersone lp = new ListaPersone();
		lp.insert(p);
		lp.print();
		Persona p2 = new Persona();
		p2.nome = "PIERO";
		lp.insert(p2);
		lp.print();
		System.out.println(lp.countNomeIniziaconA());
	}
}