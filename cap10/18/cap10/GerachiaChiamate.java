package cap10;

class A1{
	A1(){System.out.println("A1");}
}
class B extends A {
	B(){System.out.println("B");}
}
class C extends B {
	C(){System.out.println("CV");}
	C(int x){this();System.out.println("CI");}
}
public class GerachiaChiamate {
	public static void main(String[] args) {
		C c = new C(10);
	}
}
