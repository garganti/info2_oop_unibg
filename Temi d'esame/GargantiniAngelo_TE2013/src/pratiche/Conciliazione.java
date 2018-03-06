package pratiche;

import prog.utili.Data;

public class Conciliazione extends PraticaLegale {

	public Conciliazione(String c, String d, Data u, int nol) {
		super(c, d, u, nol);
		// TODO Auto-generated constructor stub
	}

	private static final int COSTO_ORARIO_C = 120;

	@Override
	int costo() {
		return numeroOre*COSTO_ORARIO_C;
	}

}
