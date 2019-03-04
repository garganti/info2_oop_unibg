import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Es6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager tastiera = new ConsoleInputManager();
		String frase = tastiera.readLine("inserisci la frase");
		// devo stampare la corniecetta superiore
		int lf = frase.length();
		String asterischi = "*****************************";
		String sottoStringaAst = asterischi.substring(0, lf);
		ConsoleOutputManager video = new ConsoleOutputManager();
		video.println(sottoStringaAst);
		video.println(frase);
		video.println(sottoStringaAst);
	}

}
