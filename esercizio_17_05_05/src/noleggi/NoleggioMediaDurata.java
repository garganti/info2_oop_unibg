package noleggi;

import auto.Auto;
import prog.utili.Data;

/** un noleggio di media durata */
public class NoleggioMediaDurata extends Noleggio{

	private static final int COSTO_PRIMOGIORNO = 30;
	private static final int COSTO_AL_GIORNO_DOPO_PRIMO = 20;
	private static final int QUOTA_FISSA = 10;

	public NoleggioMediaDurata(Auto a, Data inizio, Data fine) throws NoleggioNonvalido {
		super(a, inizio, fine);
	}

	@Override
	boolean valido() {
		return inizio.quantoManca(fine) > 1;
	}

	@Override
	int costo() {
		int numeroGiorni = inizio.quantoManca(fine);
		return COSTO_PRIMOGIORNO + COSTO_AL_GIORNO_DOPO_PRIMO * (numeroGiorni -1) + QUOTA_FISSA;
	}

	@Override
	boolean autovalida() {
		return true; // TODO
	}
}
