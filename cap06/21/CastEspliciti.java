import prog.utili.Frazione;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class CastEspliciti {
	
	public static void main(String[] args) {
		Rettangolo r = new Quadrato(4);
		System.out.println(r instanceof Quadrato);
		System.out.println(r);
		// guardia alla conversioni esplicite
		if (r instanceof Quadrato) {
			Quadrato q = (Quadrato)r;
			System.out.println(q.getLato());
		}
		// ERRORI Frazione s = (Frazione) r;
		
	}

}
