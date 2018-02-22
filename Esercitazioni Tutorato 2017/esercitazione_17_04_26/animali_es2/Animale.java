package animali_es2;

public class Animale {

	private String nome;

	public Animale(String s) {
		nome = s;
	}

	public String comeTiChiami() {
		return nome;
	}

	public void parla() {
	}

	public void incontra(Animale a) {
		System.out.println(nome + ":<Ciao, " + a.nome + ">");
		parla();
	}

}
