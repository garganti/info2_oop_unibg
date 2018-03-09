import java.util.Vector;

public class Studente {
	// CAMPI
	String nome;
	String cognome;
	long matricola;
	// voti che lui ha preso
	Vector<Integer> voti;

	public Studente(int m, String n, String c) {
		nome = n;
		matricola = m;
		cognome = c;
		voti = new Vector<>();
	}

	/**
	 * senza matricola (-1)
	 * 
	 * @param n
	 * @param c
	 */
	public Studente(String n, String c) {
		this(-1, n, c);
	}

}
