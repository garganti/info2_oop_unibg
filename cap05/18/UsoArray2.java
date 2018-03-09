import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/** domando n, riempio l'array con nomi del genere
 * nome0, nome1, .....
 * e poi li stampo
 * 
 * 
 */
public class UsoArray2 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int n = in.readInt("quanti nomi vuoi inserire?");
		
		String[] nomi = new String[n];
		for(int i = 0; i < n; i++) {
			nomi[i] = new String("nome "+i);
		}
		print(nomi);		
	}

	private static void print(String[] nomi) {
		for (String s : nomi) {
			System.out.println(s);
		}
	}

}
