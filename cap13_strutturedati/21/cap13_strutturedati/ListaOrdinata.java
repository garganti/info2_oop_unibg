package cap13_strutturedati;

import cap13_strutturedati.Stack.NodoStack;

public class ListaOrdinata<E extends Comparable<E>> {

	class NodoLista{
		E dato;
		NodoLista pros;
	}
	
	NodoLista inizio;
	
	public ListaOrdinata() {
		inizio = null;
	}
	
	// inserisci in ordine
	void inserisci(E e){
		NodoLista p = inizio;
		NodoLista q = null;
		while(p != null && p.dato.compareTo(e) < 0) {
			q = p;
			p = p.pros;
		}
		NodoLista nuovoNodo = new NodoLista();
		nuovoNodo.dato = e;
		// setto i puntatori
		nuovoNodo.pros = p;
		// controllo se va in testa
		if (q == null)
			inizio = nuovoNodo;
		else 
			q.pros = nuovoNodo;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(NodoLista i = inizio; i != null; i = i.pros) {
			result += i.dato.toString() + ",";
		}
		result += "]";
		return result;
	}
	
	
	public static void main(String[] args) {
		ListaOrdinata<String> nomi = new ListaOrdinata<>();
		nomi.inserisci("piero");
		System.out.println(nomi);
		nomi.inserisci("paolo");
		System.out.println(nomi);
		nomi.inserisci("giovanni");
		System.out.println(nomi);
	}

	
}
