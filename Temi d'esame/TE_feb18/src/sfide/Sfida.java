package sfide;

import prog.utili.Orario;

public abstract class Sfida implements Comparable<Sfida> {
	protected String descrizione;
	protected Orario orario;
	// partecipanti
	protected String p1,p2;
	protected boolean campionato; // se false è amichevole
	protected String ID;
	
	// costruttore con ID
	public Sfida(String ID, String descrizione, String p1, String p2, 
			Orario o, boolean c) throws OrarioNonValidoException {
		this.ID = ID;
		this.descrizione = descrizione;
		this.p1 = p1;
		this.p2 = p2;
		// controllo l'orario
		if (o.getOre()< 7 || o.getOre()>24)
			throw new OrarioNonValidoException(o);
		orario = o;
		campionato = c;
		// inc nSfide
		nSfide++;
	}
	// tieni memoria di quante sfide ho cosrtuito
	static int nSfide = 0;
	
	// costruttore senza ID
	/**
	 * 
	 * @param prefisso cambia nelle sottoclassi
	 * @param descrizione
	 * @param p1
	 * @param p2
	 * @param o
	 * @param c
	 * @throws OrarioNonValidoException
	 */
	public Sfida(char prefisso, String descrizione, String p1, String p2, 
			Orario o, boolean c) throws OrarioNonValidoException {
		this(Character.toString(prefisso)+nSfide,descrizione,p1,p2,o,c);
	}
	/**
	 * 
	 * @return punteggio della sfida
	 */
	public abstract int punteggio();
	
	@Override
	public String toString() {
		return ID + " " + orario.toString() + " TODOOOO  ,,,,,";
	}
	
	@Override
	public int compareTo(Sfida o) {
		return this.orario.compareTo(o.orario);
	}
}
