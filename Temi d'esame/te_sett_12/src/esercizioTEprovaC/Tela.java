package esercizioTEprovaC;

public class Tela extends Opera{
	
	TipoTela tipoTela;

	@Override
	int getPrezzo() {
		return (int)(quotazione * 1.1);
	}

	Tela(TipoTela t){
		tipoTela = t;
	}
	
	Tela(String tipoAsString){
		// converte la stringa in tipo
		this(TipoTela.valueOf(tipoAsString));
	}
	
}

enum TipoTela{
	OLIO, ACQUARELLO, MISTO;
}