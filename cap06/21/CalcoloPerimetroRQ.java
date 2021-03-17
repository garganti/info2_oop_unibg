import prog.io.ConsoleInputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

// l'utente inserisce un rettongolo o
// un quadrato e poi calcolo il perimetro
public class CalcoloPerimetroRQ {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		char f = in.readChar("R per rettangolo, Q per quadrato");
		Rettangolo r;
		switch (f) {
		case 'R':
			double b = in.readDouble("base?");
			double h = in.readDouble("altezza?");
			r = new Rettangolo(b, h);
			break;
		case 'Q':
			double l = in.readDouble("lato?");
			r = new Quadrato(l);
			r.equals(new Quadrato(4));
			break;
		default:
			System.err.println("che figura è?");
			return;
		}
		System.out.println(r.getArea());
		System.out.println("hai inserito un " + r.getClass().getSimpleName());
		System.out.println(r.toString());
		// ERRORE non posso usare
		// metodi delle sotto classi
		// System.out.println(r.getLato());
	}

}
