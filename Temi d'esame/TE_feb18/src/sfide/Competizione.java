package sfide;

import prog.utili.Orario;

public class Competizione extends Sfida{
	
	private static final int INCREMENTO = 500;

	private static final int PUNTEGIO_BASE = 1000;
	
	// punteggio del gioco da 1 a 10
	int punteggio;

	public Competizione(String ID, String descrizione, String p1, String p2, Orario o, boolean c, int p) throws OrarioNonValidoException {
		super(ID, descrizione, p1, p2, o, c);
		punteggio = p;
	}

	@Override
	public int punteggio() {
		return PUNTEGIO_BASE + punteggio * INCREMENTO;
	}

}
