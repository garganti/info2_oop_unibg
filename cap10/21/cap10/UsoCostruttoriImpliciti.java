package cap10;

class A1{
	
}

class A2{ // equivalente a A1 (aggiunto in A1 autom)
	A2(){}
}

class B1 extends A1{}
// ==>
class B3 extends A1{
	B3(){}
}
// =>
class B2 extends A1{
	B2(){super();}
}

class Z {} // ==>
class Z1 extends Object { Z1(){super();}}

/// attenzion con i parametri
class W{
	W(int x){} //-> non viene messo il costruttor edi default
}
class T1 extends W{
	//T1(){} ==>
	//T1(){super();} ==> errore
	T1(){super(1);} //==> devo usare super
}

class T2 extends W{
	T2(){this(0);}
	T2(int x){super(x);}
}


class Persona{
	public Persona() {
		System.out.println("costruisco persona");
	}
}

class Studente extends Persona{
	public Studente() {
		System.out.println("costruisco studente");
	}
}




public class UsoCostruttoriImpliciti {
	public static void main(String[] args) {
		A1 a1 = new A1();
		// W w1 = new W(); --> NO
		Studente s = new Studente();
	}

}
