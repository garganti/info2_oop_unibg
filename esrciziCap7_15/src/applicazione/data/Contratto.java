package applicazione.data;

import prog.utili.Data;

public class Contratto {

	Azienda[] aziende;
	Persona mediatore; // inizialmente null
	Data dataStipula;

	public Contratto(Azienda a1, Azienda a2, Data d) {
		aziende = new Azienda[2];
		aziende[0] = a1;
		aziende[1] = a2;
		dataStipula = d;
		mediatore = null;
	}

	/**
	 * contratto con data odierna
	 * 
	 * @param a1
	 *            prima azienda
	 * @param a2
	 *            seconda azienda
	 */
	public Contratto(Azienda a1, Azienda a2) {
		this(a1, a2, new Data());
	}

	public void setMediatore(Persona p) {
		mediatore = p;
	}

	@Override
	public String toString() {
		return aziende[0]
				+ ":"
				+ aziende[1]
				+ " il "
				+ dataStipula
				+ (mediatore == null ? "senza mediatore" : mediatore.toString());
	}

}
