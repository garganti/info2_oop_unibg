package te_lug12_15;

public class Utente {
	
	static int N_UTENTI = 0;
	
	// id univoco dell'utente
	private int id;
	
	public Utente() {
		id = ++N_UTENTI;
	}

	// restituisce true se l'utente èmaggiorenne
	public boolean isMaggiorenne() {
		return false;
	}

	public int getId() {
		return id;
	}

}
