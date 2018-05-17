package animale_Es38;

public class Gatto extends Animale {

	public Gatto(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parla() {
		System.out.println("Miao");
	}
	
	@Override
	public void incontra(Animale a) {
		if (a instanceof Topo) {
			System.out.println(nome + ":<Ti prendo!!!>");
		} else {
			super.incontra(a);
		}
	}
}
