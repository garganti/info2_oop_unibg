package figure_Es36;
public class Triangolo extends Figura {
	int a, b, c;
	
	public Triangolo(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public double getArea() {
		double p = getPerimetro();
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public double getPerimetro() {
		return a+b+c;
	}

}