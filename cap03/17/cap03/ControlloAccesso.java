package cap03;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ControlloAccesso {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String password = "java";
		//
		String pm = in.readLine("inserisci la parola magica");
//		if (pm == password)
		if (pm.equals(password))
			out.println("hai accesso");
		else
			out.println("non hai accesso! Fuori");
		
	}

}
