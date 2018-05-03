package animale_Es38;

public class Topo extends Animale {

	public Topo(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parla() {
		System.out.println("Squit");
	}
	
	@Override
	public void incontra(Animale a) {
		if (a instanceof Gatto) {
			System.out.println(nome + ":<Aiutoooooo!!!>");
		} else {
			super.incontra(a);
		}
	}
}
