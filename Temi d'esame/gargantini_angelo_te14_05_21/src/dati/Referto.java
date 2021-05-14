package dati;

import prog.utili.Data;

// referto generico
abstract public class Referto {

	protected Data data;
	
	private Paziente paziente;
	
	private int id;
	static private int numeroReferti = 1;
	
	/**
	 * 
	 * @param d data in cui è stato fatto il rferto
	 * @param p paziente a cui si riferisce
	 */
	protected Referto(Data d, Paziente p) {
		this.data = d;
		this.paziente = p;	
		id = numeroReferti ++;
	}
	

	@Override
	public String toString() {
		return id + " " + data + " paziente " + paziente;
	}
	// restuituisce la criticità del referto
	public abstract double criticity();
	
	/**
	 * @return true se e solo se il referto è ancora valido
	 */
	public abstract boolean validity();
	
}
