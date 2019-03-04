package cap03;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// domanda la passowrd e se è "java"
// garantisce l'accesso al sistema
public class AccessoSistema {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String password = in.readLine("password?");
		// NOif( password == "java") {
		if (password.equals("java")) {
			out.println("accesso garantito");
		} else {
			out.println("vai via hacker russo!!!");
		}
		int i; String k; char y;
		for (i = 0, y = 10, k = "80"; i < 10; i++) {

		}
		//for(int i2 = 0;false;);
		int i3;
		//for(i3 = 0;;);
		
		for(;;) {
			
		}
	}

}
