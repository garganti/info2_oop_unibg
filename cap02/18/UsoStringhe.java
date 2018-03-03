import prog.io.ConsoleOutputManager;

public class UsoStringhe {
	public static void main(String[] args) {
		//String s = new String("sosdods\taoso");
		//String s = new String("io sono molto \"bello\"");
		String s = "ciao";
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println(s);
		
		String t = s.toUpperCase();
		out.println(t);
		out.println("=====s:");
		out.println(s);
		
		String name  = "piero";
		// ciao piero
		out.println(s.concat(name));
		//oppure:
		out.println(s + name );
		
		out.println(" ciao " + name + " come stai?");
	}
}
