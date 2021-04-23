package cap10;

class Rettangolo{
	Rettangolo(int x,int y){}
}

class Quadrato extends Rettangolo{
	public Quadrato(int l) {
		// NOO return new Rettangolo(l,l);
		super(l,l);
	}
	public Quadrato() {
		this(zero());
	}
	
	private static int zero() {
		return 0;
	}
}
public class ProvaQuadrato{	
	public static void main(String[] args) {
		Quadrato q = new Quadrato(5);
		Quadrato q0 = new Quadrato();
	}
	
}
