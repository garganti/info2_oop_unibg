package sfide;

import prog.utili.Orario;

/**
 * eccezione che accade quando cerco di creare una sfida 
 * con orario sbagliato
 */
public class OrarioNonValidoException extends Exception {
	
	public Orario orarioNonValido;

	OrarioNonValidoException(Orario o) {
		this.orarioNonValido = o;
	}

}
