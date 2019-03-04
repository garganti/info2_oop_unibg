import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Es7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager tastiera = new ConsoleInputManager();
		String frase = tastiera.readLine("inserisci la frase");
		// devo stampare la corniecetta superiore
		int lf = frase.length();
		String asterischi = "*****************************";
		String spazi = "                                    ";
		String sottoStringaAst = asterischi.substring(0, lf+4);
		String sottoStringaSpz = spazi.substring(0, lf+2);
		ConsoleOutputManager video = new ConsoleOutputManager();
		video.println(sottoStringaAst);
		video.println("*".concat(sottoStringaSpz).concat("*"));
		video.println("* ".concat(frase).concat(" *"));
		video.println("*".concat(sottoStringaSpz).concat("*"));
		video.println(sottoStringaAst);
	}

}
