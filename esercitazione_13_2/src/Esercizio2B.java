import java.util.Iterator;
import java.util.Vector;

import javax.sound.midi.Sequence;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Sequenza;

/**
 * come 2A ma con vector e stampa posizioni pari prima o 
 * poi tutte le dispari
 * 
 * 
 */
public class Esercizio2B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		// chiedo all'utente le parole da mettere in sequenza
		Vector<String> parole = new Vector<String>();
		for (;;) {
			String line = in.readLine();
			if (line.equals(""))
				break;
			parole.add(line);
		}
		// stampa posizioni pari
		for(int i = 0; i < parole.size(); i += 2){
			out.println(parole.get(i));
		}
		// stampa posizioni dispari
		for(int i = 1; i < parole.size(); i += 2){
			out.println(parole.get(i));
		}
	}

}
