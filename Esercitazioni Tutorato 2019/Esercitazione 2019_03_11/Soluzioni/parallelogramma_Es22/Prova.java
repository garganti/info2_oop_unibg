package parallelogramma_Es22;

public class Prova {

	public static void main(String[] args) {
		Parallelogramma p = new Parallelogramma(3, 3, Math.PI/4);
		System.out.println("Base " + p.base());
		System.out.println("Altezza " + p.altezza());
		System.out.println("Area " + p.area());
		System.out.println("Lato " + p.lato());
		System.out.println("Perimetro " +p.perimetro());
	}
	
}
