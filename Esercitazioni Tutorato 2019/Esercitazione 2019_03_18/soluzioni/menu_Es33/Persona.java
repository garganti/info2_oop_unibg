package menu_Es33;

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
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Persona && ((Persona)o).nome.equals(nome) &&  ((Persona)o).cognome.equals(cognome);
	}
}
