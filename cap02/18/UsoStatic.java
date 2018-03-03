import prog.io.ConsoleInputManager;

public class UsoStatic {

	public static void main(String[] args) {
		int x = 10;
		int y = 2000;
		System.out.println(String.valueOf(x) + String.valueOf(y));
		System.out.println("" + x + y);
		
		System.out.println(Math.sin(0));
		
		System.out.println(Math.PI);
		
		ConsoleInputManager in = new ConsoleInputManager();
		String eta = in.readLine("quale è la tua età?");
		int etaInt = Integer.parseInt(eta);
		System.out.println(etaInt *.8);
		
		
	}

}
