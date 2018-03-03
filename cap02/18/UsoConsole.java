import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class UsoConsole {
	
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println("cjjdiooisdof");
		out.print(3);
	
		String s = new String("yyyyyy");
		out.println(s.toString());
		
		ConsoleInputManager in = new ConsoleInputManager();
		String nome = in.readLine("come ti chiami?");
		out.print("ciao ");
		out.print(nome);
		out.println(" come stai?");
		
	}

}
