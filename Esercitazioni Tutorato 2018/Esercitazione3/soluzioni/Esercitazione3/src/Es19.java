import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.io.FileInputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

public class Es19 {
	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		ConsoleOutputManager output = new ConsoleOutputManager();
		
		ArrayList<Figura> f = new ArrayList<>();
		String nomeFile = input.readLine("Nome del file da esaminare?");
		//verifica l’esistenza del file 
		if (FileInputManager.exists(nomeFile)) {
		  FileInputManager ingresso = new FileInputManager(nomeFile);	
		  String riga;
		  while ((riga = ingresso.readLine()) != null){
		       f.add(getElencoFigure(riga));
		  }
		  //chiusura del file 
		  ingresso.close() ;
		} else {
		  System.out.println("Il file non esiste");
		}

		
		for (Figura fig: f)
			output.println("Figura: " + fig.getClass().getSimpleName()+ " " + fig.toString() );
		
		printFigure(f);
	
	}
	
	static Figura getElencoFigure(String elenco){
		String[] elementi = elenco.split(";");
			if (elementi[0].equalsIgnoreCase("Q"))
				return(new Quadrato(Double.parseDouble(elementi[1])));
			else if (elementi[0].equalsIgnoreCase("R"))
				return(new Rettangolo(Double.parseDouble(elementi[1]),Double.parseDouble(elementi[2])));		
			if (elementi[0].equalsIgnoreCase("C"))
				return(new Cerchio(Double.parseDouble(elementi[1])));
		return null;
	}
	
	static void printFigure(ArrayList<Figura> elencoFigure){
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
