package ospedale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ospedale {
	
	public static void main(String[] args) {
		List<Reparto> listaReparti = new ArrayList<>();
		Reparto r = new Reparto("provarep", "descrep");
		listaReparti.add(r);
		
		listaReparti.get(0).aggiungiLetto();
		listaReparti.get(0).aggiungiLetto();
		listaReparti.get(0).aggiungiLetto();
		listaReparti.get(0).aggiungiLetto();
		listaReparti.get(0).aggiungiLetto();
		listaReparti.get(0).aggiungiLetto();
		
		Paziente p1 = new Paziente("aa", "aa", "CF aa", new Date(), 'F');
		Paziente p2 = new Paziente("aa", "aa", "CF bb", new Date(), 'F');
		Paziente p3 = new Paziente("aa", "aa", "CF cc", new Date(), 'M');
		Paziente p4 = new Paziente("aa", "aa", "CF dd", new Date(), 'M');
		Paziente p5 = new Paziente("aa", "aa", "CF ee", new Date(), 'F');
		
		p1.aggiungiMedicina(new Medicina("m1"));
		p1.aggiungiMedicina(new Medicina("m2"));
		p2.aggiungiMedicina(new Medicina("m55"));
		p3.aggiungiMedicina(new Medicina("m3"));
		p3.aggiungiMedicina(new Medicina("m6"));
		p4.aggiungiMedicina(new Medicina("m4"));
		p5.aggiungiMedicina(new Medicina("m4"));
		p5.aggiungiMedicina(new Medicina("m5"));
		
		listaReparti.get(0).aggiungiPaziente(p1);
		listaReparti.get(0).aggiungiPaziente(p2);
		listaReparti.get(0).aggiungiPaziente(p3);
		listaReparti.get(0).aggiungiPaziente(p4);
		listaReparti.get(0).aggiungiPaziente(p5);
		
		
		listaReparti.get(0).stampaPazienti();
		

		listaReparti.get(0).rimuoviPaziente(p3);
		

		listaReparti.get(0).stampaPazienti();
		
	}

}
