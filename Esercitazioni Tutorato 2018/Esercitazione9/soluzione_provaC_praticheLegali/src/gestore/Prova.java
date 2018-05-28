package gestore;

import pratiche.GradoGidizio;
import pratiche.PraticaCivile;
import pratiche.PraticaPenale;
import prog.utili.Data;

public class Prova {

	public static void main(String[] args) {
		GestorePratiche gp = new GestorePratiche();
		PraticaCivile pc = new PraticaCivile("angelo", "", new Data(10, 5, 2016), 100, GradoGidizio.PRIMO);	// TODO Auto-generated method stub
		PraticaPenale pp = new PraticaPenale("angelo", "", new Data(20, 5, 2016), 10, GradoGidizio.PRIMO);	// TODO Auto-generated method stub
		gp.insert(pc);
		gp.insert(pp);
		System.out.println(pc.priorita());
		System.out.println(pp.priorita());
		// provo a stampare
		gp.stampa();
	}

}
