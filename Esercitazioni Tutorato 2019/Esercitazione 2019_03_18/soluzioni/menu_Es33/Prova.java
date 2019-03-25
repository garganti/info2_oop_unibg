package menu_Es33;

import java.util.ArrayList;
import java.util.List;

public class Prova {
	
	static List<Tavolo> listaTavoli;
	
	public static void main(String args[]) {
		Persona pers1= new Persona("nome1", "cognome1");
		Persona pers2= new Persona("nome2", "cognome2");
		
		Tavolo t1 =aggiungiTavolo(1, 5);
		t1.aggiungiPersona(pers1);
		t1.aggiungiPersona(pers2);
		try {
			System.out.println("Cattura eccezione persona già esistente:");
			t1.aggiungiPersona(pers1);
		} catch (RuntimeException e) {e.printStackTrace();}

		Tavolo t2 =new Tavolo(2, 1);
		t2.aggiungiPersona(pers1);
		try {
			System.out.println("Cattura eccezione persona più dei posti disponibili:");
			t2.aggiungiPersona(pers2);
		} catch (RuntimeException e) {e.printStackTrace();}
		//t2.aggiungiPersona(pers1);
		
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		
		t1.inserisciPiatto(new Piatto(1,5,10));
		t1.inserisciPiatto(new Piatto(2,3,5));
		try {
			System.out.println("Cattura eccezione piatto con stesso ID:");
			t1.inserisciPiatto(new Piatto(1,5,10));
		} catch (RuntimeException e) {e.printStackTrace();}
		t1.inserisciPiatto(new Piatto(3,4,2));
		t1.inserisciPiatto(new Piatto(4,5,1));
		
		try {
			System.out.println("Rimuovi piatto con ID inesistente:");
			t1.rimuoviPiatto(5);
		} catch (RuntimeException e) {e.printStackTrace();}
		
		System.out.println("------------------------");
		t1.visualizzaPersone();
		System.out.println("------------------------");
		t1.visualizzaPiatti();
		
		t1.rimuoviPiatto(2);
		System.out.println("------------------------");
		t1.visualizzaPiatti();
		
		t1.modificaQta(1, 6);
		System.out.println("------------------------");
		t1.visualizzaPiatti();
		
		System.out.println("Il totale è: " + t1.calcolaTotale());
		System.out.println("Il prezzo medio a persona è: " + t1.calcolaPrezzoMedio());
		
		try {
			System.out.println("Eccezione tavolo con uguale ID");
			aggiungiTavolo(1, 2);
		} catch (RuntimeException e) {e.printStackTrace();}
		
	}
	
	static Tavolo aggiungiTavolo(int id, int coperti) {
		if (listaTavoli == null) listaTavoli = new ArrayList<>();
		if (esisteTavolo(id)) throw new RuntimeException("Tavolo "+id+"già esistente");
		else {
			listaTavoli.add(new Tavolo(id, coperti));
			return listaTavoli.get(listaTavoli.size()-1);
		}
	}
	
	static boolean esisteTavolo(int id) {
		for (Tavolo t : listaTavoli) if (t.id==id) return true;
		return false;
	}

	
}
