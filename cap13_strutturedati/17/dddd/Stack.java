package dddd;

import java.util.Arrays;

public class Stack<E> {

	Object[] dati; // dati veri e propri
	final static int SIZE = 3;
	int top; // la prima posizione libera
	
	public Stack(){
		dati = new Object[SIZE];
		top = 0;
	}
	public void push(E x){
		if(top>= dati.length){
			// allargo l'array
			Object[] newDati = new Object[dati.length+ SIZE];
			// copio gli elementi già presenti
			for(int i =0 ; i < dati.length; i++){
				newDati[i] = dati[i];
			}
			// sostituisco il nuvo array
			dati = newDati;
		}
		dati[top] = x;
		top++;
	}

	@Override
	public String toString() {
		return "top"+top + " contenuto " + Arrays.toString(dati);
	}
	
	public E pop(){
		E result = (E) dati[--top];
		dati[top] = null; // supefluo
		return result;
	}

	public static void main(String[] args) {
		Stack<Integer> si = new Stack<>();
		System.out.println(si);
		si.push(10);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		si.push(20);
		System.out.println(si);
		//System.out.println(si.pop());
		//System.out.println(si);
	}
	
}
