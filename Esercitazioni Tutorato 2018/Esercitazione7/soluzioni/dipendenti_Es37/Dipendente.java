package dipendenti_Es37;

public class Dipendente {
	protected String nome, cognome;
	protected int oreLavorateMensili, retribuzioneOraria;
	
	public Dipendente(String nome, String cognome, int oreLavorateMensili, int retribuzioneOraria) {
		this.nome = nome;
		this.cognome = cognome;
		this.oreLavorateMensili = oreLavorateMensili;
		this.retribuzioneOraria = retribuzioneOraria;
	}

	public int getStipendio() {
		return oreLavorateMensili * retribuzioneOraria;
	}
}
