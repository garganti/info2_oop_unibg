package cap09_classi;

public class ProvaFrazione {
	public static void main(String[] args) {
		Frazione f = new Frazione("1/2");
		System.out.println(f.toString());
		Frazione f2 = new Frazione("1/3");
		Frazione prodotto = f.per(f2);
		System.out.println(prodotto);
		// proviamo confrontare frazioni
		// equals
		Frazione a1 = new Frazione("1/10");
		Frazione a2 = new Frazione("1/10");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a1));
		Frazione a3 = new Frazione("2/20");
		System.out.println(a1.equals(a3));
		
		Frazione due = new Frazione(2);
		System.out.println(due);
		System.out.println(a3);
		
		
		
	}

}
