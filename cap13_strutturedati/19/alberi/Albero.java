package alberi;

/** albero di ricerca */
public class Albero<E extends Comparable<E>> {

	private class NodoAlbero{
		E dato;
		Albero<E> sx, dx;
	}
	
	NodoAlbero root;
	
	public Albero() {root =null;}
	
	// inserisci un elemento nell'albero ordinato
	public void insert(E e) {
		// se l'albero è vuoto, allora metti e in esso
		if (root == null) {
			root = new NodoAlbero();
			root.dato = e;
			root.sx = new Albero<E>();
			root.dx = new Albero<E>();
		} else {
			// devo inserirlo in un sotto albero
			// root < e
			if (root.dato.compareTo(e)<0) {
				// vado a dx
				root.dx.insert(e);
			} else {
				// vado a sx
				root.sx.insert(e);
			}
		}
	}

	@Override
	public String toString() {
		if (root == null) return "";
		String sx = root.sx.toString();
		String dx = root.dx.toString();
		//return (sx.length() != 0 ? sx +"<-" : "") + 
		//		root.dato +  (dx.length() != 0 ? "->" + dx : "");
		return sx + " " + root.dato + " " + dx;
	}
	/**
	 * 
	 * @param e da cercare
	 * @return true se trovato
	 */
	public boolean trova(E e) {
		// albero vuoto
		if (root == null) return false;
		//System.out.println(" sto cercando nel albero con radice "+ root.dato );
		int cmp = root.dato.compareTo(e);
		if (cmp ==0) return true;
		else if (cmp < 0) // root < e
			return root.dx.trova(e);
		else // root> e
			return root.sx.trova(e);
	}	
	
	public static void main(String[] args) {
		Albero<Character> sigle = new Albero<>();
		sigle.insert('G');
		sigle.insert('S');
		sigle.insert('A');
		sigle.insert('B');
		/*sigle.insert('H');
		sigle.insert('J');
		sigle.insert('P');
		sigle.insert('T');*/
		System.out.println(sigle.toString());
		System.out.println(sigle.trova('C'));
	}
	
}
