import javax.print.attribute.standard.JobKOctets;

import prog.utili.Frazione;

public class Prova19 {

	public static void main(String[] args) {
		// VOGLIO CREARE ISTANZE DI frazione
		// 1/2
		new Frazione(1, 2);
		new Frazione(1); // -> 1/1
		new Frazione(3, 2); // -> 3/2

		String a = new String("ciao");
		new String("hello");

		// una volta che ho un riferimento ad un oggetto posso usarlo
		int c = a.indexOf('c');
		System.out.println(c);

		new JobKOctets(8);

		String s = "ciao";
		String h = s;
		System.out.println(h);
		h = "hello";
		System.out.println(h);
		System.out.println(s);
	}

}
