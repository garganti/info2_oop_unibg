package cap10;

class GA{
	int m(int a) {return 0;}
}

class A1 extends GA{
	// overload: stesso nome ma parametri (tipo di) diversi
	int m(float a) {return 2;}
	// A1 avraè due metodi e quale scegliere viene deciso in compilazione
}

class A2 extends GA{
	// override: stessa identica segnatura
	int m(int b) {return 1;}
	// quale metodo eseguire dipenderò a runtime
}


public class OverloadvsOverride {

	public static void main(String[] args) {
		A1 a1 = new A1();
		System.out.println(a1.m(3.4f));//-->2
		System.out.println(a1.m(3));// -> 0
		//
		GA a = (Math.random() > 0.4)? new GA() : new A2();
		System.out.println(a.m(7));
	}
	
}
