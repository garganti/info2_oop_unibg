package cap04;

import prog.io.ConsoleInputManager;

public class UsoWrapper {

	public static void main(String[] args) {
		Integer s = new Integer(8);
		s.byteValue();
		// metodi statici
		Integer.max(3, 4);
		// costanti statiche
		System.out.println(Integer.MAX_VALUE); /// massimo valor eintero
		
		// domando all'utente una frase e conto le maiuscole in essa
		ConsoleInputManager in = new ConsoleInputManager();
		String frase = in.readLine("?");
		int nM = 0;
		for(int i = 0; i < frase.length(); i++) {
			nM = nM + (Character.isUpperCase(frase.charAt(i))? 1 : 0);
		}
		System.out.println(nM);
	}

}
