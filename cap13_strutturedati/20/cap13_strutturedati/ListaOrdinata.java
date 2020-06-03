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
		// for(;p != null && p.dato.compareTo(e) < 0; q = p, p = p.pros);
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

	void cancella(E e) {
		NodoLista p = inizio;
		NodoLista q = null;
//		while(p!=null && p.dato.compareTo(e)!=0) {
		while(p!=null && p.dato.compareTo(e)<0) {
			q = p;
			p = p.pros;
		}
		// sono uscito senza trovarlo
		if (p == null || p.dato.compareTo(e) > 0) {
			System.out.print("elemento "+e +" non trovato" );
			if (p==null) System.out.println("sono arrivato in fondo");
			else System.out.println(" ho trovato " + p.dato + " che è > di " +e);
		} else {
			// lo rimuovo
			if (q != null) {
				q.pros = p.pros;
			} else {
				// primo elemento
				inizio = p.pros;
			}
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
		// cancella
		numeri.cancella(5); // in mezzo
		System.out.println(numeri);
		numeri.cancella(300); // in mezzo
		System.out.println(numeri);
		// primo elemento
		numeri.cancella(1); // in mezzo
		System.out.println(numeri);
		numeri.cancella(7); // in mezzo
		System.out.println(numeri);
	}
}
