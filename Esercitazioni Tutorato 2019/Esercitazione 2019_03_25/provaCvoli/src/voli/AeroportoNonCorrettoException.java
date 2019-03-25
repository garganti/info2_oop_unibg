package voli;

/** viene generato se la sigla dell'aeroporto non è di 3 caratteri*/

public class AeroportoNonCorrettoException extends RuntimeException {

	public AeroportoNonCorrettoException(String msg) {
		super(msg);
	}
}
