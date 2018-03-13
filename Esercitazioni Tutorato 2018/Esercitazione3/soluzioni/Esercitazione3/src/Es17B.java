import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;
import prog.utili.Sequenza;

public class Es17B {
	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		ConsoleOutputManager output = new ConsoleOutputManager();
		
		String elencoFigureStringa = input.readLine("Inserire l'elenco delle figure (\"R\",b,h;\"Q\",l;\"C\",r): ");
		Sequenza<Figura> elencoFigure = getElencoFigure(elencoFigureStringa);
		
		for (Figura f: elencoFigure)
			output.println("Figura: " + f.getClass().getSimpleName()+ " " + f.toString() );
		
		printFigure(elencoFigure);
	
	}
	
	static Sequenza<Figura> getElencoFigure(String elenco){
		Sequenza<Figura> elencoFigure = new Sequenza<>();
		StringTokenizer figura = new StringTokenizer(elenco, ";");
		String[] elementi; 
		while (figura.hasMoreTokens()){
			elementi = figura.nextToken().split(",");
			if (elementi[0].equalsIgnoreCase("Q"))
				elencoFigure.add(new Quadrato(Double.parseDouble(elementi[1])));
			else if (elementi[0].equalsIgnoreCase("R"))
				elencoFigure.add(new Rettangolo(Double.parseDouble(elementi[1]),Double.parseDouble(elementi[2])));		
			if (elementi[0].equalsIgnoreCase("C"))
				elencoFigure.add(new Cerchio(Double.parseDouble(elementi[1])));
		}
		return elencoFigure;
	}
	
	static void printFigure(Sequenza<Figura> elencoFigure){
		ConsoleOutputManager output = new ConsoleOutputManager();
		ArrayList<Figura> elenco = new ArrayList<>();
		for (Figura f: elencoFigure)
			elenco.add(f);
		Figura maggiore_Perimetro = elenco.get(0);
		Figura maggiore_Area = elenco.get(0);
		for (int i=1; i<elenco.size(); i++){
			if (elenco.get(i).getArea()>maggiore_Area.getArea())
					maggiore_Area = elenco.get(i);
			if (elenco.get(i).getPerimetro()>maggiore_Perimetro.getPerimetro())
				maggiore_Perimetro = elenco.get(i);
		
		
	}
		output.println("Metodo static: ");
		
		output.println("La figura con area maggiore è: " + maggiore_Area.getClass().getSimpleName() + " " + maggiore_Area.toString() );
		output.println("La figura con perimetro maggiore è: " + maggiore_Perimetro.getClass().getSimpleName() + " " + maggiore_Perimetro.toString() );
	}

}
