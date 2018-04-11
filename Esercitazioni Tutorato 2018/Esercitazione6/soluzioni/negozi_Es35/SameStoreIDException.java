package negozi_Es35;

public class SameStoreIDException extends SameIDException {
	public SameStoreIDException(int id) {
		super("Creazione doppio negozio con id="+id);
	}
}
