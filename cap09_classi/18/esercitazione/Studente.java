package esercitazione;

import java.util.Arrays;

public class Studente {

	public String nome, cognome;
	private String residenza;
	private int matricola = 1000;
	private int[] voti;

	// campo statico che rapresenta il numero max di voti di ogni studente
	public final static int N_VOTI = 30;

	// numero studenti creati
	private static int numeroStudentiImmatricolati = 0;
	
	public static int getNImmatricolati() {
		return numeroStudentiImmatricolati;
	}
	

	public Studente(String nome, String cognome, String residenza) {
		this.nome = nome;
		this.cognome = cognome;
		this.residenza = residenza;
		voti = new int[N_VOTI];
		// incrementa il numero di studenti immatricolati
		numeroStudentiImmatricolati++;
		matricola = numeroStudentiImmatricolati;
	}

	public Studente(String nome, String cognome) {
		this(nome, cognome, "ITALIA");
	}

	// METODI
	@Override
	public String toString() {
		return cognome + " " + nome + " " + matricola + " " + residenza + "voti:" + Arrays.toString(voti);
	}

	// ignora problemi di omonimia
	// due studenti uguali se hanno stesso nome e cognome
	public boolean equals(Studente s) {
		/*
		 * if (this.nome.equals(s.nome)) { if (this.cognome.equals(s.cognome)) { return
		 * true; } } return false;
		 */
		return this.nome.equals(s.nome) && this.cognome.equals(s.cognome);
	}

	// metodi di pura utilità
	// esempio
	static boolean isPari(int x) {
		return x % 2 == 0;
	}
	// al posto del costruttore (factory) 
	// esempio: data una stringa costruisce uno studente
	// due alternative: 1. costrutture (meglio)
	// 2: metodo statico
	static Studente makeStudente(String s) {
		String[] data = s.split(";");
		return new Studente(data[0], data[1]);
	}
	
	// PER ACCEDERE ai campi static
	
}
