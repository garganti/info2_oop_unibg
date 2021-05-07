package temaesameC_26_11_11;

import java.util.Iterator;

import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

public abstract class CD implements Comparable<CD>{
	
	// id che ho usato
	static SequenzaOrdinata<Integer> idUsati = new SequenzaOrdinata<Integer>();
	
	// mi dice se l'id è stato già usato
	static boolean idGiaUsato(int id){
		return idUsati.contains(id);
	}
	
	static int getLastIDUsato(){
		Iterator<Integer> i = idUsati.iterator();
		int t = 0;
		while(i.hasNext()) 
			t = i.next();
		return t;
	}
	
	
	int id;
	
	CD(){
		// prendo l'ultimo elemento di quelli usati
		// e sommo uno
		id = getLastIDUsato() +1;
	}
	
	CD(int id){
		if (idGiaUsato(id))
			throw new RuntimeException("id già usato");
		this.id = id;
	}
}

class CDDati extends CD{
	String descrizione;
	long bytes;
	/**
	 * 
	 * @param d descrizione
	 * @param b lunghezza dati in bytes
	 */
	public CDDati(String d, long b) {
		if (d == null || b <= 0){
			throw new CDNonValidoException();
		}
		descrizione = d;
		bytes = b;
	}
	@Override
	public int compareTo(CD o) {
		// dati sempre < di musica
		if (o instanceof Musica)
			return -1;
		// tra dati usa id
		return this.id - o.id;
	}
	
}

class Musica extends CD{
	String autore;
	String titolo;
	@Override
	public int compareTo(CD o) {
		// if dati sempre >
		if (o instanceof CDDati) return 1;
		// else musica
		Musica m = (Musica) o;
		// confronta genere e autore
		// TODO
		return 0;
	}
	
}