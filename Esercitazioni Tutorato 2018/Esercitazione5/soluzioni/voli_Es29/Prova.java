package voli_Es29;

public class Prova {

	
	public static void main(String[] args) {
		Volo v = new Volo("Roma", "Berlino", 150, 50);
		
		v.aggiungiPasseggero(new Passeggero(1,"P1" , "P1" , 'E', 10));
		v.aggiungiPasseggero(new Passeggero(2,"P3" , "P3" ,  'P', 30));
		v.aggiungiPasseggero(new Passeggero(3,"P2" , "P2" , 'E', 10));
		
		v.stampaPasseggeri();	
		System.out.println("-------------------");
		
		System.out.println(v.toString());
		
		v.rimuoviPasseggero(2);
		
		v.stampaPasseggeri();	
		System.out.println("-------------------");
		
		System.out.println(v.toString());
		
		System.out.println("Incasso totale " + v.incassoVolo());
		
		
		for (int i=0; i<100; i++)
			System.out.println((new Volo("Roma", "Berlino", 150, 50)).toString());
				
	}
}
