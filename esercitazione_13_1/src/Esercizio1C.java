import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Creare un nuovo progetto che chiede due numeri all'utente e 
 * ne stampa la somma.
 * 
 * @author garganti
 * 
 */
public class Esercizio1C {
	
	public static void main(String[] args) {
		ConsoleInputManager tastiera = new ConsoleInputManager();
		ConsoleOutputManager video = new ConsoleOutputManager();
		int x,y;
		// chiedi all'utente un numero
		x = tastiera.readInt("inserisci un numero");
		// chiedi l'altro
		y = tastiera.readInt("inserisci un altro numero");
		// calcola la somma
		int somma = x +y;
		video.print("La somma è: ");
		video.println(somma);
		// oppure
		//video.print("La somma è: " + (x+y));
	}
}
