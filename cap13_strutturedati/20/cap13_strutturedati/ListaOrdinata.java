package cap13_strutturedati;

// lista dinamica sempre ordinata
public class ListaOrdinata<E extends Comparable<E>> {

	private NodoLista inizio;

	class NodoLista {
		NodoLista(E d, NodoLista p) {
			dato = d;
			pros = p;
		}

		E dato;
		NodoLista pros;
	}

	ListaOrdinata() {
		inizio = null;
	}

	public void inserisci(E e) {
		NodoLista p = inizio;
		NodoLista q = null;
		while (p != null && p.dato.compareTo(e) < 0) {
			q = p;
			p = p.pros;
		}
		NodoLista temp = new NodoLista(e, p);
		if (q == null) {
			System.out.println("primo elemento in testa");
			// lista vuota
			inizio = temp;
		} else {
			if (p == null) System.out.println("inserisco dop "+ q.dato + " come ultimo");
			else  System.out.println("inserisco tra  "+ p.dato + " e " + q.dato);
			q.pros = temp;
		}
	}


	@Override
	public String toString() {
		String result = "[";
		for (NodoLista i = inizio; i != null; i = i.pros) {
			result +=  i.dato.toString() + "," ;
		}
		return result + "]";
	}

	public static void main(String[] args) {
		ListaOrdinata<Integer> numeri = new ListaOrdinata<>();
		System.out.println(numeri);
		numeri.inserisci(2); // in testa come primo elemento
		System.out.println(numeri);
		// 
		numeri.inserisci(12); // in fondo
		System.out.println(numeri);
		numeri.inserisci(5); // in mezzo
		System.out.println(numeri);
		numeri.inserisci(1); // in mezzo
		System.out.println(numeri);
	}
}
