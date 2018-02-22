package voli;

import prenotazioni.Prenotazione;
import prog.utili.Data;
import prog.utili.SequenzaOrdinata;
/** reppresenta un volo
 *
 */
public class Volo implements Comparable<Volo> {
	String origine, destinazione;
	Data dataPartenza;
	final int IDvolo, nMax;
	
	SequenzaOrdinata<Prenotazione> prenotazioni;

	private static int contatoreVoli = 0;

	public Volo(String o, String de, Data da, int n) {
		this(o,de,da,n,++contatoreVoli);
	}
	
	public Volo(String o, String de, Data da, int n, int ID) {
		this.IDvolo = ID;
		// controlla origine
		if (o.length() != 3) throw new AeroportoNonCorrettoException();
		this.origine = o;
		// controlla destinazione
		if (de.length() != 3) throw new AeroportoNonCorrettoException();
		this.destinazione = de;		
		this.dataPartenza = da;
		this.nMax = n;
		this.prenotazioni = new SequenzaOrdinata<Prenotazione>();
		
	}

	public String toString() {
		String s = "";
		s ="\n"+ IDvolo+" origine: " + origine + " destinazione: " + destinazione
				+ " data partenza: " + dataPartenza;
		return s;
	}

	public void inserisciPrenotazione(Prenotazione p) {
		this.prenotazioni.add(p);
	}

	@Override
	public int compareTo(Volo x) {
		return this.IDvolo - x.IDvolo;
	}

	public int getID() {
		return IDvolo;
	}
	public String getDestinazione(){
		return destinazione;
	}

	public String getOrigine(){
		return origine;
	}

	public boolean pieno(){
		return (prenotazioni.size()>=nMax);
	}

	public SequenzaOrdinata<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

}
