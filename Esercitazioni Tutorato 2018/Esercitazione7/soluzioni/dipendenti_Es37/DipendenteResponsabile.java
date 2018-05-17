package dipendenti_Es37;

public class DipendenteResponsabile extends Dipendente {
	int bonus;

	public DipendenteResponsabile(String nome, String cognome, int oreLavorateMensili, int retribuzioneOraria, int bonus) {
		super(nome, cognome, oreLavorateMensili, retribuzioneOraria);
		this.bonus = bonus;
	}
	
	@Override
	public int getStipendio() {
		return super.getStipendio() + bonus;
	}
}
