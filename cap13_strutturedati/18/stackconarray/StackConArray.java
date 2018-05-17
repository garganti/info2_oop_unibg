package stackconarray;

import java.util.Arrays;

// voglio una pila generica di elementi T
// implementata come array
public class StackConArray<T> {
	
	private Object[] data;
	
	private int numElem;
	
	/** @param size dimensione massima della pila
	 * */
	StackConArray(int size){
		data = new Object[size];
		numElem = 0;
	}
	
	// aggiunge in cima alla pila
	public void push(T t){
		// se è pieno lancia eccezione
		if (data.length == numElem)
			throw new StackPienoException();
		data[numElem] = t;
		numElem ++;
	}
	// toglie dalla pila e lo restituisce
	public T pop() throws StackVuotoException{
		if (empty()) throw new StackVuotoException();
		//
		/*numElem = numElem -1;
		T t = data[numElem];
		data[numElem] = null;
		return t;*/
		return (T)data[--numElem];
	}
	
	// dice la pila è vuota
	public boolean empty(){
		return numElem == 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(data);
	}
	
	public static void main(String[] args) throws StackVuotoException {
		StackConArray<Integer> sti = new StackConArray<>(20);
		System.out.println(sti);
		sti.push(5);
		System.out.println(sti);
		sti.push(15);
		System.out.println(sti);
		sti.push(25);
		System.out.println(sti);
		System.out.println(" pop: "+sti.pop());
		System.out.println(sti);
		System.out.println(" pop: "+sti.pop());
		System.out.println(sti);
		System.out.println(" pop: "+sti.pop());
		System.out.println(sti);
		sti.push(10);
		System.out.println(sti);
		System.out.println(" pop: "+sti.pop());
		System.out.println(sti);
		System.out.println(" pop: "+sti.pop());
	}
	
}
