package cap03;

import prog.io.ConsoleInputManager;

// domanda all'utnete una parola
// ripete ala massimo 3 parole
// se "stanco" esce prima
public class PappagalloStanco{
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		for(int i = 0; i < 3; i++) {
			String parola = in.readLine("?");
			if (parola.equals("stanco")) break;
			System.out.println(parola);			
		}
		
		
	}
	
	
}