package cap13_strutturedati;

class EmptyStackException2 extends RuntimeException {
}

public class Stack2<E> {

	private static final int SIZE = 100;

	Object[] dati;
	private int top;

	public Stack2() {
		dati = new Object[SIZE];
		top = 0;
	}

	public void push(E e) {
		// se l'array è già pieno
		if (top >= dati.length) {
			System.out.println("ingradisco l'array che è " + dati.length);
			// ingrandisco l'array
			// 1. creo uno più grande
			Object[] newArray = new Object[dati.length + SIZE];
			// 2. copio gli elementi in dati
			for(int i = 0; i < dati.length; i++) {
				newArray[i]= dati[i];
			}
			// sostituisco l'array originale con quello nuovo
			dati = newArray;
		}
		dati[top] = e; top++;
	}

	public E pop() {
		// se la pila è vuota non posso fare il pop
		if (top == 0)
			throw new EmptyStackException2();
		top--;
		return (E) dati[top];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public static void main(String[] args) {
		Stack2<Integer> numeri = new Stack2<>();
		Stack2<String> nomi = new Stack2<>();
		for (int i = 0; i < 300; i++)
			numeri.push(i);
		while (!numeri.isEmpty())
			System.out.print(numeri.pop() + " ");
	}

}
