import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

/* chiede all'uetente una serie di figure 
 * cerchi, rettangoli e quadrati
 * e trovo la figura più grande
 */
public class MaxFigure {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		ArrayList<Figura> figure = new ArrayList<>();
		for(;;) { //forever
			char tf = in.readChar("che figura vuoi inserire (r,c,q,e)");
			if (tf == 'e') break;
			Figura f;
			switch (tf) {
			case 'c':
				f = new Cerchio(in.readDouble("raggio?"));
				break;
			case 'r':
				f = new Rettangolo(in.readDouble("base?"),
						in.readDouble("altezza?"));
				break;
			case 'q':
				f = new Quadrato(in.readDouble("lato?"));
				break;
			default:
				continue;
			}
			figure.add(f);
		}
		Figura max = cercaMaxArea(figure);
		out.println(max);
	}
	/**
	 * 
	 * @param figure insieme di figure
	 * @return il massimo in figure
	 */
	private static Figura cercaMaxArea(ArrayList<Figura> figure) {
		Figura max = null;
		for(Figura f: figure) {
			if (max == null || f.getArea()> max.getArea()) {
				// cambia max
				max = f;
			}
		}
		return max;
	}

}
