package cap04;

import prog.io.ConsoleInputManager;

// domanda una frase e conta le maiuscole e inumeri in essa
public class ContaMaiscuoleEnumeri {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String frase = in.readLine("frase?");
		int nM = 0, nN = 0;
		// scorro la frase
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			// ternario
			nM += Character.isUpperCase(c)? 1: 0;
			// uso if
			if (Character.isDigit(c))
				nN ++;
		}
		System.out.println(" numero maiuscole :" + nM);
		System.out.println(" numero numeri :" + nN);
	}

}
