
public class Frazione{
	// CAMPI
	int num;
	int den;
	
	// COSTRUTTORI
	/**
	 * @param n numeratore
	 * @param d denomaninatore
	 */
	Frazione(int num, int d){
		this.num = num;
		den = d;
		
	}
	/**
	 *  n/1
	 * @param n
	 */
	Frazione(int n){
		this(n,1);
	}	
	// METODI
	// restituisce una frazione nuova uguale
	// alla somma della frazione che esegure il metodo pi f
	Frazione piu(Frazione f){
		int n_num = f.den*num + f.num*den;
		int n_den = den * f.den;
		Frazione result = new Frazione(n_num,n_den);
		return result;	
	}
	
	@Override
	public String toString() {
		return num + "/" + den;
	}
	
	public boolean equals(Frazione f) {
		return this.num*f.den == this.den * f.num;
	}
	
	
}