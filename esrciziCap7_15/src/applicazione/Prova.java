package applicazione;

import applicazione.data.Azienda;
import applicazione.data.Contratto;
import applicazione.data.Persona;
import prog.utili.Data;

public class Prova {

	public static void main(String[] args) {

		Azienda fiat = new Azienda("FIAT", 1899);
		Azienda fca = new Azienda("FCA");
		// fca.nome = "OPEL";
		//fca.annoFondazione = 1600; 

		Contratto truffa;
		truffa = new Contratto(fiat, fca, new Data(1, 1, 2014));

		Contratto legale;
		legale = new Contratto(fca, fiat);

		// prove
		System.out.println(fiat.toString());
		System.out.println(" fondata da " + fiat.daQuantiAnni() + " anni");

		System.out.println(fca.toString());
		// stampo contratti
		System.out.println(truffa);
		
		truffa.setMediatore(new Persona("angelo"));
		System.out.println(truffa);
		
		// provo gestore
		GestoreContratti gc = new GestoreContratti();
		gc.add(truffa);
		gc.add(legale);
		gc.print();

	}

}
