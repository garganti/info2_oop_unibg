package pratiche;

import prog.utili.Data;

// rapresenta le pratiche civile e penali
// che hanno un grado di giudizio
abstract public class PraticaTribunale extends PraticaLegale {
	/**
	 * 
	 * @param c
	 * @param d
	 * @param u
	 * @param nol
	 * @param g grado di giudizio
	 */
	public PraticaTribunale(String c, String d, Data u, int nol, GradoGidizio g) {
		super(c, d, u, nol);
		grado = g;
	}


	// costo orario per queste pratiche
	private static final int COSTO_ORARIO = 100;
	//
	protected GradoGidizio grado;

	
	@Override
	int costo() {
		// dal grado di giudizio * per il numero di ore spese * 100 euro /h,
		return grado.fattoreCosto * numeroOre * COSTO_ORARIO;
	}
	
	@Override
	public String toString() {
		return super.toString() + " GRADO " + grado;
	}
	
	
}
