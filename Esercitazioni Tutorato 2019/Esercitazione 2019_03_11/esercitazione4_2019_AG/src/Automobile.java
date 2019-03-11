// utilizzo Comparable
// ordinte rispetto ai km
public class Automobile implements Comparable<Automobile> {

	String ID; // targa
	int kmPercorsi;

	public Automobile(String t, int kp) {
		ID = t;
		kmPercorsi = kp;
	}

	// restitusce true se this ha km maggiori di other
	boolean isMaggioreKm(Automobile other) {
		// if (this.kmPercorsi > other.kmPercorsi) return true;
		// else return false;
		// equivalente
		return (this.kmPercorsi > other.kmPercorsi);
	}

	@Override
	public int compareTo(Automobile o) {
		// if (this.kmPercorsi > o.kmPercorsi) return 1;
		// else if (this.kmPercorsi == o.kmPercorsi) return 0;
		// else return -1;
		return this.kmPercorsi - o.kmPercorsi;
	}

	@Override
	public String toString() {
		return ID + " k:" + kmPercorsi;
	}

}
