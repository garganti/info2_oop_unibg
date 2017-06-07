package provaB.gen17;

public class ListaPari100 {

	class Nodo{
		int dato;
		Nodo next;
	}
	// primo elemento della lista
	Nodo start;
	// ultimo elemento della lista (per aggiungere in coda)
	Nodo ultimo;
	
	public ListaPari100() {
		start = null;
		ultimo = null;
		for(int i = 2 ; i <= 100 ; i = i + 2)
			this.ins(i);
	}
	// inserisci in coda alla lista
	private void ins(int val){		
		Nodo nuovo = new Nodo();
		nuovo.dato = val;		
		if(start == null){
			start = nuovo;
			ultimo = nuovo;
		} else{
			ultimo.next = nuovo;
			ultimo = nuovo;
		}
	}
	
	public int somma(){
		int tot = 0;
		for(Nodo i = start ; i != null ; i = i.next)
			tot += i.dato;
		return tot;
	}
	
	public String toString(){
		String s = "";
		for(Nodo i = start ; i != null ; i = i.next)
			s = s.concat(i.dato +  " ");
		return s;
	}
	
	public static void main(String[] args){
		
		ListaPari100 lp = new ListaPari100();
		
		System.out.println(lp.toString());	
		System.out.println(lp.somma());
	} 
}
