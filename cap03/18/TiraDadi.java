

import java.util.Random;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class TiraDadi {
	//  faccio 10 tiri di dado e se la somma è > 35
	// mi succede qualcosa di bello
	public static void main(String[] args) {
		long somma = 0;
		ConsoleOutputManager out = new ConsoleOutputManager();
		for(int i = 0; i < 10; i++) {
			out.print("tiro numero " + (i+1) + " :");
			//double dado = Math.floor(Math.random() * 6) +1;
			int dado = (int)(Math.random() * 6) +1;
			//int d = new Random().nextInt(6);
			out.println(dado);
			somma += dado;
			if (somma >= 35)
				break;
		}
		if (somma >= 35) {
			out.print("ti succede qualcosa di bello");
		}
	}
	
	
	

}
