package albero;

// albero paramertrico ordinato
public class Albero<E extends Comparable<E>> {

	NodoAlbero root;

	class NodoAlbero {
		E dato;
		Albero<E> sx, dx;
	}

	public Albero() {
		root = null;
	}

	public void insert(E e) {
		// se l'albero è vuoto, inserisci direttamente qui
		if (root == null) {
			System.out.println("albero vuoto, inserisco qui");
			root = new NodoAlbero();
			root.dato = e;
			root.sx = new Albero<>(); // sx e dx sono vuoti
			root.dx = new Albero<>();
		} else {
			if (e.compareTo(root.dato) < 0) {
				System.out.println("inserisco sx");
				root.sx.insert(e);
			} else {
				System.out.println("inserisco dx");
				root.dx.insert(e);
			}

		}

	}

	// stampa in ordine (ricorsiva)
	void stampa() {
		if (root != null) {
			root.sx.stampa();
			System.out.print(root.dato + " ");
			root.dx.stampa();
		}
	}

	// trova e nell'albero, se lo trovi restitusci true altrimenti false
	boolean trova(E e) {
		if (root == null)
			return false;
		int cmp = root.dato.compareTo(e);
		if (cmp == 0)
			return true;
		else if (cmp < 0)
			return root.dx.trova(e);
		else
			return root.sx.trova(e);

	}

	public static void main(String[] args) {
		Albero<Integer> numeri = new Albero<>();
		numeri.stampa();
		numeri.insert(4);
		numeri.stampa();
		numeri.insert(20);
		numeri.stampa();
		numeri.insert(0);
		numeri.stampa();
		numeri.insert(10);
		numeri.stampa();
		System.out.println(numeri.trova(10));
	}

}
