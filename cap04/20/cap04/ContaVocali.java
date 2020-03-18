package cap04;

import prog.io.ConsoleInputManager;

// domanda una frase e conta le vocali
public class ContaVocali {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String frase = in.readLine("frase?");
		int na = 0, ne = 0, ni = 0, nu = 0, no = 0;
		// scorro la frase
		for(int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			switch(c) {
			// TODO maiuscolo???
			case 'a': na++; break;
			case 'i': ni++; break;
			case 'u': nu++; break;
			case 'o': no++; break;
			case 'e': ne++; break;
			}
		}
		System.out.println(" conteggio vocali:");
		System.out.println("A :" + na);
		System.out.println("I :" + ni);
		System.out.println("U :" + nu);
		System.out.println("O :" + no);
		System.out.println("E :" + ne);
		
	}

}
