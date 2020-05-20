
public class ContaRic {
	public static void main(String[] args) {
		System.out.println(conta(3,new int[] {5,6,3,4,3}));
		
	}
	
	// conta quante volte y è in a
	static int conta(int y, int[]a) {		
		return conta(y,a,0);
	}
	// conta dall posizione pos // helper
	private static int conta(int y, int[]a, int pos) {
		System.out.println("sto contanto da pos " + pos);
		if (pos >= a.length) return 0;
		if (y == a[pos]) return 1 + conta(y,a,pos+1);
		else return conta(y,a,pos+1);
	}

}
