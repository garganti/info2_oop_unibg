package menu_Es28;

public class Persona {
	
	String nome,cognome;
	
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;		
	}

	
	@Override
	public String toString() {
		return nome+ " "+ cognome;
	}
}
