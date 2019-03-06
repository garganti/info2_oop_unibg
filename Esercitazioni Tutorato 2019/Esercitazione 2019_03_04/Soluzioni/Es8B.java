import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es8B {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		String s = in.readLine("inserisci la stringa");
		int countVocali = 0;
		// converto tutto in minuscolo così controllo solo le vocali minuscole
		s = s.toLowerCase();
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (isVocale(c)) {
				continue;
			}
			out.print(c);
		}
	}

	static boolean isVocale(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else
			return false;

	}

}
