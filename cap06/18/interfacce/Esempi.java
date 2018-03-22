package interfacce;

interface A{
	void foo();
	
}

class B implements A{
	public void foo() {}
}

public class Esempi {

	public static void main(String[] args) {
		A a  = new B();
	}
	
}
