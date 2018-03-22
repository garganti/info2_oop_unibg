
public class ProvaFrazione {
	
	public static void main(String[] args) {
		Frazione f = new Frazione(2,3);
		System.out.println(f.num);
		System.out.println(f.den);
		Frazione f2 = new Frazione(1,5);
		Frazione somma = f.piu(f2);
		System.out.println(somma);
	}

}
