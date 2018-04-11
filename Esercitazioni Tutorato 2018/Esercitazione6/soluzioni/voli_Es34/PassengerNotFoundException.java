package voli_Es34;

public class PassengerNotFoundException extends BoardingException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8082337568537322093L;

	public PassengerNotFoundException() {
		super("Passeggero non trovato");
	}

	public PassengerNotFoundException(String msg) {
		super(msg);
	}

	public PassengerNotFoundException(Volo v, int idBiglietto) {
		super("Nessun passeggero con idBiglietto "+idBiglietto+" per il volo "+v);
	}
}
