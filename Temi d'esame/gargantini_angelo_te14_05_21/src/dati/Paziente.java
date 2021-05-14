package dati;

public class Paziente {
	
	String nome;

	// codice numerico univoco 
	int id;
	
	// l'id viene calcolato dal nome
	public Paziente(String nome) {
		id = calcolaID(nome);
		this.nome = nome;
	}

	// dato un nome costruisce un ID che sia univoco possibilmente
	static private int calcolaID(String nome) {
		return nome.length() * 1000000 + nome.charAt(1)  * 1000 +
		nome.charAt(3) * 10 + (int)(Math.random()*10);
	}
	
	@Override
	public String toString() {
		return nome + "(" + id +")";
	}
}
