package coda;

public class ListaOrdinata<E extends Comparable<E>> {
	private class NodoLista {
		E dato;
		NodoLista pros;
	}

	NodoLista inizio;

	ListaOrdinata() {
		inizio = null;
	}

	void insert(E e) {
		// scorro la lista fino a che trovo il primo p > di e
		NodoLista p = inizio;
		NodoLista q = null; // q rimmarà sempre un nodo inidietro rispetto p
		while(p!=null && p.dato.compareTo(e) <0 ) {
			q = p;
			p = p.pros;
		}
		/*for(NodoLista p = inizio; 
				p!=null && p.dato.compareTo(e) <0 ; 
				p = p.pros) {}*/
		NodoLista n = new NodoLista();
		n.dato = e;
		n.pros = p;
		// va inserito come primo elemento?
		if (q==null) inizio = n;
		else q.pros = n;
	}

	@Override
	public String toString() {
		String result = "";
		for (NodoLista i = inizio; i != null; i = i.pros) {
			if (result.length() > 0)
				result += ",";
			result += i.dato;
		}
		return result;
	}
	
	/**
	 * Trova un elemento nella lista ordinata
	 *
	 * @param e elemento da trovare
	 * @return true, se trovato
	 */
	private boolean trova(E e) {
		for (NodoLista i = inizio; i != null; i = i.pros) {
			// NON sfrutta ordinamento if (i.dato.equals(e)) return true;
			int comp = i.dato.compareTo(e);
			System.out.println("confronto " + e + " con " + i.dato);
			if (comp == 0) return true;
			else if (comp >0) return false;
		}
		return false;

	}

	public static void main(String[] args) {
		ListaOrdinata<String> nomi = new ListaOrdinata<>();
		nomi.insert("B");
		nomi.insert("C");
		nomi.insert("A");
		nomi.insert("M");
		nomi.insert("T");
		System.out.println(nomi);
		System.out.println(nomi.trova("Z"));
		System.out.println(nomi.trova("A"));
		System.out.println(nomi.trova("D"));
		System.out.println(nomi.trova("N"));
	}
}
