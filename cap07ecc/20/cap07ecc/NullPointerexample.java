package cap07ecc;

import java.util.ArrayList;
import java.util.List;

class Studente{
	List<Integer> voti;
}


public class NullPointerexample {
	
	public static void main(String[] args) {
		Studente bravo = new Studente();
		bravo.voti.add(30);
	}

}
