package sfide;

import prog.utili.Orario;

public class Pacifica extends Sfida{
	// nessun campo in più

	public Pacifica(String ID, String descrizione, String p1, String p2, Orario o, boolean c) throws OrarioNonValidoException {
		super(ID, descrizione, p1, p2, o, c);
	}

	@Override
	public int punteggio() {
		//TODO metti le costanti
		return campionato? 100 : 10;
	}
}
