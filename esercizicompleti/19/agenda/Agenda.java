package agenda;

import java.util.Vector;

import dati.Appuntamento;

public class Agenda {
	
	Vector<Appuntamento> appuntamenti = new Vector<>();
	
	public void add(Appuntamento a) {
		appuntamenti.add(a);
		// TODO da ordinare
	}
	
	public void visualizza() {
		System.out.println("APPUNTAMENTI:");
		for(Appuntamento a: appuntamenti) {
			System.out.println(a);
		}
	}

}
