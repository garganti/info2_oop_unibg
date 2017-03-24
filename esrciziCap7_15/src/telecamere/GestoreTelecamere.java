package telecamere;

import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

public class GestoreTelecamere {

	SequenzaOrdinata<Telecamera> teleSequenza;

	public GestoreTelecamere() {
		teleSequenza = new SequenzaOrdinata<Telecamera>();
	}

	public void add(Telecamera t) {
		teleSequenza.add(t);
	}

	/**
	 * 
	 * @param id id della telecamera da accendere
	 */
	public void accendi(int id) {
		for(Telecamera t: teleSequenza){
			if (t.D == id)
				t.accendi();
		}

	}

	public void print() {
		System.out.println("TELECAMERE");
		for (Telecamera t : teleSequenza) {
			System.out.println(t);
		}
	}

}
