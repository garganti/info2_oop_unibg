package ristorante_4_8;

public class ProvaRistorante {

	public static void main(String[] args) {
		Ristorante r = new Ristorante();
		Tavolo t1 = new Tavolo(5);
		Piatto pizza = new Piatto("pizza",2,10);
		//Piatto pizza2 = new Piatto("pizza",2,10);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		Persona p5 = new Persona();
		Persona p6 = new Persona();
		try {
			t1.aggiungi(p1);
			t1.aggiungi(p2);
			t1.aggiungi(p3);
			t1.aggiungi(p4);
			t1.aggiungi(p5);
			t1.aggiungi(p6);
		} catch (TavoloPienoException e) {
			System.err.println("qualche persona il più");
			e.printStackTrace();
		}
		System.out.println(t1);
	}
	
}
