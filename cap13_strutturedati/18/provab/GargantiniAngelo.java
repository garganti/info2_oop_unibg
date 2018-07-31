package provab;

class AlberoInteri{
	// implementazione alternativa
	class NodoAlbero{
		public NodoAlbero(int x) {
			dato = x;
		}
		int dato;
		NodoAlbero sx, dx; // invece di albero
	}
	
	NodoAlbero root;
	
	void insert(int x){
		if (root ==null) {
			root = new NodoAlbero(x);
		} else {
			insert(x,root);
		}
	}
	// x -> intero da inserire
	// na -> a paretire da questo nodo
	void insert(int x, NodoAlbero na) {
		if( x < na.dato) {
			if (na.sx != null) insert(x,na.sx);
			else {na.sx = new NodoAlbero(x);}
		} else {
			if (na.dx != null) insert(x,na.dx);
			else {na.dx = new NodoAlbero(x);}
		}
	}
	// stampa l'albero in ordine
	void print() {
		print(root); System.out.println();
	}
	void print(NodoAlbero na) {
		if (na == null) return;
		print(na.sx); // ricorsivo
		System.out.print(na.dato + " ");
		print(na.dx);
	}
	// find  - non ricorsivo
	// restituisce true se e solo se  x è nell'albero 
	boolean find(int x) {
		for(NodoAlbero i = root; i != null;) {
			if (x == i.dato) return true;
			// cerco a sx o destra a seconda del valore di x
			if ( x < i.dato) i = i.sx;
			else i = i.dx;
		}
		return false;
	}
	// numero di nodi
	int numeroDiNodi() {
		return numeroDiNodi(root);
	}
	// nodo da cui partire a contare
	int numeroDiNodi(NodoAlbero root) {
		if (root == null) return 0; // albero vuoto
		return numeroDiNodi(root.sx) + 1 + numeroDiNodi(root.dx);
	}
	// numero di foglie
	int numeroDiFoglie() {
		return numeroDiFoglie(root);
	}
	// nodo da cui partire a contare
	int numeroDiFoglie(NodoAlbero root) {
		if (root == null) return 0;
		if (root.sx == null && root.dx == null) return 1;
		return numeroDiFoglie(root.sx) + numeroDiFoglie(root.dx);
	}
	
}


public class GargantiniAngelo {
	public static void main(String[] args) {
		AlberoInteri ai = new AlberoInteri();
		ai.insert(5);
		ai.insert(50);
		ai.insert(10);
		ai.print();
		System.out.println(ai.find(5) + "= true???");
		System.out.println(ai.find(100) + "= false???");
		System.out.println(ai.numeroDiNodi());
		ai.insert(3);
		ai.print();
		System.out.println(ai.numeroDiNodi());
		System.out.println(ai.numeroDiFoglie());
	}

}
