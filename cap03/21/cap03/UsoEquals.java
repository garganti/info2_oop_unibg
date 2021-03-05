package cap03;

import prog.utili.Frazione;

public class UsoEquals {
	public static void main(String[] args) {
		Frazione f1 = new Frazione(1,5);
		Frazione f2 = new Frazione(1,5);
		
		System.out.println(f1 == f2);
		
		
		System.out.println(f1.equals(f2));
		
		Frazione f3 = f1;
		System.out.println(f1 == f3);
		
	}

}
