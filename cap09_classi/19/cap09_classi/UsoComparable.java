package cap09_classi;

// voglio confrontare le frazioni
public class UsoComparable {
	public static void main(String[] args) {
		Frazione f1 = new Frazione(3,7);
		Frazione f2 = new Frazione(5,9);
		if (f1.compareTo(f2)>0) {
			System.out.println(f1 + " > "+ f2);
		} else {
			System.out.println(f1 + " <= "+ f2);
		}
		
	}

}
