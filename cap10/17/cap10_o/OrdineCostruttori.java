package cap10_o;

class A{
	A(){System.out.println("A");}
}
class B extends A{
	B(){System.out.println("B");}
}
class C extends B{
	C(){this(3);System.out.println("Z");}
	C(int x){System.out.println("W");}
}
public class OrdineCostruttori {
	public static void main(String[] args) {
		C z = new C();
	}
}
