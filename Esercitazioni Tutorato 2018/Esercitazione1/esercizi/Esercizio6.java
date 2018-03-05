import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Esercizio6 {

	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in  = new ConsoleInputManager();
		String s = in.readLine("inserisci una stringa");
		// voglio stampare s con asterischi sopra e sotto
		String asterischi = "****************************************";
		// 
		String bordo = asterischi.substring(0, s.length());
		out.println(bordo);
		out.println(s);
		out.println(bordo);
	}
	
}
