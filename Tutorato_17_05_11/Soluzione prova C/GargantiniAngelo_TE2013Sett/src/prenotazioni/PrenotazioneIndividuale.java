package prenotazioni;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import prog.utili.Data;

public class PrenotazioneIndividuale extends Prenotazione {

	String cognome, nome;

	PreferenzaPosto preferenza;

	float costo;

	public PrenotazioneIndividuale(String c, String n, PreferenzaPosto pref, float costo) {
		super();
		this.cognome = c;
		this.nome = n;
		this.preferenza = pref;
		this.costo = costo;
	}

	public PrenotazioneIndividuale(String c, String n, String posto, float costo) {
		this(c,n,PreferenzaPosto.valueOf(posto),costo);
	}

	public String toString() {
		return "PINDIV " + cognome + " " + nome + " preferenza: " + preferenza;
	}

	@Override
	public	double getCosto() {
		return costo;
	}	
}
