package temaesame_11_7_11.studiooc;

import prog.utili.Data;
import prog.utili.Sequenza;

public class Paziente {
	
	String nome, cognome;
	
	Sequenza<Visita> visite;

	private Data dob;
	
	public Paziente(String nome,String cognome, Data dob){
		if(nome == null || nome.length() < 1)
			throw new NomeNonValidoException();
		if(cognome == null || cognome.length() < 1)
			throw new NomeNonValidoException();
		if (dob.compareTo(new Data())> 0){
			throw new DataNonValidaException();
		}
		this.nome = nome;
		this.cognome = cognome;
		this.dob = dob;
		visite = new Sequenza<Visita>();
	}

	public void aggiungiVisita(Visita v) {
		visite.add(v);
	}

}
