package voli;

import java.util.ArrayList;
import java.util.List;

import eccezioni.ExistIDException;
import eccezioni.PrenotazioneEsistenteException;
import prenotazioni.Prenotazione;
import prog.utili.Data;
import prog.utili.SequenzaOrdinata;

/**
 * reppresenta un volo
 *
 */
public class Volo implements Comparable<Volo> {
	private String origine, destinazione;
	Data dataPartenza;
	final int IDvolo, nMax;

	SequenzaOrdinata<Prenotazione> prenotazioni;

	private static List<Integer> IDusati = new ArrayList<>();

	private static int contatoreVoli = 0;

	/**
	 * 
	 * @param o  origine
	 * @param de destinazione
	 * @param da data del volo
	 * @param n  numero di passeggeri
	 * @throws ExistIDException
	 */
	public Volo(String o, String de, Data da, int n) throws ExistIDException {
		this(o, de, da, n, ++contatoreVoli);
	}

	/**
	 * 
	 * @param o
	 * @param de
	 * @param da
	 * @param n
	 * @param ID id del volo
	 * @throws ExistIDException
	 */
	public Volo(String o, String de, Data da, int n, int ID) throws ExistIDException {
		boolean existID = checkID(ID);
		if (!existID) {
			this.IDvolo = ID;
			// controlla origine
			if (o.length() != 3)
				throw new AeroportoNonCorrettoException("Aeroporto origine non corretto");
			this.origine = o;
			// controlla destinazione
			if (de.length() != 3)
				throw new AeroportoNonCorrettoException("Aeroporto destinazione non corretto");
			this.destinazione = de;
			this.dataPartenza = da;
			this.nMax = n;
			this.prenotazioni = new SequenzaOrdinata<Prenotazione>();
			IDusati.add(ID);

		} else {
			throw new ExistIDException("ID già inserito");
		}
	}

	// Controllo che l'ID inserito non esista
	private boolean checkID(int iD) {
		for (int id : IDusati)
			if (iD == id)
				return true;
		return false;
	}

	public String toString() {
		String s = "";
		s = "\n" + IDvolo + " origine: " + origine + " destinazione: " + destinazione + " data partenza: "
				+ dataPartenza;
		return s;
	}

	public void inserisciPrenotazione(Prenotazione p) throws PrenotazioneEsistenteException {
		if (!checkIDPren(p))
			this.prenotazioni.add(p);
		else
			throw new PrenotazioneEsistenteException("Prenotazione già inserita, ID duplicato");
	}

	private boolean checkIDPren(Prenotazione p) {
		for (Prenotazione currentp : prenotazioni)
			if (currentp.getID().equalsIgnoreCase(p.getID()))
				return true;
		return false;
	}

	@Override
	public int compareTo(Volo x) {
		return this.IDvolo - x.IDvolo;
	}

	public int getID() {
		return IDvolo;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public String getOrigine() {
		return origine;
	}

	public boolean pieno() {
		return (prenotazioni.size() >= nMax);
	}

	public SequenzaOrdinata<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

}
