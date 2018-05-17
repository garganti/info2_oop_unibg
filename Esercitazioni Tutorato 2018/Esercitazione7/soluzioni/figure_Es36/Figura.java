package figure_Es36;

public abstract class Figura implements Comparable<Figura> {
		
	public abstract double getPerimetro();
	public abstract double getArea();

	@Override
	public int compareTo(Figura o) {
		if (getPerimetro() > o.getPerimetro()) return 1;
		if (getPerimetro() == o.getPerimetro()) return 0;
		return -1;
		//return getPerimetro() > o.getPerimetro() ? 1 : -1;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + getPerimetro();
	}
	
}
