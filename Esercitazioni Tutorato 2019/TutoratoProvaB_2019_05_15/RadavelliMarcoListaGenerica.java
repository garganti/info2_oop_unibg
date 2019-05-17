package radavellimarco;

class Lista<E extends Comparable<? super E>> {
	private NodoLista inizio;
	
	private class NodoLista {
		E dato;
		NodoLista pros;
	}
	
	public Lista() {
		inizio = null;
	}
	
	public void insert(E x) {
		NodoLista p = inizio, q = null;
		while (p!=null && p.dato.compareTo(x) < 0) {
			q = p;
			p = p.pros;
		}
		
		NodoLista r = new NodoLista();
		r.dato = x;
		
		r.pros = p;
		if (q == null) {
			inizio = r;
		} else {
			q.pros = r;
		}
	}
	
	public void remove(E x) {
		NodoLista p=inizio, q=null;
		while (p!=null && p.dato.compareTo(x) < 0) {
			q=p;
			p=p.pros;
		}
		
		if (p!=null && p.dato.equals(x)) {
			if (q==null) {
				inizio = inizio.pros;
			} else {
				q.pros = p.pros;
			}
		}
	}
	
	public void print() {
		if (inizio == null) System.out.println("");
		else {
			String s = inizio.dato.toString();
			for (NodoLista nodo = inizio.pros; nodo!=null; nodo = nodo.pros) {
				s = s + " " + nodo.dato.toString();
			}
			System.out.println(s);
		}
	}
}

public class RadavelliMarcoListaGenerica {
	public static void main(String[] args) {
		Lista<String> l = new Lista<>();
		l.insert("Gargantini");
		l.insert("Scandurra");
		l.insert("Garattini");
		l.insert("Brandolini");
		l.insert("Natali Sora");
		l.insert("Paraboschi");
		l.print();
		l.remove("Brandolini");
		l.print();
		l.insert("Brandolini");
		l.remove("Paraboschi");
		l.print();
	}
}
