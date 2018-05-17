package patitololistetemp;

import patitololistetemp.CodaDinamica.NodoCoda;

public class ListaOrdinata<E extends Comparable<E>> {

	// classe che rappresenta ogni singolo nodo
	class NodoLista {
		E dato;
		NodoLista pros;
	}

	NodoLista primo;

	ListaOrdinata() {
		primo = null;
	}

	// aggiungi in coda l'elemento x
	void aggiungi(E x) {
		NodoLista n = new NodoLista();
		n.dato = x;
		// cerco la posizone dove inserire x
		NodoLista p = primo;
		NodoLista q = null;
		while(p != null && p.dato.compareTo(x) < 0) {
			q = p;
			p = p.pros;
		}
		// p punta al primo elemento >= di x
		// q punta all'ultimo elemento < di x
		// posso inserire n tra p e q
		n.pros = p;
		// s ecome primo
		if (q == null)
			primo = n;
		else
			q.pros = n;
	}

	// restituisce true se e solo se x è nella lista ordinata
	boolean cerca(E x) {
		for(NodoLista i = primo; i != null; i = i.pros) {
			System.out.println("sto confrontando " + x + " con " + i.dato);
			if (i.dato.equals(x)) return true;
			// se l'elmento i-esemio è > di x è inutil continuare
			if (i.dato.compareTo(x)>0) return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String result = new String();
		for (NodoLista n = primo; n != null; n = n.pros) {
			result += n.dato + ", ";
		}
		return result;
	}

	
	public static void main(String[] args) {
		ListaOrdinata<Integer> stack = new ListaOrdinata<>();
		System.out.println("coda: " + stack);
		stack.aggiungi(4);
		System.out.println("coda: " + stack);
		stack.aggiungi(6);
		System.out.println("coda: " + stack);
		stack.aggiungi(2);
		System.out.println("coda: " + stack);
		
		System.out.println(stack.cerca(6));
		
		System.out.println(stack.cerca(100));
		
		System.out.println(stack.cerca(3));
	}
}
