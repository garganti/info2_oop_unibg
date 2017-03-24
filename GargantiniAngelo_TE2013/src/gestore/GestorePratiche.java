package gestore;

import pratiche.PraticaLegale;
import prog.utili.SequenzaOrdinata;

//  sistema per la gestione delle pratiche di uno 
// studio legale. 
public class GestorePratiche {
	
	// in ordine di priorità
	SequenzaOrdinata<PraticaLegale> pratiche;
	
	GestorePratiche(){
		pratiche = new SequenzaOrdinata<PraticaLegale>();
	}
	
	//1. Inserimento di una pratica
	void insert(PraticaLegale pl){
		pratiche.add(pl);
	}
	//2. Stampa delle pratiche in ordine di priorità
	void stampa(){
		for(PraticaLegale p: pratiche){
			System.out.println(p);
		}
	}
	//3. Stampa delle pratiche in ordine di costo.
	void stampaInOrdinediCOsto(){
		// utilizzo un array temporaneo
		// lo ordino con bubble sort ustilzzando il costo (crescente)
	}
	//4. Stampa delle pratiche archiviate  in ordine di costo.
	//5. Caricamento da file (non preoccuparti del salvataggio) delle pratiche.

}
