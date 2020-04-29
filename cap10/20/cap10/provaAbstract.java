package cap10;

abstract class EssereVivente {
	protected int eta;

	EssereVivente(int e) {
		eta = e;
	}

	
	EssereVivente(String e) {
		this(Integer.parseInt(e));
	}

	abstract String getName();

	int aspettativadivita() { // NOV VA BENE
		if (this instanceof Persona) {
			return 100;
		}
		return 0;
	}
}

class Persona extends EssereVivente {
	String nome, cognome;

	Persona(String nome, String cognome, int eta) {
		super(eta);
		this.cognome = cognome;
		this.nome = nome;
	}

	@Override
	String getName() {
		return nome + cognome;
	}
}

class Cane extends EssereVivente {
	Cane(int e) {
		super(e);
	}

	@Override
	String getName() {
		return "Fido";
	}

}

public class provaAbstract {

	public static void main(String[] args) {
	}

}
