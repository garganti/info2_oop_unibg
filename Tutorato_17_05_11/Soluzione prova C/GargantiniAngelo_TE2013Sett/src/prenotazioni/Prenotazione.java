package prenotazioni;


import java.util.Random;

import prog.utili.Data;

public abstract class Prenotazione implements Comparable<Prenotazione> {
	//  ID univoco di 6 caratteri e numeri mischiati (tipo EH79HI).
	protected String ID;
	
	private static Random rnd = new Random();


	public Prenotazione() {
		// first two ints
		this.ID = "" + rnd.nextInt(10) + rnd.nextInt(10) + rnd.nextInt(10);
		// next two chars
		this.ID += (char)(rnd.nextInt(26) + 'A') + (char)(rnd.nextInt(26)+ 'A');
		this.ID += ("" + rnd.nextInt(10) + rnd.nextInt(10));
	}

	@Override
	public int compareTo(Prenotazione x) {
		return this.ID.compareTo(x.ID);
	}
	
	public String getID(){return ID;}
	
	public abstract double getCosto();
}
