package pratiche;

import prog.utili.Data;

public class PraticaPenale extends PraticaTribunale {

	public PraticaPenale(String c, String d, Data u, int nol, GradoGidizio g) {
		super(c, d, u, nol, g);
	}

	@Override
	public String toString() {
		return "PENALE " + super.toString();
	}
	
}
