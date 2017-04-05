package cap06;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Rettangolo;

public class UsoFigure {

	
	public static void main(String[] args) {
		Figura f;
		f = new Rettangolo(3, 6.7);
		f = new Cerchio(6);
		
		f = new Figura(); // non posso è astratta
			
	}
}

