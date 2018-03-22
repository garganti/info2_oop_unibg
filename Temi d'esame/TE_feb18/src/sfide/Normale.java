package sfide;

import prog.utili.Orario;

public class Normale extends Sfida{
	
	String luogo;
	/**
	 * 
	 * @param ID
	 * @param descrizione
	 * @param p1
	 * @param p2
	 * @param o l'orario
	 * @param c se è competizione altrimenti amichevole
	 * @param l luogo 
	 * @throws OrarioNonValidoException 
	 */
	public Normale(String ID, String descrizione, String p1, String p2, Orario o, boolean c, String l) throws OrarioNonValidoException {
		super(ID, descrizione, p1, p2, o, c);
		luogo = l;
	}
	public Normale(String descrizione, String p1, String p2, Orario o, boolean c, String l) throws OrarioNonValidoException {
		super('N', descrizione, p1, p2, o, c);
		luogo = l;
	}
	@Override
	public int punteggio() {
		if (orario.getOre() < 12) return 200;
		else return 300;
	}

}
