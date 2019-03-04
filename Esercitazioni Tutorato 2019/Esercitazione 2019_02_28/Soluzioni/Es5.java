import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es5 {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		int contatore = 0;
		Frazione somma = new Frazione(0, 1);

		do {
			int n1 = in.readInt("Inserisci numeratore");
			int d1 = in.readInt("Inserisci denominatore");
			Frazione f1 = new Frazione(n1, d1);
			somma = somma.piu(f1);
			contatore++;

		} while (in.readSiNo("Vuoi inserire un'altra frazione? "));

		out.println("La media è: " + somma.diviso(new Frazione(contatore, 1)));

	}

}
