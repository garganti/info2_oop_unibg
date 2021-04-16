// 
// rappresenta gli orari in  ore e minuti
//
public class Orario implements Comparable<Orario> {

	private static final int MIN_PER_ORA = 60;
	// CAMPI
	private int ora; // 0 a 23
	private int minuti; // 0 a 59
	
	private static String sep = ":";
	
	// COSTRUTTORI
	public Orario(int h, int m) {
		minuti = m % MIN_PER_ORA;
		ora = (m / MIN_PER_ORA + h) % 24;
	}

	// una stringa: "hh:mm"
	public Orario(String s) {
		/*
		 * String[] data = s.split(s); minuti = Integer.parseInt(data[0]); ora =
		 * Integer.parseInt(data[1]); // TODO semplificazioni varie
		 */
		// this(h/m)
		this(Integer.parseInt(s.split(":")[0]), Integer.parseInt(s.split(":")[1]));
	}
	// METODI

	@Override
	public String toString() {
		return ora + sep + (minuti < 10 ? "0" : "") + minuti;
	}

	public static void setSep(char c) {
		sep = Character.toString(c);
	} 
	
	
	
	// return 0 se this è uguale a o
	// > 0 se this > o
	// < 0 se this < o
	public int compareTo(Orario o) {
		if (this.ora == o.ora) {
			if (this.minuti == o.minuti) {
				return 0;
			} else if (this.minuti < o.minuti) {
				return -1;
			} else {
				return 1;
			}
		} else if (this.ora < o.ora) {
			return -1;
		} else {
			return 1;
		}
		// si può migliorare usando il -
		// ad esempio facendo return this.ora - o.ora
	}

	public static void main(String[] args) {
		Orario o = new Orario(0, 100);
		System.out.println(o);
		Orario o2 = new Orario(2, 65);
		System.out.println(o2);
		
		// confronto con o2
		System.out.println(o.compareTo(o2));
		Orario o3 = new Orario(3, 5);
		System.out.println(o3.compareTo(o2));

	}
}
