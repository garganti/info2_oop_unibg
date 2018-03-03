package applicazione.data;

public class Persona {
	String nome;

	/**
	 * 
	 * @param n il nom della persona
	 */
	public Persona(String n) {
		nome = n;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
