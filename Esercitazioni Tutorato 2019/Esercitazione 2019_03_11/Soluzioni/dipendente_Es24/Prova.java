package dipendente_Es24;

public class Prova {

	public static void main(String[] args) {
		Dipendente d = new Dipendente("AAA",1000);
		
		d.incrementaStipendio(0.5);
		System.out.println(d.getStipendio());
	}
	
}
