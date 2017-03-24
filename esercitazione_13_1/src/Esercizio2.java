import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Esercizio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String frase = in.readLine("inserisci frase");
		for(int i = 0 ; i< frase.length(); i++){
			char c_i = frase.charAt(i);
			if (! isVocale(c_i)) out.print(c_i);
		}
	}
	private static boolean isVocale(char charAt) {
		switch(charAt){
			case 'a': case 'A':
			case 'e': case 'E':
			case 'i': case 'I':
			case 'o': case 'O':
				// TODO to be completed
				return true;
		}
		return false;
	}

}
