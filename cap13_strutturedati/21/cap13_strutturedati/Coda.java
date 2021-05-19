package cap13_strutturedati;

public class Coda<E> {
	
	class NodoCoda{
		E dato;
		NodoCoda pros;
	}
	NodoCoda primo;
	NodoCoda ultimo;

	public Coda() {
		primo = null;
		ultimo = null;
	}

	public void aggiungi(E e) {
		NodoCoda nuovoNodo = new NodoCoda();
		nuovoNodo.dato = e;
		nuovoNodo.pros = null; // useless
		
		if (ultimo != null)
			ultimo.pros = nuovoNodo;
		else // coda vuota
			primo = nuovoNodo;
		// in ogni caso
		ultimo = nuovoNodo;
	
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(NodoCoda i = primo; i != null; i = i.pros) {
			result += i.dato + ",";
		}
		return result + "]";
	}
	
	
	public static void main(String[] args) {
		Coda<String> nomi = new Coda<>();
		nomi.aggiungi("piero");
		System.out.println(nomi);
		nomi.aggiungi("paolo");
		System.out.println(nomi);
		nomi.aggiungi("giovanni");
		System.out.println(nomi);
		System.out.println(nomi.preleva());
		System.out.println(nomi);
		System.out.println(nomi.preleva());
		System.out.println(nomi);
		System.out.println(nomi.preleva());
		System.out.println(nomi);
		System.out.println(nomi.preleva());
	}
	public E preleva() {
		if (primo == null)
			throw new RuntimeException("coda vuota");
		E result = primo.dato;
		primo = primo.pros;
		if (primo == null)
			ultimo = null;
		return result;
	}
	
}
