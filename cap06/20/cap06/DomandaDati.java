package cap06;

import prog.io.ConsoleInputManager;
import prog.utili.Cerchio;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;


// domanda all'utene i due lati di un rettangolo o quadrato
// se sono uguali isntazia un quadrato
// altrimenti costruisc eun rettangolo
// stampa area e perimetro
public class DomandaDati {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		int a = in.readInt("primo lato");
		int b = in.readInt("secondo lato");
		Rettangolo r;
		if (a==b) {
			r = new Quadrato(a);
		} else {
			r = new Rettangolo(a,b);
		}
		// NON POSSO r = new Cerchio(5)
		// posso saper qui se e è un rettangolo o un quadrato????
		//instanceof
		if (r instanceof Quadrato) {
			System.out.println("questo è un quadrato");
			System.out.println(" con lato " + ((Quadrato)r).getLato());
		}
		if (r instanceof Rettangolo)
			System.out.println("questo è un rettangolo");
		
		// non c'è nel libro
		System.out.println(r.getClass());
		
		System.out.println(r.toString());
		System.out.println(r.getArea());
		System.out.println(r.getPerimetro());
	}
	
}
