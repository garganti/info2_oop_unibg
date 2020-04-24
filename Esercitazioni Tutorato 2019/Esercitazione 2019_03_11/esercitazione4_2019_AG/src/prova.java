import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Concessionario {

	// no public
	private ArrayList<Automobile> autoinvendita = new ArrayList<Automobile>();

	public void addAutomobile(Automobile a) {
		// controlla a
		autoinvendita.add(a);
	}

	public List<Automobile> autoinventita() {
		// espone la lista return autoinvendita;
		// 1. faccio una copia
		// return new ArrayList<Automobile>(autoinvendita);
		// 2. wrapper
		return Collections.unmodifiableList(autoinvendita);
	}

}

class prova {
	public static void main(String[] args) {
		Concessionario c = new Concessionario();
		Automobile wreck = new Automobile("dd", 0);
		// c.autoinvendita.add(wreck);
		c.autoinventita().add(wreck);
	}

}
