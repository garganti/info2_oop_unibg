package voli_Es34;

public abstract class BoardingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BoardingException() {
		super("BoardingException");
	}

	public BoardingException(String msg) {
		super(msg);
	}
	
}
