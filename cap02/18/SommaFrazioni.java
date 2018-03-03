import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

// domanda due frazioni (num e den) e
// calcola la somma e la stampa

public class SommaFrazioni {

public static void main(String[] args) {
	ConsoleInputManager in = new ConsoleInputManager();
	ConsoleOutputManager out = new ConsoleOutputManager();
	// domando i dati della prima frazione
	int n1 = in.readInt("num prima frazione");
	int d1 = in.readInt("den prima frazione");
	int n2 = in.readInt("num seconda frazione");
	int d2 = in.readInt("den seconda frazione");	
	Frazione f1 = new Frazione(n1,d1);
	Frazione f2 = new Frazione(n2,d2);
	Frazione somma = f1.piu(f2);
	out.println("la somma delle frazioni è:");
	out.println(somma.toString());
}
	
	
}
