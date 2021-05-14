package dati;

import prog.utili.Data;

// referto generico
abstract public class Referto implements Comparable<Referto>{

	protected Data data;
	
	private Paziente paziente;
	
	private int id;
	static private int numeroReferti = 1;
	
	/**
	 * 
	 * @param d data in cui � stato fatto il rferto
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
	// restuituisce la criticit� del referto
	public abstract double criticity();
	
	/**
	 * @return true se e solo se il referto � ancora valido
	 */
	public abstract boolean validity();
	
	// restituise l'id del paziente a cui si riferisce questo referto
	public int getPazienteID() {
		return paziente.id;
	}
	// Rferto � comparable per Data
	@Override
	public int compareTo(Referto o) {
		return this.data.compareTo(o.data);
	}
	
}
