

public class ListaOrdinata<E extends Comparable<E>> {

	private class NodoLista {
		E dato;
		NodoLista pros;

		NodoLista(E d, NodoLista n) {
			dato = d;
			pros = n;
		}
	}

	NodoLista inizio;

	public ListaOrdinata() {
		inizio = null;
	}

	public void inserisci(E x) {
		// se primo elemento
		if (inizio == null) {
			inizio = new NodoLista(x, null);
		} else {
			// altrimenti lista non vuota
			NodoLista p = inizio;
			NodoLista q = null;
			while (p!= null && p.dato.compareTo(x) < 0) {
				q = p;
				p = p.pros;
			}
			// inserisco x tra q e p:
			NodoLista t = new NodoLista(x, p);
			// prima posizione?
			if (q == null)
				inizio = t;
			else
				q.pros = t;
				
		}
	}

	public void print(){
		for(NodoLista i = inizio; i!= null; i = i.pros){
			System.out.print(i.dato + " ");
		}
		System.out.println();
	}
	// restituisce true se e solo se x è nella lista
	public boolean trova(E x){
		for(NodoLista i = inizio; i!= null; i = i.pros){
			int c = i.dato.compareTo(x);
			// l'ho trovato
			if (c == 0) return true;
			// perchè l'elemento puntato da i > di x
			if (c>0) return false;
		}
		return false;
	}
	public void cancella(E x){
		NodoLista p = inizio;
		NodoLista q = null;
		while(p!=null){
			int c = p.dato.compareTo(x);
			if (c==0){
				// lo prelevo
				if (q == null)
					// è il primo elemento
					inizio = p.pros;
				else
					q.pros = p.pros;
				return;
			}
			// perchè l'elemento puntato da i > di x
			if (c>0) return;
			// vado avanti
			q = p;
			p = p.pros;
		}
	}
	
	public static void main(String[] args) {
		ListaOrdinata<String> nomi = new ListaOrdinata<>();
		nomi.inserisci("anna");
		nomi.print();
		nomi.inserisci("angelo");
		nomi.print();
		nomi.inserisci("anhan");
		nomi.print();
		nomi.inserisci("zorro");
		nomi.print();
		System.out.println(nomi.trova("anna"));
		System.out.println(nomi.trova("paolo"));
		// cancello elementi
		nomi.cancella("anhan");
		nomi.print();
		nomi.cancella("paolo");
		nomi.print();
		nomi.cancella("angelo");
		nomi.print();

	}
}
