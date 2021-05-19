package cap13_strutturedati;

import java.util.EmptyStackException;

// class generica 
// se invece che generica vi avessi detto
// uno stack di stringhe non scrivevo
// class Stack<String> !!! ma semplicmente usao String
// class Stack{ ... String ...}
//
public class Stack<E> {
	
	NodoStack cima;
	
	// class nested/inner
	class NodoStack{
		E dato;
		NodoStack pros;
	}
	
	public Stack() {
		cima = null;
	}

	public void push(E e) {
		NodoStack nuovoNodo = new NodoStack();
		nuovoNodo.dato = e;
		// settare il pros
		nuovoNodo.pros = cima;
		cima = nuovoNodo;
	}
	
	public E pop() {
		// pila vuota?
		if (cima == null)
			//throw new RuntimeException("pila vuota non puoi fare il pop");
			throw new EmptyStackException();
		E primoElemento = cima.dato;
		// cambio il primo elemento
		cima = cima.pros;
		// return dell'elemento
		return primoElemento;
	}
	// [ele1, elem2, ...]
	@Override
	public String toString() {
		String result = "[";
		for(NodoStack i = cima; i != null; i = i.pros) {
			result += i.dato.toString() + ",";
		}
		result += "]";
		return result;
	}
	
	
	public static void main(String[] args) {
		Stack<String> nomi = new Stack<>();
		nomi.push("piero");
		System.out.println(nomi);
		nomi.push("paolo");
		System.out.println(nomi);
		nomi.push("giovanni");
		System.out.println(nomi);
		System.out.println(nomi.pop());
		System.out.println(nomi.pop());
		System.out.println(nomi.pop());
		//System.out.println(nomi.pop());
	}
	
}
