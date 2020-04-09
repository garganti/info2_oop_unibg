package esercizio4_6;

public class Automobile implements Comparable<Automobile>{
	private static final int START_ID = 0;
	private int id;
	private double km;
	static int numerodiautomobili = START_ID;
	/*public Automobile(int id, double k) {
		this(k); this.id = id;}*/
	public Automobile(double k) {this.km = k;
		this.id = ++ numerodiautomobili;
	}
	public String toString() {
		return "id:" + id + " km:" +km;
	}
	public int compareTo(Automobile o) {
		return Double.compare(this.km, o.km);
	}
	// ordina usando bubble sort
	static void sort(Automobile[] a) {
		boolean ordinato;
		do {
			ordinato = true;
			for(int i = 0; i < a.length-1; i++) {
				//if (a[i].isMaggioreKm(a[i+1])
				//if (a[i].km > a[i+1].km)
				if (a[i].compareTo(a[i+1])>0) {
					// scambio
					Automobile temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					ordinato = false;
				} 
			}
		} while(!ordinato);
	}
}
