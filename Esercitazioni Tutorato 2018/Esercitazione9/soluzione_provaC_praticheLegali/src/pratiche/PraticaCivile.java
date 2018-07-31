package pratiche;

import prog.utili.Data;

public class PraticaCivile extends PraticaTribunale {

	public PraticaCivile(String c, String d, Data u, int nol, GradoGidizio g) {
		super(c, d, u, nol, g);
	}
	
	@Override
	public String toString() {
		return "CIVILE " + super.toString();
	}

}
