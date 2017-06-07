/* albero binario di ricerca (albero ordinato)*/
public class Albero<E extends Comparable<E>> {

	class NodoAlbero{
		E dato;
		Albero<E> sx;
		Albero<E> dx;
	}
	
	NodoAlbero radice;
	
	public Albero() {
		radice = null;
	}
	
	public void insert(E x){
		// se la radice è nulla
		if (radice == null){
			// inserisci qui nella radice
			radice = new NodoAlbero();
			radice.dato = x;
			// alberi vuoti a sinistra e destra
			radice.sx = new Albero<>();
			radice.dx = new Albero<>();
		} else{
			// confronta con l'elmento in radice
			if (x.compareTo(radice.dato) < 0){
				// se < inserisci a sinistra
				radice.sx.insert(x);
			} else{
				// altrimenti inserisci a destra
				radice.dx.insert(x);
			}
		}		
	}
	
	void printInOrder(){
		// se l'albero è vuoto non stampare nulla
		if (radice == null) return;
		// stampa in ordine l'albero
		radice.sx.printInOrder();
		System.out.print(radice.dato + " ");
		radice.dx.printInOrder();
	}
	// restituisce true se e è nell'albero
	boolean trova(E e){
		System.out.println("cercando " + e +" in ");
		printInOrder();
		System.out.println("*****");
		// albero vuoto
		if (radice == null) return false;
		// altrimenti
		int c = radice.dato.compareTo(e);
		// se =
		if (c == 0) return true;
		// se radice < e 
		else if (c <0) return radice.dx.trova(e);
		// c > 0 [radice > e]
		else return (radice.sx.trova(e));
	}
	
	public static void main(String[] args) {
		Albero<String> nomi = new Albero<>();
		nomi.insert("anna");
		nomi.printInOrder();
		System.out.println();
		nomi.insert("amalia");
		nomi.printInOrder();
		System.out.println();
		nomi.insert("aaali");
		nomi.printInOrder();
		System.out.println();
		nomi.insert("kio");
		nomi.printInOrder();
		System.out.println();
		//
		System.out.println(nomi.trova("kio"));
		System.out.println(nomi.trova("kilo"));
		
	}
}
