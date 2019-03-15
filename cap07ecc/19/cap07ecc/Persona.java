package cap07ecc;

public class Persona {

	private String nome;

	/**
	 * 
	 * @param nome deve essere di almeno una lettera
	 * @param cognome deve essere di almeno una lettera
	 */
	public Persona(String nome, String cognome) {
		if (nome == null || nome.length()<1) {
			System.err.println("cosa hai scritto????");
			// prevenire la crezione
			throw new RuntimeException("nome non valido");
		}
		this.nome = nome;

	}
	
	public static void main(String[] args) {
		try{
			Persona p = new Persona("","");
			System.out.println("il mio nome è " + p.nome);
		}catch(Exception e) {
			System.out.println("errore");
		}
		Persona p2 = new Persona(null,null);
	}
}
