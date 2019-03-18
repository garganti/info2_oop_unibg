package codice_visto_esercitazione19;

import java.util.Vector;

/**
 * 
 */
public class Tavolo {

	String id;
	
	static int nTavoli = 0; 
	// memorizzo tutti gli id usati fino ad ora
	static Vector<String> idUSati = new Vector<>();
	
	Tavolo(){
		this(String.valueOf(nTavoli));
	}
	
	Tavolo(String id){
		nTavoli ++;
		if (idUSati.contains(id)) throw new RuntimeException("l'id è già usato");
		else idUSati.add(id);
	}
	
	
	public static void main(String[] args) {
		Tavolo zero = new Tavolo();
		Tavolo t = new Tavolo("0");// --> voglio eccezione
	}
	
}
