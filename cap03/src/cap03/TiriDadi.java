package cap03;

import java.util.Random;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/** domanda all'utente un numero N e tira N volte il dado
 * (scrivendo il risultato) e calcola e stampa la media
 */
public class TiriDadi {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int N = in.readInt("quanti tiri di dado vuoi fare?");
		Random rnd = new Random();
		double s = 0;
		for(int i = 0; i < N; i ++){
			int d =  1 + rnd.nextInt(6);
			out.print(d + " ");
			s+=d;
		}
		out.println();
		out.println(" media =" + s/N);
		
	}

}
