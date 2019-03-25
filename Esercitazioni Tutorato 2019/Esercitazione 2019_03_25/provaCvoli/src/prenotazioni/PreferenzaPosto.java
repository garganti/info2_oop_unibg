package prenotazioni;

enum PreferenzaPosto {
	
	FINESTRINO("FINESTRINO"), CORRIDOIO("CORRIDOIO"), INDIFFERENTE("indifferente");

	private String nome;

	private PreferenzaPosto(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
