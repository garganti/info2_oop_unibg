package dati;

import prog.utili.Data;

public class RefertoImmagine extends Referto {

	protected RefertoImmagine(Data d, Paziente p) {
		super(d, p);
	}

	@Override
	public double criticity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validity() {
		// valida sempre se criticità è 100
		if (criticity() == 10) return true;
		Data oggi = new Data();
		int giorniTrascorsi = data.quantoManca(oggi);
		return giorniTrascorsi <= 2;
	}

}
