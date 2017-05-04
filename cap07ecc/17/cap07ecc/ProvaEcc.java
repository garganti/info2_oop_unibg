package cap07ecc;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ProvaEcc {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int x = in.readInt("primo numero");
		int y = in.readInt("secondo numero");
		if (y ==0){
			out.println("non puoi fare divisione per zero")
		} else{
			out.println("il quoziente è " + x/y);
		}
		/*String h = "ciao";
		System.out.println(h.charAt(4));
		int a[] = new int[10];
		System.out.println(a[10]);*/
	}

}
