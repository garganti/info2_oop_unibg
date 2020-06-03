package cap13_strutturedati;
// struttura dati dinamica FIFO
public class Coda<E> {

	class Nodo{
		E dato;
		Nodo pros;
	}
	
	Nodo primo;
	Nodo ultimo;
	
	void aggiungi(E a) {
		//A. crea nodo e mettici a in esso
		Nodo temp = new Nodo();
		temp.dato = a;
		//B. accodiamo 
		if (ultimo != null) {
			ultimo.pros = temp;
		} else {
			primo = temp;
		}
		//C. aggiorniamo come ultimo
		ultimo = temp;		
	}
	
	E preleva() {
		// se coda è vuota lancia eccezione
		if (primo==null) throw new RuntimeException("coda vuota");
		E temp = primo.dato;
		primo = primo.pros;
		// la coda adesso è vuota?
		if (primo == null) ultimo = null;
		return temp;
	}
	
	@Override
	public String toString() {
		String  s = "[";
		for(Nodo i = primo; i!= null; i = i.pros)
			s += i.dato + " ";
		return s+ "]";
	}
	
	public static void main(String[] args) {
		Coda<String> nomi = new Coda<String>();
		nomi.aggiungi("oooo");
		nomi.aggiungi("aaaa");
		nomi.aggiungi("bbbb");
		System.out.println(nomi.toString());
		System.out.println(nomi.preleva());
		System.out.println(nomi.toString());
		System.out.println(nomi.preleva());
		System.out.println(nomi.toString());
		System.out.println(nomi.preleva());
		System.out.println(nomi.toString());
		// attenzione la coda è vuota
		System.out.println(nomi.preleva());

		
	}
	
	
}
