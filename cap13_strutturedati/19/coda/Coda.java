package coda;

public class Coda<E> {
	private class NodoCoda {
		public NodoCoda(E e) {
			dato = e;
			pros = null;
		}

		E dato;
		NodoCoda pros;
	}

	NodoCoda primo, ultimo;

	Coda() {
		primo = ultimo = null;
	}

	void insert(E e) {
		NodoCoda n = new NodoCoda(e);
		// se lista è vuota
		if (primo == null) {
			primo = n;
			ultimo = n;
		} else {
			// lista non vuota
			// collego il nuovo nodo all'ultimo di adesso
			ultimo.pros = n;
			ultimo = n;
		}
	}
	
	E remove(){
		// se vuoto, lancia eccezione
		if (primo ==null) throw new RuntimeException("coda vuota !!");
		//
		E temp = primo.dato;
		primo = primo.pros;
		// controlla se la lista è ora vuota
		if (primo == null) ultimo = null;
		return temp;
	}

	@Override
	public String toString() {
		String result = "";
		for (NodoCoda i = primo; i != null; i = i.pros) {
			if (result.length() > 0)
				result += ",";
			result += i.dato;
		}
		return result;
	}

	public static void main(String[] args) {
		Coda<String> nomi = new Coda<>();
		nomi.insert("A");
		nomi.insert("B");
		nomi.insert("C");
		System.out.println(nomi);
		System.out.println(nomi.remove());
		System.out.println(nomi.remove());
		System.out.println(nomi.remove());
		System.out.println(nomi.remove());
	}
}
