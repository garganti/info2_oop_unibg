

import prog.io.ConsoleInputManager;

public class UsoSwitch {
		
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		String s = in.readLine("?");
		switch (s) {
		case "ciao":
		case "hola":
		case "hello":
			System.out.println("ciao anche a te!");
			break;
		default:
			System.out.println("non mi saluti?");
			break;
		}
		
	}

}
