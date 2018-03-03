import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class TabellPitagora {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int N = in.readInt("inserisci N");
		for(int i = 1; i <= N ; i++){
			for(int j = 1; j <= N; j++){
				int p = i*j;
				out.print(String.valueOf(p) + '|');
			}
			out.println();
		}
	}
}
