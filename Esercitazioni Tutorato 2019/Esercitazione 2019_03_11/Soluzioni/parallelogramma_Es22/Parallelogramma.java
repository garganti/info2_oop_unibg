package parallelogramma_Es22;

public class Parallelogramma {

	int diagMagg;
	int diagMin;
	double angle;
	
	public Parallelogramma(int diagMagg, int diagMin, double d) {
		this.diagMagg=diagMagg;
		this.diagMin=diagMin;
		this.angle=d;
	}
	
	public double altezza() {
		return Math.sin(this.angle)*this.diagMagg;
	}
	
	public double base() {
		return (Math.sqrt(Math.pow(this.diagMagg,2)-Math.pow(altezza(), 2))+Math.sqrt(Math.pow(this.diagMin,2)-Math.pow(altezza(), 2)))/2;
	}
	
	public double area() {
		return base()*altezza();
	}
	
	public double b() {
		return (Math.sqrt(Math.pow(this.diagMagg,2)-Math.pow(altezza(), 2))-Math.sqrt(Math.pow(this.diagMin,2)-Math.pow(altezza(), 2)))/2;
	}
	
	public double lato() {
		return Math.sqrt(Math.pow(base(), 2)+ Math.pow(b(), 2));
	}
	
	public double perimetro() {
		return altezza()*2 + base()*2;
	}
}
