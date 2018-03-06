package telecamere;

public class TelecameraNormale extends Telecamera{

	public TelecameraNormale(String d, float pos) {
		super(d, pos);
	}

	@Override
	public
	void accendi() {
		System.out.println("accendi");
	}

	@Override
	public
	void spegni() {
		System.out.println("spegni");
	}

	@Override
	public
	void bloccoImmagine() {
		System.out.println("blocca");
	}

}
