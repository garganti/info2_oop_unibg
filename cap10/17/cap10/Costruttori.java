package cap10;

class A{
	// Equiivalente A(){}
	A(){super();}
}

class W {
	W(){System.out.println("W");}
}
class Z extends W{
	Z(){}
}

class P{}
class P1{ public P1(){super();}}

public class Costruttori {
	public static void main(String[] args) {
		//Z z = new Z();
	}
}
