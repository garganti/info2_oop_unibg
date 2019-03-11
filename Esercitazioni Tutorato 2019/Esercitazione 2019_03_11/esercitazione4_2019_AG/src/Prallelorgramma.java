
public class Prallelorgramma {

	private double D;

	Prallelorgramma(double D, double d, double alpha){
		this.D = D;
		
	}	
	double base() {return 0.0;}
	double altezza() {return 0.0;}
	double getArea() {
		// base * altezza
		return base() * altezza();
	}
	
}
