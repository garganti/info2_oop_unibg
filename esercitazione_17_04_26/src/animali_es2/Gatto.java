package animali_es2;

public class Gatto extends Animale{

	public Gatto(String s) {
		super(s);
	}
	
	@Override
	public void parla() {
		System.out.println("Miao!!!");
	}

	
	public void incontra(Topo g) {
		System.out.println(comeTiChiami() + ": <Ti prendo!!!!!!!!!!>");
	}
	
}
