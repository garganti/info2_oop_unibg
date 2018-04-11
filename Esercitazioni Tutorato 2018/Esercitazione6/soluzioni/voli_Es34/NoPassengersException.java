package voli_Es34;

public class NoPassengersException extends BoardingException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8082337568537322093L;

	public NoPassengersException() {
		super("Nessun passeggero registrato");
	}

	public NoPassengersException(String msg) {
		super(msg);
	}

	public NoPassengersException(Volo v) {
		super("Nessun passeggero registrato per il volo "+v);
	}
}
