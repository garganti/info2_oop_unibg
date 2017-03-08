import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/*Un semplice programma che faccia apparire 
 * sotto una cornice di asterischi la frase inserita: 
********************
*                  *
*  Ciao, come va?  *
*                  *
********************
Dichiara qualche variabile di appoggio per 
memorizzare Usa substring, length e concat*/

public class Esercizio2B {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String s = in.readLine("inserisci frase");
		String asterisci = "*********************************";
		out.println(asterisci.substring(0, s.length()));
		out.println(s);
		out.println(asterisci.substring(0, s.length()));

	}
}
