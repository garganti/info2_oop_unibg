package cap05;

import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

// esercizio 18 - leggo da file e ristampo in ordine
public class Esercizio18 {
	
	public static void main(String[] args) {
		// apro il file
		FileInputManager file = new FileInputManager("La Tigre della Malesia.txt");
		//
		SequenzaOrdinata<String> parole = new SequenzaOrdinata<String>();
		// leggo le righe del file
		while(true) {
			String s = file.readLine();
			if (s == null) break;
			// uso s
			String[] data = s.split(" ");
			for(String d: data) {
				parole.add(d.toLowerCase().trim());
			}
		}
		// stampo le parole in ordine
		for(String s: parole) {
			System.out.println(s);
		}
	}

}
