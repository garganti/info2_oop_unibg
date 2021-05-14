package dati;

import prog.utili.Data;

// referto singolo
public class RefertoSingolo extends Referto {

	private String nome;
	private RisultatoReferto risultato;
	
	protected RefertoSingolo(Data d, Paziente p, String n, RisultatoReferto r) {
		super(d, p);
		nome = n;
		risultato = r;
	}
	
	
}
