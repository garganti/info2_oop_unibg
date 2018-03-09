import com.sun.prism.j2d.J2DPipeline;

import prog.io.ConsoleInputManager;
import prog.utili.Frazione;

public class UsoArray {

	public static void main(String[] args) {
		
		int[] numeri;
		ConsoleInputManager in = new ConsoleInputManager();
		int n = in.readInt("quanti siete in classe?");
		
		String[] classe =  new String[n];
		classe[0] = new String("paolo");
		classe[1] = new String("paolo");
		classe[2] = new String("paolo");
		//classe[20] = new String("paolo");
		
		System.out.println("elementi "+classe.length);

		J2DPipeline[] ll;
		Frazione[] ff = new Frazione[4];

	}

}
