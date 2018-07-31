package alberi;

public class AlberoBinario<E extends Comparable<E>> {

	class NodoAlbero {
		E dato;
		AlberoBinario<E> sx;
		AlberoBinario<E> dx;
	}

	// nodo del mio albero
	private NodoAlbero root;

	AlberoBinario() {
		root = null;
	}

	void inserisci(E x) {
		// albero vuoto
		if (root == null) {
			root = new NodoAlbero();
			root.dato = x;
			root.sx = new AlberoBinario<E>();
			root.dx = new AlberoBinario<E>();
			return;
		}
		// confronta x on la root
		if (x.compareTo(root.dato) < 0) {
			// x va a sinistra
			// se a sinistra c'è un albero
			if (root.sx != null) {
				root.sx.inserisci(x);
			} else {
				// a sx non c'è ancora un albero
				root.sx = new AlberoBinario<E>();
				root.sx.root.dato = x;
			}
		} else {
			// x va a destra
			if (root.dx != null) {
				root.dx.inserisci(x);
			} else {
				// a sx non c'è ancora un albero
				root.dx = new AlberoBinario<E>();
				root.dx.root.dato = x;
			}
		}
	}

	/** stampa gli elemnti in ordine */
	void print() {
		if (root != null) {
			if (root.sx != null)
				root.sx.print();
			System.out.print(root.dato + " ");
			if (root.dx != null)
				root.dx.print();
		}
	}

	public static void main(String[] args) {
		AlberoBinario<Integer> voti = new AlberoBinario<>();
		voti.inserisci(18);
		voti.inserisci(30);
		voti.inserisci(20);
		voti.inserisci(25);
		voti.inserisci(27);
		//
		voti.print();
	}

}
