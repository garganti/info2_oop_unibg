package cap10;

import prog.utili.SequenzaOrdinata;

class Automobile /*extends Object*/{
//class Automobile /*extends Object*/  implements Comparable<Automobile>{
	String targa;
	// uguali se hanno la stessa targa
	// se voglio un equals devo fare override dell'equals di Objet	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Automobile)
			return targa.equals(((Automobile)obj).targa);
		else 
			return false;
	}
/*	@Override*/
	public int compareTo(Automobile o) {
		return targa.compareTo(o.targa);
	}
}
public class provaEquals {
	
	public static void main(String[] args) {
		Automobile a1 = new Automobile();
		Automobile a2 = new Automobile();
		a1.targa = "AXC899";
		a2.targa = "AXC899";
		System.out.println(a1.equals(a2));
		System.out.println(a1.compareTo(a2));
		System.out.println(a1.equals(2));
		//SequenzaOrdinata<Comparable<? super E>>
		//SequenzaOrdinata<Automobile> se; --> no duck typing
	}

}
