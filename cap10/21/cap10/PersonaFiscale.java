package cap10;

class CodFiscaleInvalidException  extends Exception{

	CodFiscaleInvalidException(){
		super("codice fiscale non valido");
	}
}

public class PersonaFiscale {

	
	PersonaFiscale(String codiceFiscale) throws Exception{
		// controlla la validità del codice fiscale
		if (codiceFiscale.length() != 16) {
			throw new CodFiscaleInvalidException();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			PersonaFiscale pf =new PersonaFiscale("AAA");
		} catch (CodFiscaleInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
