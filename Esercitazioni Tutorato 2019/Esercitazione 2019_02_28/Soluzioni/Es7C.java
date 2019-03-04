import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Scrivi un programmino che domanda una stringa e dice se palindroma Come
 * metodo ulteriore Che ignora maiuscolo/minuscolo Che toglie gli spazi
 * all'inizio e alla fine.
 */
public class Es7C {
	public static void main(String[] args) {
		// alcune prove
		testPalindroma("pippo");
		testPalindroma("anna");
		testPalindroma("anina");
		testPalindroma("anna  ");
		testPalindroma("AnNa  ");
	}
	
	// testa una parola
	static void testPalindroma(String parola){
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println(parola + (! isPalindroma(parola) ? " non " : " ") + "è palindroma");
		
	}
	// calcola se palindroma, non fa alcun output
	static boolean isPalindroma(String parola) {
		// converti in miuscole
		parola = parola.toLowerCase();
		// togli spazi
		parola = parola.trim();
		// posizione mezzo - se dispari ok
		int mid = parola.length() /2;
		// indice
		for(int i = 0; i < mid ; i++){
			// se sono diversi, sicuramente non palindroma
			if(parola.charAt(i) != 
					parola.charAt(parola.length()-1-i))
				return false;
		}
		return true;
	}
}
