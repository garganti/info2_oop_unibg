import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es4 {
	
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		

		int n1= in.readInt("Inserisci primo numeratore");
		int d1= in.readInt("Inserisci primo denominatore");
		int n2 = in.readInt("Inserisci secondo numeratore");
		int d2= in.readInt("Inserisci secondo denominatore");
		
		Frazione f1= new Frazione(n1,d1);
		Frazione f2= new Frazione(n2,d2);
		
		out.println("Somma " + f1.piu(f2));
		out.println("Differenza " + f1.meno(f2));
		out.println("Prodotto " + f1.per(f2));
		out.println("Quoziente " + f1.diviso(f2));
	}

}
