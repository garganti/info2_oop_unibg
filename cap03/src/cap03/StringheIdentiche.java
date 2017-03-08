package cap03;

public class StringheIdentiche {
	public static void main(String[] args) {
		String a = "pippo";
		String b = "pippo";
		
		String c = new String("pippo");
		String d = new String("pippo");
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
		System.out.println( "*********");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
	}

}
