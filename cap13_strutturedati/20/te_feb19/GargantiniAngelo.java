package te_feb19;



class Lista{
	
	class NodoLista{
		String dato;
		NodoLista pros;
	}
	
	NodoLista inizio = null;
	
	// inserisce la stringa s in ordine contrario 
	void insert(String s){
		NodoLista p = inizio;
		NodoLista q = null;
		// continuo se p non è null
		// e il p.dato è > di s 
		while(p!=null && p.dato.compareToIgnoreCase(s)>0) {
			q = p;
			p = p.pros;
		}
		// inserisco s tra q e p
		NodoLista temp = new NodoLista();
		temp.dato = s;
		temp.pros = p;
		if (q== null)
			inizio = temp;
		else
			q.pros = temp;
		
	}
	
	void print(){
		System.out.print("[");
		for(NodoLista i = inizio; i!= null; i = i.pros) {
			System.out.print(i.dato + ",");
		}
		System.out.println("]");
	}
	
}

public class GargantiniAngelo{
	
	public static void main(String[] args) {
		Lista nomi = new Lista();
		nomi.print();
		nomi.insert("anna");
		nomi.print();
		nomi.insert("mario");
		nomi.print();
		nomi.insert("barbara");
		nomi.print();
		nomi.insert("america");
		nomi.print();
		nomi.insert("Piero");
		nomi.print();
		
	}
}