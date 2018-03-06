import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Esercizio4A {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String frase = in.readLine();
		int countVocali = 0;
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (isVocale(c)) {
				countVocali++;
			}
		}
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println("la frase ha " + countVocali + " vocali");
	}

	// restituisce true se il carattere c è vocale
	static boolean isVocale(char c) {
		switch(c){
		case 'a': 
		case 'A': 
		case 'i': 
		case 'I': 
		case 'o': 
		case 'O': 
		case 'u': 
		case 'U': 
		case 'e': 
		case 'E': 
			return true;
		default:
			return false;
		}
	}

}
