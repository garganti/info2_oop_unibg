import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class ProvaRettangolo {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		double base = in.readDouble("base?");
		double altezza = in.readDouble("altezza?");
		Rettangolo re;
		if (base != altezza) {
			re = new Rettangolo(base, altezza);
		} else {
			// base == altezza
			re = new Quadrato(base);
		}
		out.println("area = " + re.getArea());
		out.println("figura =" +re.toString());
		
		//out.println(re.getClass());
		if (re instanceof Quadrato) {
			out.println("hai inserito un quadrato");
		}
		if (re instanceof Rettangolo) {
			out.println("hai inserito un Rettangolo");
		}
		if (re instanceof Quadrato) {
			Quadrato q = (Quadrato) re;
			q.getLato();
		}		
	}
}
