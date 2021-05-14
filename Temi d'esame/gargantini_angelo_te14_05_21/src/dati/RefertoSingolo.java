package dati;

import prog.utili.Data;

// referto singolo
public class RefertoSingolo extends Referto {

	private String nome;
	private RisultatoReferto risultato;
	
	public RefertoSingolo(Data d, Paziente p, String n, RisultatoReferto r) {
		super(d, p);
		nome = n;
		risultato = r;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + nome + " " + risultato;
	}
	
}
