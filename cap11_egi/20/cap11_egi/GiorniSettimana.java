package cap11_egi;

import java.util.Arrays;

public enum GiorniSettimana {
	
	LUN(8),MAR(7),MER(10),
	GIO(15){
		void foo(){}
	},
	VEN(8),SAB(4),DOM(0);

	// campo 
	private int oreLavorative;

	// costruttore 
	GiorniSettimana(int o) {oreLavorative = o;}
	
	int numeroOreLavorative() {
		// if this == LUN
		return oreLavorative;
	}
	
	
	void foo() {}
	
	public static void main(String[] args) {
		GiorniSettimana g = LUN;
		
		System.out.println(g.toString());		
		// 1. name
		System.out.println(g.name());
		// 2. ordinal
		System.out.println(g.ordinal());
		// metodi statici
		System.out.println(Arrays.toString(GiorniSettimana.values()));
		// comodo da intero a enum
		int dom = 6;
		System.out.println(GiorniSettimana.values()[dom]);
		//GiorniSettimana superdomenica = new GiorniSettimana();
		
	}
	
	
}
