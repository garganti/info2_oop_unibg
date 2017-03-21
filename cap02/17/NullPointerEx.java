import prog.io.ConsoleOutputManager;

public class NullPointerEx {
	public static void main(String[] args) {
//		String s = null;
		String s = "ciao";
//		ConsoleOutputManager out = null;
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println(s.length());
	}
}
