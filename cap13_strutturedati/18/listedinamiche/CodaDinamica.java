package listedinamiche;

public class CodaDinamica<E> {

	// classe che rappresenta ogni singolo nodo
	class NodoCoda {
		E dato;
		NodoCoda pros;
	}

	NodoCoda primo;
	NodoCoda ultimo;

	CodaDinamica() {
		primo = null;
		ultimo = null;
	}

	// aggiungi in coda l'elemento x
	void aggiungi(E x) {
		NodoCoda n = new NodoCoda();
		n.dato = x;
		n.pros = null;
		// se la coda è vuota
		if (ultimo == null) {
			primo = n;
			ultimo = n;
		}else {
			// la coda non è vuota
			// ultimo diventa penultimo
			ultimo.pros = n;
			// il nuvo ultimo è n
			ultimo = n;
		}
	}

	@Override
	public String toString() {
		String result = new String();
		for (NodoCoda n = primo; n != null; n = n.pros) {
			result += n.dato + ", ";
		}
		return result;
	}

	// prende il primo elemento della lista
	E preleva() {
		// se la coda è vuota
		if (primo == null) throw new RuntimeException("coda vuota!!!");
		//
		E temp = primo.dato;
		// metto come primo elemento il secondo
		primo = primo.pros;
		// se la coda è ora vuota
		if (primo == null) ultimo = null;
		return temp;
	}
	
	public static void main(String[] args) {
		CodaDinamica<Integer> stack = new CodaDinamica<>();
		System.out.println("coda: " + stack);
		stack.aggiungi(4);
		System.out.println("coda: " + stack);
		stack.aggiungi(6);
		System.out.println("coda: " + stack);
		stack.aggiungi(2);
		System.out.println("coda: " + stack);
		//
		System.out.println("preleva: " + stack.preleva());
		System.out.println("coda: " + stack);
		System.out.println("preleva: " + stack.preleva());
		System.out.println("coda: " + stack);
		System.out.println("preleva: " + stack.preleva());
		System.out.println("coda: " + stack);
		// 
		stack.aggiungi(278);
		System.out.println("coda: " + stack);

	}
}
