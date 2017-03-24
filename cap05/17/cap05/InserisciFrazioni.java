package cap05;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

// domanda all'utente quante frazioni inserire
// domanda i dati all'utente 
// stampa il contenuto dell'array
// calcola la somma
public class InserisciFrazioni {
public static void main(String[] args) {
	ConsoleInputManager in = new ConsoleInputManager();
	ConsoleOutputManager out = new ConsoleOutputManager();
	//
	int nf = in.readInt("quante frazioni vuoi insierire?");
	
	Frazione[] frazioni = new Frazione[nf];
	// domando le nf frazioni
	for(int i = 0 ; i < frazioni.length; i++){
		out.println("inserisci la frazione " + i + "-esima");
		int n= in.readInt("numeratore?");
		int d= in.readInt("denominatore?");
		frazioni[i] = new  Frazione(n,d);
	}
	// stamp le frazioni
	for(Frazione f: frazioni){
		out.println(f);
	}
	// calcolo della somma
	Frazione somma = new Frazione(0);
	for(Frazione f: frazioni){
		somma = somma.piu(f);		
	}
	out.println("la somma è " + somma);
	
	
}
	
}
