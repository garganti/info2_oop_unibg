package cap07ecc;
/**
 * Questa classe serve per le frazioni con le eccezioni.
 */
public class FrazioneEcc2 {
	/** costruisco una nuova frazione
	 * @param n è il numeratore
	 * @param d è il denominator
	 * @throws Exception se il denominatore è nullo
	 */
	public FrazioneEcc2(int n, int d) throws FrazioneException {
		if (d ==0){ 
			throw new FrazioneException("denominatore nullo");
		}
	}
	
	public static void main(String[] args) {
		FrazioneEcc2 f;
		try {
			f = new FrazioneEcc2(10, 0);
			System.out.println(f.toString());
		} catch (FrazioneException e) {
			System.out.println(e.toString());
			//System.out.println("qualcosa è andato male " + e.getMessage());
		}
		
	}
}

//class FrazioneException extends RuntimeException{
//class FrazioneException extends Exception{
class FrazioneException extends ArithmeticException{

	public FrazioneException(String string) {
		super(string);
	}

	@Override
	public String toString() {
		return "frazione eccezionale per " + getMessage();
	}

}

