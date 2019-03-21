package negozi_Es35;

public class SameItemIDException extends SameIDException {
	public SameItemIDException(int id) {
		super("Doppio prodotto con id="+id);
	}
}
