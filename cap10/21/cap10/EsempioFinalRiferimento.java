package cap10;

class Giorno{
	static final int NUMERO_DI_ORE = 24;
}

class X{
	int y;
}

class Y{
	// final String s; _> va inizializzato nel costruttore
}


public class EsempioFinalRiferimento {
	public static void main(String[] args) {
		final X x = new X();
		// x = new X(); vietato
		x.y = 10;
		x.y = 20;
	
	}
	
	static int foo(int x) {
		// x =  x +2; -->
		return x;
	}
	
	
}

// class MyString extends String{ --> no!!!!
	

