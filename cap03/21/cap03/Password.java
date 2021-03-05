package cap03;

import prog.io.ConsoleInputManager;

// domando password
// se corretta ("java") procedo altrimeni no
public class Password {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String password = in.readLine("password?");
		if (password.equals("java")) {
			System.out.println("procedi ok");
		} else {
			System.out.println("vai via !!!");
		}
		
	}

}
