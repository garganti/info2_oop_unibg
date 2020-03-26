package cap05;

public class CercaMassimo {

	// cerca il massimo in numeri
	public static int cercaMassimo(int[] numeri) {
		int max = numeri[0];
		// in alternativa: int max = Integer.MIN_VALUE;
		for (int i = 1; i < numeri.length; i++) {
			if (numeri[i] > max)
				max = numeri[i];
		}
		return max;
	}
	// cercare la string più lunga in un array di stringhe
	public static String longest(String[] ss) {
		String longestString = ss[0];
		for (int i = 1; i < ss.length; i++) {
			if (ss[i].length() > longestString.length())
				longestString = ss[i];
		}
		return longestString;		
	}
	

	public static void main(String[] args) {
		int[] nums = {1,-4,6,100,-400};
		System.out.println(cercaMassimo(nums));
		String[] nomi = {"piero","alessandro", "gio", "annamaria"};
		System.out.println(longest(nomi));
		int[] zeri = new int[100]; // 100 zeri
		System.out.println(cercaMassimo(zeri));

		String[] stringhe = new String[100]; // 100 null
		System.out.println(longest(stringhe));

	}
}
