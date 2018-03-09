package cap06;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Rettangolo;

// domanda base e altezza ad utente del rettangolo da creare
// calcola l'area e il perimetro del rettangolo
public class UsoRettangolo {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int b =in.readInt("inserisci base");
		int h = in.readInt("inserisci altezza");
		Rettangolo r = new Rettangolo(b, h);
		// stampo i dati del rettangolo
		out.println("area è " +r.getArea());
		out.println("perimetro è "+ r.getPerimetro());
	}
	
}
