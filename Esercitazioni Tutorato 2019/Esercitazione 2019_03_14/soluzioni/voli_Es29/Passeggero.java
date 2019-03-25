package voli_Es29;

public class Passeggero{

	static int counter=1;
	int idBiglietto;
	String nome, cognome;
	private char classe;
	private double prezzoBiglietto;
	
	public Passeggero(String nome, String cognome, char classe, double prezzoBiglietto) {
		this.nome=nome;
		this.cognome=cognome;
		idBiglietto=counter;
		counter++;
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
