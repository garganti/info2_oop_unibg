import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// chiediamo all'utente una serie di numeri
// terminati da "exit"
// isneririti come stringhe
// calcoliamo la somma
public class SommaNumeriinStringhe {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int somma = 0;
		for(;;) {
			String numero = in.readLine("ins. numero exit per uscire");
			if (numero.equals("exit")) break;
			somma += Integer.parseInt(numero);
		}
		out.println("la somma è " + somma);
	}

}
