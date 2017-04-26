package gestionedipendenti_es1;

public class Dipendente {
	String nome;
	String cognome;
	int oreLavorativeMensili;
	int retribuzioneOraria;
	
	public Dipendente(String nome, String cognome, int oreLavorativeMensili, int retribuzioneOraria) {
		this.nome=nome;
		this.cognome=cognome;
		this.oreLavorativeMensili=oreLavorativeMensili;
		this.retribuzioneOraria=retribuzioneOraria;
	}
	
	public int calcolaStipendio() {
		return oreLavorativeMensili*retribuzioneOraria;
	}

}
