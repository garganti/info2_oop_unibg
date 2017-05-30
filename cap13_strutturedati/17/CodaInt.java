// coda per interi
public class CodaInt {

	private class NodoCoda{
		int dato;
		NodoCoda pros;
	}
	
	NodoCoda primo;
	NodoCoda ultimo;

	CodaInt(){
		primo = ultimo = null;
	}
	
	public void insert(int x){
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
	
	public int preleva(){
		int result = primo.dato;
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
		CodaInt c = new CodaInt();
		c.insert(5);
		c.print();
		c.insert(10);
		c.print();
		c.insert(20);
		c.print();
		
	}
	
}
