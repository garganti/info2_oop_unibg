package cap07ecc;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ProvaEccTC {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int x = in.readInt("primo numero");
		int y = in.readInt("secondo numero");
		try {
			out.println("il quoziente è " + x / y);
			out.println("ciao");
		} catch (IndexOutOfBoundsException ioe) {
			System.out.println("ERRORE!!!");
		} catch (ArithmeticException ae){
			System.out.println("DIVSIONE PER ZERO !!!");			
		}
	}

}
