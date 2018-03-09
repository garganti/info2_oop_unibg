package cap06;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class CastEsplicito {

	public static void main(String[] args) {
		Figura f = new Cerchio(4);
		Cerchio c = (Cerchio) f; // OK
		
		// si possono fare tutte le conversioni con cats explicito
		// se la conversione è sicuramente errata, dà errore
		
		Rettangolo r = new Quadrato(4);
		//Cerchio c2 = (Cerchio)r;
		// questo
		Quadrato q = (Quadrato) r;
		
		//Rettangolo rr = new Rettangolo(4,5);
		//Quadrato qr = (Quadrato) rr;
		
		Rettangolo rq = new Rettangolo(4,4);
		Quadrato qq = (Quadrato) rq;
		
		

		
	}

}
