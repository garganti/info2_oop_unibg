package cap11_egi;

public enum GiornoSettimanaMetodoA {
	LUN {
		int numeroOreDaLavorare() {return 9;}
	},
	MAR{
		int numeroOreDaLavorare() {return 9;}
	}, 
	VEN{
		int numeroOreDaLavorare() {return 5;}
	}, 
	SAB{
		int numeroOreDaLavorare() {return 0;}
	}, DOM{
		int numeroOreDaLavorare() {return 0;}
	};

	abstract int numeroOreDaLavorare();

}
