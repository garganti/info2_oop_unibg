package cap10.pack1.util;

public class MachineSamePack extends Machine{

	private void foo() {
		volume = 10;
		altezza = 20;
		u = 90;
		peso = 9;
	}
	
}

class NoMachine{
	private void foo(Machine m) {
		m.volume = 10;
		m.altezza = 20;
		m.u = 90;
		m.peso = 9;
	}
	
}
