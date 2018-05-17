package animale_Es38;

public class Animale {
	protected String nome;
	public Animale(String s) {
		nome=s;
	}
	public String comeTiChiami() {
		return nome;
	}
	public void parla() {}
	public void incontra(Animale a) {
		System.out.println(nome+":<Ciao, "+a.nome+">");
		parla();
	}
}
