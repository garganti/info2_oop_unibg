package cap07ecc;

import prog.io.ConsoleInputManager;
import prog.utili.Frazione;

public class EsempioEccc {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int n = in.readInt("numeratore");
		int d = in.readInt("denominatore");
		// 
		//System.out.println(n/d);
		try {
			Frazione f = new Frazione(n,d);
			System.out.println(f.toString());
		} catch(Exception e) {
			System.out.println("ma cosa hai inserito?");
		}
	}

}
