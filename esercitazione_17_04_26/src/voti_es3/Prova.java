package voti_es3;

public class Prova {

	public static void main(String[] args) {
		Studente s1=new Studente("s1","s1",1111);
		
		s1.e.add(new Esami("e1", 30));
		 
		s1.e.add(new Esami("e2", 30));
 
		s1.e.add(new Esami("e3", 30));
		
		s1.media();
		System.out.println("Media:" + s1.media);
		
		s1.calcolatasse();
		System.out.println("Tasse1:" + s1.tasse);
		
		s1.calcolatasse(1);
		System.out.println("Tasse1:" + s1.tasse);
		
		Studente s2=new Studente("s2","s2",2222);
		
		s2.e.add(new Esami("e1", 30));
		 
		s2.e.add(new Esami("e2", 30));
 
		s2.e.add(new Esami("e3", 30));
		
		s2.media();
		System.out.println("Media:" + s2.media);
		
		s2.calcolatasse();
		System.out.println("Tasse1:" + s2.tasse);
		
		s2.calcolatasse(1);
		System.out.println("Tasse1:" + s2.tasse);
	}

}
