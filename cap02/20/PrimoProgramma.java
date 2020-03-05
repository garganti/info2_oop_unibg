import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class PrimoProgramma {

	public static void main(String[] args) {
		// creaimo una String
		String s;
		
		s = new String("oggi");
		
		s.length();
		
		Frazione f = new Frazione(5, 3);
		Frazione f2 = new Frazione(1, 3);
		
		Frazione risultato = f.meno(f2);
		
		ConsoleOutputManager video = new ConsoleOutputManager();
		
		video.println("il risultato è:");
		video.println(risultato);

	}

}
