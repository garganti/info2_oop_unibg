package tasse_Es39;

public class Persona {
	private String nome, cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return nome+" "+cognome;
	}
}
