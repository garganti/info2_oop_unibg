package figure_Es36;
public class Cerchio extends Figura {

	double r;
	
	public Cerchio(double r) {
		this.r=r;
	}
	
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*r;
	}

}