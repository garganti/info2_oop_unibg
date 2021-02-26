
// domanda all'utente una parola e la ristampa a video

import prog.io.*;

public class Pappagallo {
	
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		String parola; // non so che valore abbia ancora
		// domanda all'utente
		parola = in.readLine("?");
		out.println(parola);
	}
	

}
