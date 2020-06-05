package cap11_egi;

enum E {A,B,C}

enum ECorretto {
	A(1),B(10),C(30);

	ECorretto(int i) {
		// TODO
	}
	public int campo;
}


public class usoSbagliatoEnum {

	int foo(){
		E x = E.A;
		// NOOO
		if (x == E.A) return 1;
		if (x == E.B) return 10;
		if (x == E.C) return 30;		
		return -1;
	}
	int foocorretto(){
		ECorretto x = ECorretto.A;
		return x.campo;
	}
	
	
}
