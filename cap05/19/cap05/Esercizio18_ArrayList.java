package cap05;

import java.util.ArrayList;
import java.util.Collections;

import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

// esercizio 18 - leggo da file e ristampo in ordine
public class Esercizio18_ArrayList {
	
	public static void main(String[] args) {
		// apro il file
		FileInputManager file = new FileInputManager("La Tigre della Malesia.txt");
		//
		ArrayList<String> parole = new ArrayList<String>();
		// leggo le righe del file
		while(true) {
			String s = file.readLine();
			if (s == null) break;
			// uso s
			String[] data = s.split(" ");
			for(String d: data) {
				String d_clean = d.toLowerCase().trim();
				if (!parole.contains(d_clean))
					parole.add(d_clean);
			}
		}
		// stampo le parole in ordine
		// ordino le parole
		Collections.sort(parole);
		// stampo
		for(String s: parole) {
			System.out.println(s);
		}
		Integer.parseInt("1");
		
		Character c1 = new Character('a');
		Character c2 = 'a';
	}

}
