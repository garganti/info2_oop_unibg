package cap13_strutturedati;


public class PilaDinamica<E> {

	// inner class or nested class
	private class Nodo{
		E dato;
		Nodo pros;
	}
	private Nodo cima;
	
	PilaDinamica(){cima = null;}
	
	boolean isEmpty() {return cima == null;}
	
	void push(E e) {
		// costruisci un nuovo nodo
		Nodo newNodo = new Nodo();
		newNodo.dato = e;
		// metti il pros del nuovo nodo
		newNodo.pros = cima;
		// cambia la cima;
		cima = newNodo;
	}
	
	E pop() {
		E result = cima.dato;
		cima = cima.pros;
		return result;
	}
	
	
	@Override
	public String toString() {
		String result = "";
		for(Nodo i = cima; i != null; i= i.pros) {
			result +="->" + i.dato;
		}
		return result;
	}
	
	public static void main(String[] args) {
		PilaDinamica<String> nomi = new PilaDinamica<>();
		nomi.push("A"); System.out.println(nomi.toString());
		nomi.push("B");System.out.println(nomi.toString());
		nomi.push("C");System.out.println(nomi.toString());
		System.out.println(nomi.pop());System.out.println(nomi.toString());
		System.out.println(nomi.pop());System.out.println(nomi.toString());
		System.out.println(nomi.pop());System.out.println(nomi.toString());
		
		
	}
}
