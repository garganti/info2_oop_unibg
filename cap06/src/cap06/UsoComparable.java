package cap06;

public class UsoComparable {
	public static void main(String[] args) {
		String s1 = "pippo";
		String s2 = "paperino";

		int val = s1.compareTo(s2);
		// s1 < s2 => val < 0
		// s1.equals(s2) => val = 0
		// s1 > s2 => val > 0

		System.out.println(val); // => val > 0

		Integer i1 = 4;
		Integer i2 = 10;
		System.out.println(i1.compareTo(i2));

		String j = "GIOVANNI";
		String i = "Giovanni";
		System.out.println(j.compareTo(i));
		// solo per stringhe
		System.out.println(j.compareToIgnoreCase(i));

		
		// uso di intefacce per definire tipi
		Comparable<String> cs1 = new String("lui");
		
		cs1.compareTo(j);
		
	}

	static int compareToAG(int i, int j) {
		if (i < j)
			return -1;
		else if (i == j)
			return 0;
		else {
			assert i > j;
			return 1;
		}
	}

	static int compareToAG2(int i, int j) {
		return i - j;
	}

	
}
