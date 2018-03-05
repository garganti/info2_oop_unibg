import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Esercizio3 {
	
	public static void main(String[] args) {
		// devo creare due frazioni 1/3 e 2/3 ....
		Frazione f1 = new Frazione(1,3);
		Frazione f2 = new Frazione(2,3);
		// faccio operazioni
		ConsoleOutputManager out = new ConsoleOutputManager();
		// la somma
		Frazione somma = f1.piu(f2);
		out.println("la somma è " + somma.toString());
		// il prodotto
		Frazione prodotto = f1.per(f2);
		out.println("il prodotto è "+ prodotto.toString());
		// la differenza
		out.println("la differeza è" + f1.meno(f2).toString());
		

		
	}

}
