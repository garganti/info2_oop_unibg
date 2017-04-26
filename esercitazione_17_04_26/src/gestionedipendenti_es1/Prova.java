package gestionedipendenti_es1;

public class Prova {
	
	public static void main(String[] args) {
		Dipendente d1=new Dipendente("Paolo", "Bianchi", 160, 10);
		DipendenteSpec d2=new DipendenteSpec("Marco", "Bianchi", 160, 10, 500);
		
		System.out.println("Stipendio di "+d1.nome+" "+d1.calcolaStipendio());
		System.out.println("Stipendio di "+d2.nome+" "+d2.calcolaStipendio());
	}

}
