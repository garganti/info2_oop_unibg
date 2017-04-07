
public class Frazione {
	// ogni frazione ha un denominatore e un numeratore (interi)
	int num;
	int den;

	// costruttore
	public Frazione(int num, int d) {
		// cerca mcd tra num e d
		int mcd = MCD(num, d);
		this.num = num / mcd;
		this.den = d / mcd;
	}

	// restituisce il MCD tra x e y
	public static int MCD(int a, int b) {
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}

	public Frazione(int n) {
		num = n;
		den = 1;
	}

	// metodi
	// moltiplicazione
	// restituisce una frazione che è il x della frazione che esegue
	// il metodo x la frazione passata come argomento
	Frazione per(Frazione f2) {
		int n = num * f2.num;
		int d = den * f2.den;
		return new Frazione(n, d);
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

	public boolean equals(Frazione f2) {
		// restituisce true se e solo se this = f2 (matematico)
		// return this.num == f2.num && this.den == f2.den;
		return this.num * f2.den == f2.num * this.den;
	}

	public static void main(String[] args) {
		/*Frazione um = new Frazione(1, 2);
		Frazione uq = new Frazione(1, 4);
		System.out.println(um.toString());
		Frazione p = um.per(uq);
		System.out.println(p.toString());

		Frazione ump = new Frazione(1, 2);
		System.out.println(ump.equals(um));

		Frazione ump2 = new Frazione(2, 4);
		System.out.println(ump2.equals(um));
*/
		
		/*System.out.println(MCD(10,5)); // ->5
		System.out.println(MCD(7,3)); // -> 1
		System.out.println(MCD(12,9)); //-> 3*/
		
		Frazione f1 = new Frazione(100,200);
		System.out.println(f1);
	}

}
