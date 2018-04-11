package negozi_Es35;

/**
 * In caso di ID uguale
 * @author mradavelli
 *
 */
public abstract class SameIDException extends Exception {
	public SameIDException(int id) {
		super("Stesso elemento con id="+id);
	}
	public SameIDException(String msg) {
		super(msg);
	}

}
