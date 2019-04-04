package cap13_strutturedati;

class EmptyStackException extends RuntimeException{}

public class Stack<E> {
	
	private static final int SIZE = 100;
	
	Object[] dati;
	private int top;

	public Stack(){
		dati = new Object[SIZE]; top = 0;
	}
	
	public void push(E e) {
		dati[top] = e; top++;
	}
	
	public E pop() {
		// se la pila è vuota non posso fare il pop
		if (top == 0 ) throw new EmptyStackException();
		top --; return (E) dati[top];
	}
	
	public boolean isEmpty() {return top == 0;}
	
	public static void main(String[] args) {
		Stack<Integer> numeri = new Stack<>();
		Stack<String> nomi = new Stack<>();
		numeri.push(5);
		numeri.push(50);
		numeri.push(20);
		System.out.println(numeri.pop());
		System.out.println(numeri.pop());
		System.out.println(numeri.pop());		
		//System.out.println(numeri.pop());	
	}

}
