package cap06;

import java.util.StringTokenizer;

import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class Esercizio3_3 {

	public static void main(String[] args) {
		FileInputManager java = new FileInputManager("java.txt");
		SequenzaOrdinata<String> parole = new SequenzaOrdinata<>();
		// leggo le parole nel file che potrebbero essere
		// su più linee
		while(true) {
			// leggi una linea
			String line = java.readLine();
			if (line == null) break;
			// spezza le parole nella linea line
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()) {
				// aggiungi la parola
				//parole.add(st.nextToken());
				// variante, aggiungi il minuscolo solo se non presente
				String parola = st.nextToken().toLowerCase();
				if (!parole.contains(parola)) {
					parole.add(parola);
				}
			}			
		}
		// chiudiamo il file
		java.close();
		// ristampa le parole
		for(String s: parole) {
			System.out.println(s);
		}

	}
	
}
