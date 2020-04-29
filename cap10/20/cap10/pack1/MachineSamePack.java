package cap10.pack1;

import cap10.pack1.util.Machine;

public class MachineAnotherPack extends Machine{

	private void foo() {
		volume = 10;
		altezza = 20;
		u = 9;
		peso = 9;

	}
	
}

class NoMachine{
	private void foo(Machine m) {
		m.volume = 10;
		m.altezza = 20;
		m.u = 9;
		m.peso = 9;

	}
	
}
