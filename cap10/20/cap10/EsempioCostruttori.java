package cap10;

class A {// extends Object
	A(int h){
		System.out.println("A");
	}	
}
class B extends A{
	B(){
		this(0);
		System.out.println("B0");
	}	
	B(int h){
		super(h);
		System.out.println("B");
	}
	
}


public class EsempioCostruttori {
	public static void main(String[] args) {
		B b = new B();
	}

}
