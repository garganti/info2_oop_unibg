package cap09_classi;

public class Frazione implements Comparable<Frazione>{
	// CAMPI
	int hhhh = 10;
	private int num;
	private int den;
	// costruttori
	/**
	 * 
	 * @param n numeratore
	 * @param d denominatore
	 */
/*	public Frazione(int n, int d) {
		num = n; den = d;
	}*/
	public Frazione(int num, int den) {
		int a = mcdEuclide(num, den);
		this.num = num/a; 
		this.den = den/a;
	}
	public Frazione(int n) {
		// num = n; den = 1; -->
		this(n,1);
	}
	/**
	 * 
	 * @param f las tring della frazione in formato "N/D"
	 */
	public Frazione(String f) {
		/*String[] dati = f.split("/");
		num = Integer.parseInt(dati[0]);
		den = Integer.parseInt(dati[1]);*/
		this(Integer.parseInt(f.split("/")[0]), 
				Integer.parseInt(f.split("/")[1]));
	}
	
	/**
	 * 
	 * @param f
	 * @return una frazione prodotto di f per la frazione che esegue il metodo
	 * 
	 * (this*f)
	 */
	public Frazione per(Frazione f) {
		int num = this.num * f.num;
		int den = this.den * f.den;
		return new Frazione(num, den);
	}
	
	// per stampare
	public String toString() {
		if (den == 1) return new Integer(num).toString();
		// num/den
		return num + "/"+ den;
	}
	// confronta due frazioni
	public boolean equals(Frazione f) {
		return this.num*f.den == f.num *this.den;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}*/

	public static int mcdEuclide(int a, int b) {
		// calcoliamo il mcd
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto!= 0);
		return a;
	}
	@Override
	public int compareTo(Frazione o) {
		/*if (this.num * o.den > this.den * o.num) return 1;
		if (this.num * o.den == this.den * o.num) return 0;
		return -1;*/
		int diff = this.num * o.den - this.den * o.num;
		//return diff > 0 ? 1 : diff <0 ? -1: 0;
		return diff;
	}
	
}
