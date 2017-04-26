package animali_es2;

public class Topo extends Animale{

	public Topo(String s) {
		super(s);
	}
	
	@Override
	//stessa segnatura
	public void parla() {
		System.out.println("Squit!!!");
	}
	
	//Overloading: segnatura diversa
	public void incontra(Gatto g) {
		System.out.println(comeTiChiami() + ": <Aiutooooooooooo!!!!!!!!!!>");
	}

}
