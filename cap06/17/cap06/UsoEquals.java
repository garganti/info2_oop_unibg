package cap06;

public class UsoEquals {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		
	}
	
}
