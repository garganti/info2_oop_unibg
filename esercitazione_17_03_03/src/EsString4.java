import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class EsString4 {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in  = new ConsoleInputManager();
		String s = in.readLine("inserisci la stringa");
		int countVocali = 0;
		for(int i = 0; i <= s.length() -1; i++){
			char c = s.charAt(i);
			if (c == 'a' || c== 'e'){ // TODO
				countVocali ++;
			}
		}
		out.println("la parola "+ "\"" + s + "\"" + " ha "+ countVocali + " vocali");

	}

}
