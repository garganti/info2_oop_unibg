import java.util.StringTokenizer;
import java.util.Vector;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Esercizio2 {

	public static void main(String[] args) {
		Vector<Figura> fig = new Vector<>();
		String s1 = "Q, 3.8; R, 5,8.7; C, 0.5";
		StringTokenizer st1 = new StringTokenizer(s1, ";");
		while (st1.hasMoreTokens()) {
			String s2 = st1.nextToken().trim();
			StringTokenizer st2 = new StringTokenizer(s2, ",");
			char campo = st2.nextToken().charAt(0);
			Figura k = null;
			switch (campo) {
			case 'Q':
			case 'q':
				k = new Quadrato(Double.parseDouble(st2.nextToken()));
				break;
			case 'C':
			case 'c':
				k = new Cerchio(Double.parseDouble(st2.nextToken()));
				break;
			case 'R':
			case 'r':
				k = new Rettangolo(Double.parseDouble(st2.nextToken()), Double.parseDouble(st2.nextToken()));				
			}
			fig.add(k);
		}
		System.out.println(fig);
	}
}