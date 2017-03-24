package applicazione.data;

import prog.utili.Data;

public class Azienda {
	
	private String nome;
	short annoFondazione;
	
	public Azienda(String nome, int anno){
		this.nome = nome;
		annoFondazione = (short) anno;
	}
	// se anno non viene passato, assumo anno corrente
	public Azienda(String nome){
		this.nome = nome;
		annoFondazione = (short) new Data().getAnno();
	}
	
	@Override
	public String toString() {
		return nome + " fondata il " + annoFondazione;		
	}
	/**
	 * 
	 * @return da quanti anni è stata fondata
	 */
	public int daQuantiAnni() {
		int annoCorrente = new Data().getAnno();
		return annoCorrente - annoFondazione;
	}
}
