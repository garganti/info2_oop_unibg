package cap13_strutturedati;



public class StackDin<E> {

	// classe inner/nested
	private class Nodo {
		E dato;
		Nodo pros;
	}

	Nodo cima; // si riferisce al primo elelemtno dello stacK (ultimo inserito)
	
	public StackDin() {
		cima = null;
	}
	
	public void push(E a) {
		// creo il nodo
		Nodo nuovoNodo = new Nodo();
		nuovoNodo.dato = a;
		// lo metto per primo
		nuovoNodo.pros = cima;
		cima = nuovoNodo;
	}

	public E pop() {
		E temp = cima.dato;
		cima = cima.pros;
		return temp;
	}
	
	public boolean isEmpty() {
		return cima == null;
	}
	

	public static void main(String[] args) {
		StackDin<String> nomi = new  StackDin<String>();
		nomi.push("ciao");
		nomi.push("è");
		nomi.push("tardi");
		while(!nomi.isEmpty())
			System.out.println(nomi.pop());
		
	}


}
