import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class SommaFrazioni {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		Frazione f1;
		Frazione f2;
		Frazione somma;
		// domandare all'utente f1
		// domandare  numeratore e denominatore
		int n1 = in.readInt("inserisci num di f1");
		int d1 = in.readInt("inserisci den di f1");
		Frazione f1 = new Frazione(n1, d1);
		// domando f2
		f2 = new Frazione(in.readInt("inserisci num di f2"),
						in.readInt("inserisci den di f2"));	
		somma = f1.piu(f2);
		// stampare il risultato
		// trasforma somma in una string che la rappresenti
		//out.println(somma.toString());				
		out.println(somma);				
	}

}
