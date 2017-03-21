import prog.io.ConsoleInputManager;

public class UsoMetodiStatici {
	public static void main(String[] args) {
		
		System.out.println(5 + 6);
		System.out.println(String.valueOf(5)  + String.valueOf(6));
		System.out.println(Math.PI);
		System.out.println(Math.sin(3.141));
		System.out.println(Math.max(3, 4));
		ConsoleInputManager in = new ConsoleInputManager();
		String n = in.readLine("inserisci un numero");
		System.out.println(Integer.parseInt(n) + 10);
	}

}
