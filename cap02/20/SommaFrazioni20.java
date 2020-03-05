import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

// domando due frazioni e scrive la loro somma
public class SommaFrazioni20 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		// domando la prima frazione
		int num = in.readInt("numeratore prima frazione");
		int den = in.readInt("denominatore prima frazione");
		Frazione f1 = new Frazione(num,den);
		// domando la seconda frazione
		num = in.readInt("numeratore seconda frazione");
		den = in.readInt("denominatore seconda frazione");
		Frazione f2 = new Frazione(num,den);
		// calcola la somma
		Frazione somma = f1.piu(f2);
		out.print("il risultato è: ");
		out.println(somma.toString());
		
	}
	
	
}
