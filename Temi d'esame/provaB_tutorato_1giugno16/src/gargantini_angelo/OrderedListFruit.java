package gargantini_angelo;

/**
 * Ogni Fruit ha un nome e una quantità. Scrivi una classe OrderedListFruit 
 *(spiegata dopo) con package uguale a cognome_nome nel file 
 * OrderedListFruit.java. 
 * OrderedListFruit rappresenta una collezione di frutti gestiti in modo 
 * che siano in ordine decrescente di quantità. E' una struttura dinamica 
 * ma non è generica. Ha un metodo insFruit che prende un Fruit e 
 * lo inserisce in ordine.
 * Ha un metodo find che dato il nome del frutto restituisce true 
 * se quel frutto è nella lista, altrimenti false. Se la lista è vuota 
 * solleva eccezione. Implementa anche un toString() che stampa i frutti nella
 * lista e che puoi usare per testare la tua classe.
 * In questa classe scrivi anche un main di prova in cui provi la 
 * tua struttura dati. Non fare alcuni input con l'utente. 
 * Alla fine consegnerai un solo file OrderedListFruit.java 
 */
public class OrderedListFruit{
	
	class NodoLista{
		Fruit data;
		NodoLista next;
	}
	
	NodoLista inizio;
	
	void insFruit(Fruit f){
		NodoLista p = inizio;
		NodoLista q = null;
		while(p!=null && p.data.compareTo(f) < 0){
			q = p;
			p = p.next;
		}
		// se all'inzio
		if (q == null){
			inizio = new NodoLista();
			inizio.next = p;
			inizio.data = f;
		} else{
			q.next = new NodoLista();
			q.next.data = f;
			q.next.next = p;
		}
	}
	//... find ...
	// TODO
	//
	public String toString(){
		String result = "";
		for(NodoLista p = inizio; p!=null; p = p.next){
			result += p.data.toString();
		}
		return result;		
	}
	
	public static void main(String[] args) {
		OrderedListFruit list = new OrderedListFruit();
		list.insFruit(new Fruit("banane", 10));
		list.insFruit(new Fruit("arance", 20));
		System.out.println(list.toString());
		list.insFruit(new Fruit("kiwi", 15));
		System.out.println(list.toString());		
	}
}

class Fruit implements Comparable<Fruit> {
	String fruitName;
	int quantity;

	public Fruit(String fruitName, int quantity) {
		this.fruitName = fruitName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return fruitName + " " + quantity;
	}
	
	public int compareTo(Fruit compareFruit) {
		// ordine decrescente
		return compareFruit.quantity - this.quantity;
	}
}