package radavelli_marco;

public class Automobile implements Comparable<Automobile> {
	int km;

	public Automobile(int km) {
		this.km = km;
	}
	
	@Override
	public int compareTo(Automobile o) {
		return km<o.km ? 1 : km==o.km ? 0 : -1;
	}
	
	public String toString() {
		return "Auto"+km;
	}
	
}
