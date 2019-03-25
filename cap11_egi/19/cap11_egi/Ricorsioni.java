package cap11_egi;

public class Ricorsioni {
	
	// n! = n * (n-1) * ... 1
	static int fattoriale1(int n) {
		// con unclio for
		int risultato = 1;
		for (int i = 1; i <= n; i++)
			risultato = risultato *i;
		return risultato;
	}
	// ricorsiva
	// n! = n * (n-1)!
	static int fattorialeR(int n) {
		return n <= 1 ? 1 : n* fattorialeR(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println(fattoriale1(10));
		System.out.println(fattorialeR(10));
		
	}

}
