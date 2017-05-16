package telecamere;

public class TelecameraNormale extends Telecamera{

	public TelecameraNormale(String d, float pos) throws PosizioneOutOfBoundException {
		super(d, pos);
	}
	
	@Override
	public boolean spegni() {
		System.out.println("spegni");
		return true;
	}

}
