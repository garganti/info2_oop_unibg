import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.utili.Sequenza;

// chiedo una sequenza di parole
// fino a quando inserisci la parola vuota
// memorizzo e ristampo alla fine
public class usoSequenza{
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		// dove memorizzo le parole?
		// espande automaticamente
		Sequenza<String> parole = new Sequenza<>();
		/* inserimento
		System.out.println(parole);
		parole.add("piero");
		System.out.println(parole);
		parole.add("paolo");
		System.out.println(parole);
		parole.add("ciao");
		
		//
		System.out.println(parole);*/
		for(;;) {
			String parola = in.readLine("?");
			if (parola.length() == 0) break;
			parole.add(parola);
		}
		// le ristampo con foreach
		for(String p: parole) {
			System.out.print(p + " ");
		}
		
		
		//  se volessi usa ArrayList
		ArrayList<String> nomi = new ArrayList<>();
		nomi.add("piero"); // alla fine
		nomi.set(0, "paolo"); // nomi[0] = paolo
		nomi.add(0,"anna"); //
		System.out.println(nomi);
		System.out.println(nomi.get(1));// nomi[1]
		nomi.remove(0); 
		System.out.println(nomi);
		
		
	}
	
}