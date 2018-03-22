package studente_Es25;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		
		Studente s=new Studente("AAA", "BBB", "Milano");
		s.addVoto(0, 10);
		s.addVoto(1, 30);
		s.addVoto(2, 20);
		
		/*Scanner in = new Scanner(System.in);
		Scanner inpos = new Scanner(System.in);
		Scanner cont = new Scanner(System.in);
		int voto;
		int pos;
		boolean continua=cont.nextBoolean();
		while (continua==true) {
			voto=in.nextInt();
			pos=inpos.nextInt();
			s.addVoto(pos, voto);
			continua=cont.nextBoolean();
		}*/
		System.out.println(s.calcolaMedia());
		System.out.println(s.getResidenza());
		s.setResidenza("Bergamo");
		System.out.println(s.getResidenza());
	}
}
