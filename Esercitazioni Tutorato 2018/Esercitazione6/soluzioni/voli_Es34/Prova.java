package voli_Es34;

public class Prova {

	
	public static void main(String[] args) throws Exception {
		Volo v = new Volo("Roma", "Berlino", 150, 50);
		
		v.aggiungiPasseggero(new Passeggero(1,"P1" , "P1" , 'E', 10));
		v.aggiungiPasseggero(new Passeggero(2,"P3" , "P3" ,  'P', 30));
		v.aggiungiPasseggero(new Passeggero(3,"P2" , "P2" , 'E', 10));
		
		System.out.println("Eccezione superamento num. massimo passeggeri:");
		for (int i=0; i<60; i++) {
			try {
				v.aggiungiPasseggero(new Passeggero(i+4,"P3" , "P3" ,  'P', 30));
			} catch (Exception e) {
				System.err.println(e.getMessage());
				break;
			}
		}
		
		
		v.stampaPasseggeri();	
		System.out.println("-------------------");
		
		System.out.println(v.toString());
		
		v.rimuoviPasseggero(2);
		
		try {
			// Lancia eccezione per rimozione passeggero con idBiglietto inesistente
			v.rimuoviPasseggero(0);
		} catch (Exception e) {System.err.println(e.getMessage());}
		
		
		v.stampaPasseggeri();	
		System.out.println("-------------------");
		
		System.out.println(v.toString());
		
		System.out.println("Incasso totale " + v.incassoVolo());
		
		Volo vEmpty = new Volo("Roma", "Berlino", 150, 50);
		
		try {
			// Lancia eccezione per decollo di un volo senza passeggeri
			vEmpty.decolla();
		} catch (Exception e) {System.err.println(e.getMessage());}
				
	}
}
