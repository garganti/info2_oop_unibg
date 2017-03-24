import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Un semplice programma che faccia apparire sotto una cornice di asterischi la
 * frase inserita:
 * 
 * <pre>
 ******************** 
 *                  *
 *  Ciao, come va?  *
 *                  *
 ******************** </pre>
 */
public class Esercizio2B {

	public static void main(String[] args) {
		// predisposizione dei canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// le righe utilizzate per costruire la cornice
		String rigaAsterischi = "********************" + 
								"********************"
				+ "********************" + "********************"; // in tutto
																	// 80
																	// asterischi

		String rigaBianca = "                    " + "                    "
				+ "                    " + "                    "; // in tutto
																	// 80 spazi
		String frase;
		int lunghezza;
		frase = in.readLine();
		lunghezza = frase.length();

		// costruzione delle righe che costituiranno la cornice
		String rigaCornice, rigaIntermedia, rigaTesto;
		String spazi = rigaBianca.substring(0, (80 - (lunghezza + 6)) / 2);
		rigaCornice = spazi + rigaAsterischi.substring(0, lunghezza + 6);
		rigaIntermedia = spazi + "*" + rigaBianca.substring(0, lunghezza + 4)
				+ "*";
		rigaTesto = spazi + "*  " + frase + "  *";

		// visualizzazione della cornice
		out.println(rigaCornice);
		out.println(rigaIntermedia);
		out.println(rigaTesto);
		out.println(rigaIntermedia);
		out.println(rigaCornice);
	}
}
