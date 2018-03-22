package cap10;

class A{
	private int x;
	public void printX() {System.out.println(x);}
}

class B extends A{}

public class Prova {
	public static void main(String[] args) {
		B b = new B();
		// NO x è privato
		//System.out.println(b.x);
		b.printX();
	}
}
