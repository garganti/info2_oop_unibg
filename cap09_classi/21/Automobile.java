
/**
 * The Class Automobile rappresenta automobili.
 */
public class Automobile {
	
	String targa;
	
	static int numeroAuto = 0;
	
	public Automobile() {
		numeroAuto ++;
		//targa = "AA" + Integer.toString(numeroAuto);
		// equivalenti
		targa = "AA" + numeroAuto;
	}
	
	
	/**
	 * To string.
	 *
	 * @return la targa dell'automobile
	 */
	@Override
	public String toString() {
		return targa;
	}
	
	
	public static void main(String[] args) {
		Automobile a1 = new Automobile();
		Automobile a2 = new Automobile();
		Automobile a3 = new Automobile();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
	

}
