package telecamere.prova;

import telecamere.GestoreTelecamere;
import telecamere.Telecamera;

public class Prova {

	public static void main(String[] args) {
		Telecamera t1 = new Telecamera("bivio A4", 300.6);
		Telecamera t2 = new Telecamera("sottopasso", 30.6);
		
		GestoreTelecamere gt = new GestoreTelecamere();
		gt.add(t1);
		gt.add(t2);
		
		gt.print();
		
		gt.accendi(1);
		
		gt.print();
		
		

	}

}
