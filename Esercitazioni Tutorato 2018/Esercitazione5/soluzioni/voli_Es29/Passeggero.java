package voli_Es29;

public class Passeggero{

	int idBiglietto;
	String nome, cognome;
	private char classe;
	private double prezzoBiglietto;
	
	public Passeggero(int idBiglietto, String nome, String cognome, char classe, double prezzoBiglietto) {
		this.nome=nome;
		this.cognome=cognome;
		this.idBiglietto=idBiglietto;
		this.classe=classe;
		this.prezzoBiglietto=prezzoBiglietto;
	}

	public char getClasse() {
		return classe;
	}

	public void setClasse(char classe) {
		this.classe = classe;
	}

	public int getIdBiglietto() {
		return idBiglietto;
	}
	
	public double getPrezzoBiglietto() {
		return prezzoBiglietto;
	}
	
	@Override
	public String toString() {
		return idBiglietto + " " + nome + " " + cognome + " " + classe +" " + prezzoBiglietto;
	}

}
