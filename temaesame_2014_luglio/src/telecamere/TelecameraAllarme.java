package telecamere;

public class TelecameraAllarme extends Telecamera {

	String numTelefono;

	public TelecameraAllarme(String d, float pos, String nt) {
		super(d, pos);
		numTelefono = nt;
	}

	@Override
	public void accendi() {
		System.out.println("accendi");
	}

	@Override
	public void spegni() {
		System.err.println("NON POSSO SPEGNERE");
	}

	@Override
	public void bloccoImmagine() {
		System.out.println("blocca");
	}

	@Override
	public String toString() {
		return super.toString() + " ALLARMATA";
	}

}
