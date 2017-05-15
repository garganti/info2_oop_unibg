package noleggi;

import auto.Auto;
import prog.utili.Data;

/** un noleggio di un solo giorno */
public class NoleggioClienteAbituale extends Noleggio{
	
	String numeroCartaFed;

	public NoleggioClienteAbituale(Auto a, Data inizio, Data fine, String ncf) throws NoleggioNonvalido {
		super(a, inizio, fine);
		numeroCartaFed = ncf;
	}

	@Override
	boolean valido() {
		// TODO
		return true;
	}

	@Override
	int costo() {
		return 15 * inizio.quantoManca(fine);
	}

	@Override
	boolean autovalida() {
		// TODO 
		return true;
	}

}
