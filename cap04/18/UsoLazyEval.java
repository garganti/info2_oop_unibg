

import prog.io.ConsoleInputManager;

public class UsoLazyEval {
	
	public static void main(String[] args) {
		int x = 10;
		ConsoleInputManager in = new ConsoleInputManager();
		String singer = in.readLine("quale è il tuo cantante preferito");
		if (singer.equals("sorrenti") && (x++ > 0)) {
			System.out.println("bravo, hai vinto " + x);
		} else {
			System.out.println("hai perso ");	
		}
		System.out.println("x vale " +x);
		
		int p;
		if (singer.equals("cash")) {
			p = 20;
		} else {
			p = 30;
		}
		int b = singer.equals("cash") ? 20 : 30;
		
		
		long k = 9l;
		long v = 111998898098080080l;
		int f = (int) (k + 3);
		long h = f;
	}

}
