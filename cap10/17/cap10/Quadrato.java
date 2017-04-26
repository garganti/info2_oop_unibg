package cap10;

class Rettangolo {
	Rettangolo(double b, double h) {
	}
	public String toString() {
		return "RETTANGOLO";
	}
	public double getBase(){return 1;}
}
public class Quadrato extends Rettangolo {
	public Quadrato(double l) {
		super(l, l);
	}
	// dei metodi specifici di quadrato
	double getLato(){
		return 0;
	}
	// ridefinisco il metodo toString
	@Override
	public String toString() {
		return "QUADRATO";
	}
	
	@Override
	public double getBase() {
		return getLato();
	}
	
	public static void main(String[] args) {
		Quadrato q = new Quadrato(5.8);
		String s = q.toString();
		String s2 = "" + q;
		System.out.println(q);
		
		System.out.println(q.getBase());
	}
	
}
