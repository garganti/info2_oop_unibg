package cap05;

import prog.utili.Sequenza;

// creo una sequenza di stringhe
public class ProvaSequenza {

	public static void main(String[] args) {
		// crea
		Sequenza<String> nomi = new Sequenza<String>();
		// inserire
		nomi.add("pippo");
		nomi.add("paperino");
		
		//
		Sequenza<Integer> numeri = new Sequenza<>();
		numeri.add(1);
		numeri.add(1000);
	}
}
