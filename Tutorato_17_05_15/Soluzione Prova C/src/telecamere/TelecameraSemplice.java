package telecamere;

public class TelecameraSemplice extends Telecamera {

	String costrutture;

	public TelecameraSemplice(String d, float pos, String c) throws PosizioneOutOfBoundException {
		super(d, pos);
		costrutture = c;
	}

	@Override
	public boolean spegni() {
		System.out.println("spegni");
		return true;
	}

	@Override
	public boolean bloccoImmagine() {
		System.err.println("BLOCCO NON SUPPORTATO");
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " SEMPLICE";
	}

}
