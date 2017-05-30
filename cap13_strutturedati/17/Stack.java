
public class Stack {

	private class NodoStack{
		int dato;
		NodoStack pros;
	}
	// riferimento al primo elemento dello stack
	NodoStack cima;
	
	public Stack(){
		cima = null;
	}
	
	public void push(int x){
		// creo nuovo nodo
		NodoStack t = new NodoStack();
		// ci metto x
		t.dato = x;
		// punta come prossimo all'attuale primo
		t.pros = cima;
		// metti t come primo
		cima = t;
	}

	public int pop(){
		int result = cima.dato;
		cima = cima.pros;
		return result;
	}
	
	@Override
	public String toString() {
		String result = "[";
//		NodoStack i = cima;
//		while(i!= null){
//			// visito il nodo puntato da i
//			result += i.dato+ " ";
//			i = i.pros;
//		}
		for(NodoStack i = cima; i != null; i = i.pros){
			result += i.dato+ ( i.pros == null? "":", ");
		}
		return result + "]";
	}
	

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(3);
		System.out.println(s.toString());
		s.push(30);
		System.out.println(s.toString());
		s.push(10);
		System.out.println(s.toString());
		System.out.println("pop :" +s.pop());
		System.out.println(s.toString());
		System.out.println("pop :" +s.pop());
		System.out.println(s.toString());
		System.out.println("pop :" +s.pop());
		System.out.println(s.toString());
	}
}
