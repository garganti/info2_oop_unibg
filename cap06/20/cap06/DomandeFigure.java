package cap06;

import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class DomandeFigure {
	// domanda all'utente una serie di figure geometriche che memorizzo in un vector
	// domanda char R -> rettangolo q -> ...
	// poi calcolo quella che ha area massima (con un metodo)

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		// per morizzare un solo vector di Figura 
		// NON USARE 3 vector per ogni tipo di figura
		Vector<Figura> figure = new Vector<Figura>(); 
		for(;;) {
			char f = in.readChar("che figura vuoi inserire");
			if (f=='x') break;
			Figura figura = null;
			switch (f) {
			case 'R':
			case 'r':
				figura = new Rettangolo(in.readInt("lato1"), in.readInt("lato2"));
				break;
			case 'C':
			case 'c':
				figura = new Cerchio(in.readInt("raggio"));
				break;
			case 'Q':
			case 'q':
				figura = new Quadrato(in.readInt("lato"));
				break;
			default:
				System.out.println("carattere " + f + " non riconosciuto");
				break;
			}
			// stampare i dati della figura appena inserita
			System.err.println("area :"+ figura.getArea());
			figure.add(figura);
		}
		stampaFiguraPiuGrande(figure);
	}

	private static void stampaFiguraPiuGrande(Vector<Figura> figure) {
		Figura max = figure.get(0);
		for(Figura f: figure) {
			if (f.getArea()> max.getArea()) max = f;
		}
		System.out.println(max.getClass().getSimpleName());
		System.out.println(max);
	}

	
	
}
