package gargantiniangeloBST;

class Computer implements Comparable<Computer>{
	int costo;
	Computer(int c){costo = c;}
	@Override
	public int compareTo(Computer o) {
		return this.costo - o.costo;
	}	
	@Override
	public String toString() {
		return "C$"+costo;
	}
}

class AlberoComputer{
	
	class NodoAlberoComputer{
		Computer dato;
		AlberoComputer sx, dx;
	}
	
	NodoAlberoComputer root;
	
	public AlberoComputer() {root = null;}	

	// inserisci un computer
	void insert(Computer c) {
		// se l'albero è vuoto
		if (root == null) {
			root = new NodoAlberoComputer();
			root.dato = c;
			root.sx = new AlberoComputer();
			root.dx = new AlberoComputer();
		} else {
			int cmp = root.dato.compareTo(c);
			if (cmp < 0) {
				root.dx.insert(c);
			} else {
				root.sx.insert(c);
			}
		}
	}
	// stampa il contenuto in ordine
	void print() {
		if (root == null) return;
		root.sx.print();
		System.out.print(root.dato + " ");
		root.dx.print();		
	}
	
	Computer getMax() {
		// se non c'è un albero a dx, restituisci la root
		if (root.dx.root == null) return root.dato;
		// altrimenti prendi il max di destra
		return root.dx.getMax();
	}
}


public class GargantiniAngelo {
	public static void main(String[] args) {
		AlberoComputer sc = new AlberoComputer();
		sc.insert(new Computer(1000));
		sc.insert(new Computer(100));
		sc.insert(new Computer(500));
		sc.insert(new Computer(2000));
		sc.insert(new Computer(3000));
		sc.insert(new Computer(50000));
		sc.print();
		System.out.println(sc.getMax());
	}
	
}
