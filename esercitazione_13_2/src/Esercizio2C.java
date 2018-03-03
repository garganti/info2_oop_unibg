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
public class Esercizio2C {

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
		// primo iterator per posizioni pari
		Iterator<String> posizionipari = parole.iterator();
		while(posizionipari.hasNext()){
			out.println(posizionipari.next());
			// butta via quello a posizione dispari
			if(posizionipari.hasNext()) posizionipari.next();
		}
		Iterator<String> posizioniDispari = parole.iterator();
		while(posizioniDispari.hasNext()){
			// butta via quello a posizione pari
			if (posizioniDispari.hasNext()) posizioniDispari.next();
			// stampa quello in posizione dispari
			out.println(posizioniDispari.next());
		}
	}

}
