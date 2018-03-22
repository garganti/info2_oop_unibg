package menu_Es28;

import java.util.Scanner;

public class Prova {
	public static void main(String args[]) {
		Persona pers1= new Persona("nome1", "cognome1");
		Persona pers2= new Persona("nome2", "cognome2");
		
		Tavolo t1 =new Tavolo(5);
		t1.aggiungiPersona(pers1);
		t1.aggiungiPersona(pers2);
		t1.aggiungiPersona(pers1);
		

		Tavolo t2 =new Tavolo(8);
		t2.aggiungiPersona(pers1);
		t2.aggiungiPersona(pers2);
		t2.aggiungiPersona(pers1);
		
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		
		t1.inserisciPiatto(new Piatto(1,5,10));
		t1.inserisciPiatto(new Piatto(2,3,5));
		t1.inserisciPiatto(new Piatto(1,5,10));
		t1.inserisciPiatto(new Piatto(3,4,2));
		t1.inserisciPiatto(new Piatto(4,5,1));
		
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
	}

	
}
