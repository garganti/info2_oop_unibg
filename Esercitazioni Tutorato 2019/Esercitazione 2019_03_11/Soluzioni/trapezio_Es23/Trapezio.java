package trapezio_Es23;

public class Trapezio {
	
	int b;
	int B;
	int h;
	double l;
	
	public Trapezio(int b, int B, int h) {
		this.B=B;
		this.b=b;
		this.h=h;
		this.l=calcoloLato();
	}

	public double calcoloPerimetro() {
		return b + B + l * 2;
	}

	public double calcoloLato() {
		return Math.sqrt(Math.pow(((B - b) / 2) , 2) + Math.pow(h, 2));
	}

	public double calcoloArea() {
		double area;
		area = ((B + b) * h) / 2;
		return area;
	}
	
	public double getL() {
		return l;
	}
}
