package te_comp_19_lista;

class Persona implements Comparable<Persona> {
	String nome;

	public Persona(String string) {
		nome = string;
	}

	@Override
	public int compareTo(Persona o) {
		return nome.compareTo(o.nome);
	}
	@Override
	public String toString() {
		return nome;
	}
}

class ListaPersone {
	NodoLista inizio;

	class NodoLista {
		Persona dato; // non è generica
		NodoLista pros;
	}

	public ListaPersone() {
		inizio = null;
	}

	public void insert(Persona o) {
		NodoLista p = inizio;
		NodoLista q = null;
		// scorro fino a quando p è valido e punta da un elemento con nome < di o.nome
		while (p != null && p.dato.compareTo(o) < 0) {
			q = p;
			p = p.pros;
		}
		NodoLista temp = new NodoLista();
		temp.dato = o;
		// inserisco temp tra p e q
		temp.pros = p;		
		if (q == null) { // caso particolare devo inserire o come primo elemento 
			inizio = temp;
		} else {
			q.pros = temp;
		}
	}

	public void print() {
		for (NodoLista p = inizio; p != null; p = p.pros) {
			System.out.print(p.dato+ " ");
		}
		System.out.println();
	}
	int countNomeIniziaconA(){
		int count = 0;
		for (NodoLista p = inizio; p != null; p = p.pros) {
			if (p.dato.nome.startsWith("A")) count ++;
			// oppure; ma attenti alle stringhe vuote ""
			//if (p.dato.nome.charAt(0) == 'A') count ++;
			//if (p.dato.nome.substring(0, 1).equals("A")) count ++;
			// se inizia on la B è inutile continuare a cercare	
			if (p.dato.nome.startsWith("B")) break;
		}
		return count;
	}
}

public class GargantiniAngelo {
	public static void main(String[] args) {
		ListaPersone lp = new ListaPersone();
		lp.insert(new Persona("Anna"));
		lp.insert(new Persona("Mario"));
		lp.insert(new Persona("Gio"));
		lp.insert(new Persona("Amy"));
		lp.insert(new Persona("Carrie"));
		lp.insert(new Persona(""));

		lp.print();
		System.out.println(lp.countNomeIniziaconA());
	}
}
