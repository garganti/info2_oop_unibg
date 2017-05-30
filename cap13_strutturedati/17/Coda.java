// coda generica
public class Coda<E> {

	private class NodoCoda{
		E dato;
		NodoCoda pros;
	}
	
	NodoCoda primo;
	NodoCoda ultimo;

	Coda(){
		primo = ultimo = null;
	}
	
	public void insert(E x){
		NodoCoda t = new NodoCoda();
		t.dato = x;
		t.pros = null;
		// se primo elemento
		if (primo == null){
			primo = t;
			ultimo = t;
		} else{
			ultimo.pros = t;
			ultimo = t;
		}
	}
	
	public E preleva(){
		E result = primo.dato;
		primo = primo.pros;
		return result;
	}
	
	public void print(){
		for(NodoCoda i = primo; i!= null; i = i.pros){
			System.out.print(i.dato + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Coda<Integer> c = new Coda<>();
		c.insert(5);
		c.print();
		c.insert(10);
		c.print();
		c.insert(20);
		c.print();
		
	}
	
}
