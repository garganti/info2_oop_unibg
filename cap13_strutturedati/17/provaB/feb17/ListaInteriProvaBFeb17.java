package provaB.feb17;
/*Crea una classa ListaInteri che è una lista dinamica 
(lista semplicemente linkata) di interi. Deve avere i seguenti metodi
inserimento di un intero (in testa o dove preferisci, non è importante)
toString per avere una stringa con i numeri della lista
somma che restituisce la somma degli interi nella lista
max che restituisce il massimo degli interi nella lista
media che restituisce la media

Scrivi un main in cui inserisci una lista di numeri a 
tuo piacimento e stampi la somma, la media e 
il massimo chiamando i rispettivi metodi.*/
public class ListaInteriProvaBFeb17 {
	class NodoLista {
		int dato;
		NodoLista pros;
	}

	NodoLista inizio = null;

	public void inserisci(int x) {
		// inserici in testa
		NodoLista t = new NodoLista();
		t.dato = x;
		t.pros = inizio;
		inizio = t;
	}

	@Override
	public String toString() {
		String result = "{";
		for(NodoLista i = inizio; i != null; i = i.pros){
			result += i.dato + " ";
		}
		return result + "}";
	}

	public int somma() {
		int result = 0;
		for(NodoLista i = inizio; i != null; i = i.pros){
			result += i.dato;
		}
		return result;
	}
	public double media() {
		int result = 0;
		int count = 0;
		for(NodoLista i = inizio; i != null; i = i.pros){
			result += i.dato;
			count ++;
		}
		return result/(double)count;
	}

	public int max() {
		int result = Integer.MIN_VALUE;
		for(NodoLista i = inizio; i != null; i = i.pros){
			if (i.dato> result)
				result = i.dato;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ListaInteriProvaBFeb17 l = new ListaInteriProvaBFeb17();
		l.inserisci(30);
		l.inserisci(27);
		l.inserisci(18);
		l.inserisci(25);
		System.out.println(l.toString());
		System.out.println(l.somma());
		System.out.println(l.max());
		System.out.println(l.media());
	}
	

}
