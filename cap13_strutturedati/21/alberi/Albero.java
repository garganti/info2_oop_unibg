package alberi;

public class Albero<E extends Comparable<E>> {

	class NodoAlbero{
		E dato;
		Albero<E> sx,dx;
	}	
	NodoAlbero radice;	
	public Albero() {
		radice = null;
	}
	
	void inserisci(E e){
		// se la radice è nulla metto e nella radice
		if (radice == null) {
			radice = new NodoAlbero();
			radice.dato = e;
			radice.sx = new Albero<>();
			radice.dx = new Albero<>();
		} else {
			// confronta l'elemento della radice
			if (radice.dato.compareTo(e) > 0) {
				// radice dato > di e -> inserisci a sinistra 
				radice.sx.inserisci(e);
			} else {
				// inserisci a destra
				radice.dx.inserisci(e);
			}
		}
		
	}
	
	//cerca nell'albero e e return true se lo trova
	// false altrimenti
	boolean trova(E e) {
		//albero vuoto
		if (radice == null) return false;
		int compareTo = radice.dato.compareTo(e);
		//l'ho trovato
		if (compareTo == 0) return true;
		if (compareTo > 0) {
			// radice > e vadoi a sinistra
			return radice.sx.trova(e);			
		} else {
			// compareTo < 0
			// radice < e , cerca a destra
			return radice.dx.trova(e);
		}
	}
	
	
	// stampa l'albero in ordine
	void printInOrdine(){
		if (radice == null) return;
		radice.sx.printInOrdine();
		System.out.print(radice.dato + " ");
		radice.dx.printInOrdine();
	}
	
	int contafoglie() {
		// se questa radice è una foglia allora return 1;
		// foglia se asx e dx entrmabni vuoti
		if (radice.sx.radice == null && 
				radice.dx.radice == null)
			return 1;
		// altrimenti conta le foglie a dex e sin e sommale
		int numeroFoglie = 0;
		if (radice.sx.radice != null)
			numeroFoglie += radice.sx.contafoglie();
		if (radice.dx.radice != null)
			numeroFoglie += radice.dx.contafoglie();
		return numeroFoglie;		
	}
	
	
	
	public static void main(String[] args) {
		// costruisco io manualmente
		Albero<Integer> a123 = new Albero<>();
		a123.inserisci(3);
		a123.printInOrdine();
		System.out.println();
		a123.inserisci(2);
		a123.printInOrdine();
		a123.inserisci(6);
		System.out.println();
//		a123.radice = new NodoAlbero();
//		a123.radice.dato = 2;
//		a123.radice.sx = new Albero();
//		a123.radice.sx.radice = new NodoAlbero();
//		a123.radice.sx.radice.dato  = 1;
//		a123.radice.dx = new Albero();
//		a123.radice.dx.radice = new NodoAlbero();
//		a123.radice.dx.radice.dato  = 3;
//		
//		a123.printInOrdine();
		
		System.out.println(a123.contafoglie());
		a123.inserisci(10);
		System.out.println(a123.contafoglie());
		a123.inserisci(4);
		System.out.println(a123.contafoglie());
		
		
	}
	
}
