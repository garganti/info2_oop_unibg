package cap10;

import java.util.Arrays;

class Computer {
	String modello;
	public Computer(String s) { modello = s;}
}
class ComputerEq {
	String modello;
	public ComputerEq(String s) { modello = s;}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComputerEq) {
			return this.modello.
					equals(((ComputerEq)obj).modello);
		}else {
			return false;
		}
	}
}


public class UsoEqualsObject {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o1));

		Computer c1 = new Computer("lenovo");
		Computer c2 = new Computer("lenovo");
		System.out.println(c1.equals(c2)); // -> false
		
		System.out.println(
				Arrays.asList(c1,c2).contains(
						new Computer("lenovo")));
		// == con una classe che implementa equals
		ComputerEq ce1 = new ComputerEq("lenovo");
		ComputerEq ce2 = new ComputerEq("lenovo");
		System.out.println(ce1.equals(ce2)); // -> true
		
		System.out.println(
				Arrays.asList(ce1,ce2).contains(
						new ComputerEq("lenovo")));

	}

}
