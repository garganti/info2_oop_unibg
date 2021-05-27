package alberi;

import alberi.Albero.NodoAlbero;
/** versione alternativa molto usata
 * 
 * @author garganti
 *
 * @param <E>
 */
public class AlberoAG<E extends Comparable<E>> {

	class NodoAlbero {
		E dato;
		NodoAlbero sx, dx; // qui ho due puntatori a NODO e non a ALBERO come nella versione del libro
	}

	NodoAlbero root;

	void inserisci(E e) {
		NodoAlbero toadd = new NodoAlbero();
		toadd.dato = e;
		if (root != null) inserisci(root, toadd);
		else root = toadd;  
	}

	void inserisci(NodoAlbero root, NodoAlbero toadd){
		int compare = root.dato.compareTo(toadd.dato);
		// root > dato?
		if (compare >0) {
			if (root.sx == null) root.sx = toadd; 
			else inserisci (root.sx, toadd);
		}else {
			if (root.dx == null) root.dx = toadd; 
			else inserisci (root.dx, toadd);			
		}
	}

}
