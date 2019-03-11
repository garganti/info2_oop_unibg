
public class ContoCorrente {
	// campi
	long numeroConto;
	String proprietario;
	// importo attualmente sul contocorrente
	// NOTA: l'importo non può essere minore di zero, altrimenti stampo degli errori
	//
	int importo;

	// costruttori
	public ContoCorrente(long nc, String proprietario, int importoIniziale) {
		this.numeroConto = nc;
		this.proprietario = proprietario;
		// controllo che importo
		if (importoIniziale < 0) {
			System.err.println("importo non valido");
			this.importo = 0;
		} else {
			this.importo = importoIniziale;
		}
		// incrrmenta il numero di conti correnti
		numeroContiCorrenti++;
	}
	// costruttore senza importo iniziale che sarà zero
	public ContoCorrente(long nc, String proprietario) {
		this(nc,proprietario,0);
	}
	// costruttore senza numero di conto, che verrà 
	// assegnato di volta in volta incrementando un contatore
	static private int numeroContiCorrenti = 0; // cquanti conti correnti?
	
	public ContoCorrente(String proprietario) {
		this(numeroContiCorrenti +1,proprietario,0);
	}

	
	// metodi
	public void preleva(int importo) {
		// preleva l'importo
		if (importo > 0 && importo <= this.importo)
			this.importo -= importo;
		else
			System.err.println("non puoi prelevare " + importo);
	}

	public void versa(int importo) {
		this.importo += importo;
	}

	public double calcolaInteressi() {
		return this.importo * 0.0000001;
	}

	// tostring significativo
	@Override
	public String toString() {
		return "CC:" + numeroConto + " P:" + proprietario + " saldo:" + importo;
	}

}
