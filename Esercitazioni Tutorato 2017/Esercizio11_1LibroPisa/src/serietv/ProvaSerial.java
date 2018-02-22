package serietv;

public class ProvaSerial {

	public static void main(String[] args) {
		
		Episode e1 = new Episode("Leonard meets Penny");
		Episode e2 = new Episode("Sheldon buys a book");
		e1.setNext(e2);
		
		Episode e3 = new Episode("Sheldon buys a BOOK");
		System.out.println(e2.equals(e3));
		
		Serial serial = new Serial("the big bang theory",e1);
		System.out.println(serial.toString());
		
	}
	
}
