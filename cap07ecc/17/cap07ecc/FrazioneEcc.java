package cap07ecc;
/**
 * Questa classe serve per le frazioni con le eccezioni.
 */
public class FrazioneEcc {
	/** costruisco una nuova frazione
	 * @param n è il numeratore
	 * @param d è il denominator
	 * @throws Exception se il denominatore è nullo
	 */
	public FrazioneEcc(int n, int d) throws Exception {
		if (d ==0){ 
			//System.err.println("frazione non creata"); TOO LITTLE
			//System.exit(-1); TROPPO
			// in questo caso lancio eccezione /0
			//ArithmeticException ae = new ArithmeticException("frazione con den nullo");
			//throw ae;
			//throw new ArithmeticException("frazione con den nullo");
			// una ecc controllata
			throw new Exception("denominatore nullo");
			//throw new RuntimeException("denomniatore nullo");
		}
	}
	
	public static void main(String[] args) {
		FrazioneEcc f;
		try {
			f = new FrazioneEcc(10, 0);
			System.out.println(f.toString());
		} catch (Exception e) {
			System.out.println("qualcosa è andato male " + e.getMessage());
		}
		
	}
}
