import java.util.Iterator;

import javax.sound.midi.Sequence;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Sequenza;


public class Esercizio2A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		// chiedo all'utente le parole da mettere in sequenza
		Sequenza<String> parole = new Sequenza<String>();
		for(;;){
			String line = in.readLine();
			if (line.equals("")) break;
			parole.add(line);
		}
		// uso iterator
		Iterator<String> iterator = parole.iterator();
		while(iterator.hasNext()){
			out.println(iterator.next());
		}
	}

}
