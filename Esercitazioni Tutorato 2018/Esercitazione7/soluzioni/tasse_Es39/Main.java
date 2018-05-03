package tasse_Es39;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	
		Studente s1 = new Studente("Angelo", "Gargantini", 999999, Arrays.asList(new Esame("Informatica", 18), new Esame("Matematica",30)));
		
		Studente s2 = new Studente("Marco", "Radavelli", 888888, Arrays.asList(new Esame("Informatica", 28), new Esame("Matematica",27)));
		
		System.out.println(s1.getTasse(2000));
		System.out.println(s1.getTasse(2000, 1));
		
		System.out.println(s2.getTasse(2000));
		System.out.println(s2.getTasse(2000, 3));
		
	}
}
