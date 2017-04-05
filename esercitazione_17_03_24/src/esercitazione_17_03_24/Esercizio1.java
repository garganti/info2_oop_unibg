package esercitazione_17_03_24;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Esercizio1 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int N = in.readInt("Num di frazioni: ");
		Frazione[] frazioni = new Frazione[N];
		// leggo le frazioni
		for (int i=0; i<N; i++) {
			frazioni[i] = new Frazione(in.readInt("Numeratore"), in.readInt("Denominatore"));
		}
		
		// sommo le frazioni
		Frazione somma = new Frazione(0);
		for (int i=0; i<N; i++) {
			somma = somma.piu(frazioni[i]);
		}
		
		// calcolo la media (cioè somma/Num di frazioni)
		Frazione media = somma.diviso(new Frazione(N));
		out.println(media);
	}
}
