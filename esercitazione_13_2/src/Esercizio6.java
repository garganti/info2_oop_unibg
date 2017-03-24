import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import prog.utili.Frazione;
import prog.utili.SequenzaOrdinata;

/** Scrivi un metodo statico che data una sequenza di numeri 
 * in una stringa separati da ; calcola la somma, la media,  
 * la mediana e la varianza.
 * */
public class Esercizio6 {

	static void elaboraSequenza(String fs){
		ArrayList<Double> numeri = new ArrayList<>();
		for(String n: fs.split(";")){
			double num = Double.parseDouble(n);
			numeri.add(num);
		}
		// stampa 
		System.out.println(numeri);
		// calcolo della somma e media
		Double somma = 0.0;
		for(Double d: numeri){
			somma += d;
		}
		System.out.println("somma "+ somma);
		System.out.println("media "+ somma/numeri.size());
		// x la mediana, ordina
		Collections.sort(numeri);
		// prendi l'elemento i mezzo
		System.out.println("mediana " + numeri.get(numeri.size()/2));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		elaboraSequenza("1.2;3;7;5.6");
		elaboraSequenza("0;1;2");
	}

}
