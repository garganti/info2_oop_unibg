package noleggi;

import auto.Auto;
import auto.AutoEconomica;
import prog.utili.Data;

/** un noleggio di un solo giorno */
public class NoleggioGiornaliero extends Noleggio{

	private static final int COSTO_GIORNALIERO = 50;

	public NoleggioGiornaliero(Auto a, Data inizio, Data fine) throws NoleggioNonvalido {
		super(a, inizio, fine);
	}

	@Override
	boolean valido() {
		return inizio.quantoManca(fine) == 1;
	}

	@Override
	int costo() {
		return COSTO_GIORNALIERO;
	}

	@Override
	boolean autovalida() {
		return auto instanceof AutoEconomica;
	}

}
