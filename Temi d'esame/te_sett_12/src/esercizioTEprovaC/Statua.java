package esercizioTEprovaC;

public class Statua extends Opera{
	
	TipoStatua tipoStatua;

	@Override
	int getPrezzo() {
		return (int)(quotazione + 100 * tipoStatua.coeff);
	}

}

enum TipoStatua{
	// enumerativi:
	BRONZO(1.1), LEGNO(0.9), MARMO(1.2);
	
	// campo
	double coeff;
	// costruttore
	private TipoStatua(double d) {
		coeff = d;
	}
}