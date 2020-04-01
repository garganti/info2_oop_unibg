
public class Frazione {
	// campi
	// numeratore e denominatore
	// TIPO NOME
	private int num;
	private int den;

	// costruttori
	/* versione che non semplifica
	 * public Frazione(int num, int d) {
	 
		//num = num;// sbagliato
		this.num = num;
		this.den = d;
	}*/
	public Frazione(int num, int d) {
		// semplifico con euclide ...
		int m = mcd(num, d);
		this.num = num/m;
		this.den = d/m;
	}
	/** calcola il massimo comun divisore tra a e b
	 * @param a primo numero
	 * @param b
	 * @return massimo comun divisore
	 */
	static public int mcd(int a, int b) {
		int resto;
		do {
			resto = a %b;
			a = b;
			b = resto;
		} while(resto!=0);
		return a;
	} 
	
	
	
	// costruttore è con n/1
	public Frazione(int v) {
		// num = v; den = 1;
		this(v, 1);
	}

	// non posso
	// public Frazione(int x) {}
	// prende una string in formato n/d
	public Frazione(String x) {
		// NO String[] data = x.split("/");
		this(Integer.parseInt(x.split("/")[0]), Integer.parseInt(x.split("/")[1]));
	}
	// attenzione potrei avere poi ambiguità
	// public Frazione(long j, int k) {}
	// public Frazione(int j, long k) {}

	// metodi
	public Frazione per(Frazione a) {
		int numProdotto = a.num * this.num;
		int denProdotto = a.den * this.den;
		return new Frazione(numProdotto, denProdotto);
	}
	// this * a/1
	public Frazione per(int a) {
		return per(new Frazione(a));
	}
	
	public String toString() {
		return num + "/" + den;
	}

	public boolean equals(Object obj) {
		// se obj non è una frazione allora sono sicuro che no
		// non sono uguali
		if (!(obj instanceof Frazione)) return false;
		Frazione f = (Frazione) obj;
		// NO divisione intera
		// return (f.num/f.den) == (this.num/ this.den);
		// se convert in double posso avere piccoli errori 
		return (f.num * this.den) == (this.num *f.den);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(mcd(65,45));
		
		
		
		Frazione f = new Frazione(4, 5);
		Frazione f2 = new Frazione(8);
		Frazione f3 = new Frazione("3/5");
		Frazione prodotto = f.per(f2);
		System.out.println(prodotto);
		Frazione prodotto2 = f.per(5);
		System.out.println(prodotto2);
		Frazione f4 = new Frazione(2,4);
		System.out.println(f4);
		Frazione f5 = new Frazione("20/40");
		System.out.println(f5);
	}

}
