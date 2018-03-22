package cap10;

class Veicolo{
	int maxnRuote(){return 100;}
	// overloading
	int maxnRuote(int assi) {return assi*4;}
	
	void foo() {}
}

class Automobile extends Veicolo{
	// overriding
	@Override
	int maxnRuote(){return 4;}
	// overloading nella sottoclasse
	void foo(String s) {}
}

public class OverExample {
	public static void main(String[] args) {
		Veicolo v = new Automobile();
		System.out.println(v.maxnRuote());
	}

}
