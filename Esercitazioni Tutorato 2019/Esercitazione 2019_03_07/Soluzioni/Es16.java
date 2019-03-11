
import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Rettangolo;

public class Es16 {

	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		ConsoleOutputManager output = new ConsoleOutputManager();

		boolean answer;
		ArrayList<Rettangolo> elencoFigure = new ArrayList<>();

		do {
			int base = input.readInt("Inserire base rettangolo: ");
			elencoFigure.add(new Rettangolo(base, input.readInt("Inserire altezza rettangolo: ")));
			answer = input.readSiNo("Inserire una nuova figura?(SI/NO)");
		} while (answer);

		Rettangolo maggiore = elencoFigure.get(0);
		for (int i = 1; i < elencoFigure.size(); i++){
			if (elencoFigure.get(i).getArea() > maggiore.getArea())
				maggiore = elencoFigure.get(i);
		}
		output.println("Il rettangolo con area maggiore è: " + maggiore.toString());
	}

}
