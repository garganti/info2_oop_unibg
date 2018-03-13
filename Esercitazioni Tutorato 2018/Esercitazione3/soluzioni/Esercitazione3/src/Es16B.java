
import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Es16B {

	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		ConsoleOutputManager output = new ConsoleOutputManager();

		boolean answer;
		ArrayList<Rettangolo> elencoFigure = new ArrayList<>();

		do {
			int base = input.readInt("Inserire base rettangolo: ");
			int altezza = input.readInt("Inserire altezza rettangolo: ");
			if (base==altezza)
				elencoFigure.add(new Quadrato(base));
			else
				elencoFigure.add(new Rettangolo(base, altezza));
			answer = input.readSiNo("Inserire una nuova figura?(SI/NO)");
		} while (answer);

		Rettangolo maggioreA = elencoFigure.get(0);
		Rettangolo maggioreP = elencoFigure.get(0);
		for (int i = 1; i < elencoFigure.size(); i++){
			if (elencoFigure.get(i).getArea() > maggioreA.getArea())
				maggioreA = elencoFigure.get(i);
			if (elencoFigure.get(i).getPerimetro() > maggioreA.getPerimetro())
				maggioreA = elencoFigure.get(i);
		}
		output.println("Il rettangolo con area maggiore è: " + maggioreA.toString());
		output.println("Il rettangolo con perimetro maggiore è: " + maggioreP.toString());

	}

}
