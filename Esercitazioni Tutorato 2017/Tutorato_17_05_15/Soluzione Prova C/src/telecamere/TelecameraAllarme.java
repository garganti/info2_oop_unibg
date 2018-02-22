package telecamere;

public class TelecameraAllarme extends Telecamera {

	String numTelefono;

	public TelecameraAllarme(String d, float pos, String nt) throws PosizioneOutOfBoundException {
		super(d, pos);
		numTelefono = nt;
	}

	@Override
	public boolean spegni() {
		System.err.println("NON POSSO SPEGNERE");
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " ALLARMATA";
	}

}
