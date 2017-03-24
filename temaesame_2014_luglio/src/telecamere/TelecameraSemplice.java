package telecamere;

public class TelecameraSemplice extends Telecamera {

	String costrutture;

	TelecameraSemplice(String d, float pos, String c) {
		super(d, pos);
		costrutture = c;
	}

	@Override
	public void accendi() {
		System.out.println("accendi");
	}

	@Override
	public void spegni() {
		System.out.println("spegni");
	}

	@Override
	public void bloccoImmagine() {
		System.err.println("BLOCCO NON SUPPORTATO");
	}

}
