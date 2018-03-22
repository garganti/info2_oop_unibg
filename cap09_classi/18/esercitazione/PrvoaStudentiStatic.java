package esercitazione;

public class PrvoaStudentiStatic {

	public static void main(String[] args) {
		System.out.println(Studente.getNImmatricolati());
		Studente s1 = new Studente("piero", "rossi", "italia");
		System.out.println(s1);
		//Studente.numeroStudentiImmatricolati = 1000;
		//System.out.println(Studente.numeroStudentiImmatricolati);
		Studente s2 = new Studente("giovanni", "verdi");
		System.out.println(s2);
		//System.out.println(Studente.numeroStudentiImmatricolati);
		Studente s3 = new Studente("john", "verdi");
		System.out.println(s3);
		//System.out.println(Studente.numeroStudentiImmatricolati);

	}

}
