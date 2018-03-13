package trapezio_Es23;

public class ProvaTrapezio {

	public static void main(String[] args) {
		Trapezio t = new Trapezio(4,8,10);
		double area;
		double perimetro;
		area = t.calcoloArea();
		double l = t.getL();
		perimetro = t.calcoloPerimetro();
		System.out.println("L'area del trapezio è: " + String.format("%.2f", area));
		System.out.println("Il perimetro del trapezio è: " + String.format("%.2f", perimetro));
		System.out.println("Il lato l del trapezio è: " + String.format("%.2f", l));
	}
	
}
