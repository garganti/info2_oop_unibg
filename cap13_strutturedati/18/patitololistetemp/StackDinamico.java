package patitololistetemp;

public class StackDinamico<E> {

	// classe che rappresenta ogni singolo nodo
	class NodoStack{
		E dato;
		NodoStack pros;
	}
	
	NodoStack cima;
	
	StackDinamico(){
		cima = null;
	}
	
	public void push(E x) {
		//1. creo nodo
		NodoStack n = new NodoStack();
		n.dato = x;
		// 2 + 3 lo metto come primo
		n.pros = cima;
		cima = n;
	}
	
	public E pop() {
		E temp = cima.dato;
		cima =  cima.pros;
		return temp;
	}
	
	@Override
	public String toString() {
		String result = new String();
		for(NodoStack n = cima; n != null; n = n.pros) {
			result += n.dato + ", ";
		}
		return result;
	}
	
	public static void main(String[] args) {
		StackDinamico<Integer> stack = new StackDinamico<>();
		System.out.println("stack: " + stack);
		stack.push(4);
		System.out.println("stack: " + stack);
		stack.push(6);
		System.out.println("stack: " + stack);
		stack.push(2);
		System.out.println("stack: " + stack);
		stack.pop();		System.out.println("stack: " + stack);
		System.out.println("stack: " + stack);
		stack.pop();		System.out.println("stack: " + stack);
		System.out.println("stack: " + stack);
		stack.pop();		System.out.println("stack: " + stack);
	}
}

