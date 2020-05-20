
public class CercaRic {

	public static void main(String[] args) {
		System.out.println(cerca(3,new int[] {5,6,3,4,3}));
		System.out.println(cerca(10,new int[] {5,6,3,4,3}));
		
	}
	
	// controlla se y è in a 
	static boolean cerca(int y, int[]a) {
		return cerca(y, a,0);
	}
	// cerca dall posizione pos // helper
	private static boolean cerca(int y, int[]a, int pos) {
		System.out.println("sto cercando da pos " + pos);
		if (pos >= a.length) return false;
		if (y == a[pos]) return true;
		return cerca(y,a,pos+1);
	}
	
	
}
