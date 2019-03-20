package cap10;

class A{ final void m() {}}

class B extends A { void m() {}}

class MyString extends String{
	
}

final class Final{}

class NOtSoFinal extends Final{}

class Persona{
	final String name;
	Persona(String s){name = s;}
	private void changeName() {
		name = "leone";
	}
}


public class UsoFinal {
	// COSTANTE #define NAME "angelo"
	static final String NAME = "piero";
	static final int  j  = 0;
	
	Persona p1 = new Persona("ggg");
	Persona p3 = new Persona("hhh");
	
	
	public static void main(String[] args) {
		final int X;
		System.out.println("ciao");
		X = 20;
		//X = 90;
		final String  NOME = string;
		// ERROR NOME = "piero";
		// NON VUOL DIRE CHE l?OGGETTO NON POSSO ESSERE CAMBIATO NEL SUO STATO
		final StringBuffer bf = new StringBuffer(NAME);
		System.out.println(bf);
		bf.append(" come stai");
		System.out.println(bf);
		
		
		
	}

}
