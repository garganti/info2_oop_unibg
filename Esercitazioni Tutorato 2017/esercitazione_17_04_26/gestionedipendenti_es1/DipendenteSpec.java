package gestionedipendenti_es1;

public class DipendenteSpec extends Dipendente{
	
	int bonus;

	public DipendenteSpec(String nome, String cognome,
			int oreLavorativeMensili, int retribuzioneOraria, int bonus) {
		super(nome, cognome, oreLavorativeMensili, retribuzioneOraria);
		this.bonus=bonus;
	}

	@Override
	public int calcolaStipendio() {
		return super.calcolaStipendio()+bonus;
	}
}
