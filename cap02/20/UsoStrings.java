import prog.io.ConsoleOutputManager;

public class UsoStrings {

	public static void main(String[] args) {

		String s = "pippo";
		ConsoleOutputManager out = new ConsoleOutputManager();

		out.println(s.substring(0, 3));
		out.println(s);

		StringBuffer sb = new StringBuffer("iii");
		sb.append("jjjj");
		out.println(sb.toString());

		String a = null;
		// out.println(a.toLowerCase());

		out.println(Math.cos(Math.PI));
		// CTRL + SHIFT + F aoutindent
		if (true)
			a = a.substring(3, 4);
		else
			a = a.substring(3, 4);

	}

}
