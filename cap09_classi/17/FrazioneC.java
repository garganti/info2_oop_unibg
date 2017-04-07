
public class FrazioneC implements Comparable<FrazioneC>{
	// ogni frazione ha un denominatore e un numeratore (interi)
	int num;
	int den;

	// costruttore
	public FrazioneC(int num, int d) {
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

	public FrazioneC(int n) {
		num = n;
		den = 1;
	}

	// metodi
	// moltiplicazione
	// restituisce una frazione che è il x della frazione che esegue
	// il metodo x la frazione passata come argomento
	FrazioneC per(FrazioneC f2) {
		int n = num * f2.num;
		int d = den * f2.den;
		return new FrazioneC(n, d);
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

	public boolean equals(FrazioneC f2) {
		// restituisce true se e solo se this = f2 (matematico)
		// return this.num == f2.num && this.den == f2.den;
		return this.num * f2.den == f2.num * this.den;
	}
	@Override
	public int compareTo(FrazioneC f2) {
		int diff = this.num * f2.den - f2.num * this.den;
		/*if (diff >0)
			return 1;
		else if (diff == 0)
			return 0;
		else
			return -1;*/
		// TODO: se le frazioni sono < 0, funziona????
		return diff;
		
	}

	public static void main(String[] args) {
		FrazioneC f1 = new FrazioneC(100,200);
		FrazioneC f2 = new FrazioneC(100,200);
		System.out.println(f1.compareTo(f2));
	}


}
