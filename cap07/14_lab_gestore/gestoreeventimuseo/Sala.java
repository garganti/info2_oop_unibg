package gestoreeventimuseo;

/**
 * rappresenta una sala
 * il nome indica quale sale si tratta
 */
public class Sala {
	String nome;

	Sala(String n) {
		nome = n;
	}
	// il nome è univoco
	@Override
	public boolean equals(Object os) {
		return nome.equals(((Sala)os).nome);
	}
	@Override
	public String toString() {
		return nome;
	}
	
}
