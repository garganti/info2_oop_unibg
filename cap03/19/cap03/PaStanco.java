package cap03;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class PaStanco {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		for(;;) {
			String frase = in.readLine("?");
			// se stanco esce
			if (frase.equals("stanco")) break;
			// se loreto richiedo subito un'altra parola
			if (frase.equals("loreto")) continue;
			out.println("-->" + frase);
			String s = frase.equals("A") ? "f" : "g";
			
			long l = 4485978754754l;
 		}
	}

}
