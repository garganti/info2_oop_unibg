
public class ProvaOrario {
	public static void main(String[] args) {
		Orario o1 = new Orario(23, 12, 14);
		System.out.println(o1.toString());// -> 23:12:14
		// controllo stampa con sec < 10
		o1 = new Orario(23, 12, 0);
		System.out.println(o1.toString());// -> 23:12:00
		// se ore > 23 o min > 59
		o1 = new Orario(10, 62 , 0);
		System.out.println(o1.toString());// -> 11:02:00
		o1 = new Orario(10, 12, 62);
		System.out.println(o1.toString());// -> 10:13:02
		o1 = new Orario(10, 62, 62);
		System.out.println(o1.toString());// -> 11:03:02
		o1 = new Orario("12:39:34");
		System.out.println(o1);
		Orario fine = new Orario("13:00:00");
		System.out.println(o1.differenzaSec(fine));
		
		
	}
}
