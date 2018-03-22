package esercitazione;

public class ProvaStudente {
	
	public static void main(String[] args) {
		Studente s1 = new Studente("piero", "rossi", "italia");
		Studente s2 = new Studente("giovanni", "verdi");
		System.out.println(s1);
		//System.out.println(s2);
		Studente s3 = new Studente("giovanni", "verdi");
		//System.out.println(s2.equals(s3));
		//System.out.println(s3.nome);
		//System.out.println(s1.N_VOTI);
		//System.out.println(s3.N_VOTI);

		
		// se modifico 
		//s1.N_VOTI++;
		//System.out.println(s3.N_VOTI);
		
		
		// BINDING DINAMICO DI TO STRING
		//Object o = new Studente("paolo", "bianchi");
		//System.out.println(o);
		
	}

}
