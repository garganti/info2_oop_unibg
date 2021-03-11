import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// chiediamo una frase e contiamo le minuscole 
// e maiuscole
public class CountaMaiuscole {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String s = in.readLine("inserisci la tua frase");
		//
		int min = 0, mai = 0;
		for(int i=0; i< s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				mai++;
			if (Character.isLowerCase(s.charAt(i)))
				min++;							
		}
		// java
		System.out.println("maiuscole " + mai + " minuscole "+ min);
		
		
	}

}
