package gestorenoleggi;

import java.util.ArrayList;
import java.util.List;

import auto.Auto;
import noleggi.Noleggio;
import prog.utili.SequenzaOrdinata;

/** che gestisce tutti i noleggi della mia filiale*/
public class GestoreNoleggi {

	private SequenzaOrdinata<Noleggio> noleggi;
	private List<Auto> auto;
	
	public GestoreNoleggi() {
		noleggi = new SequenzaOrdinata<>();
		auto = new ArrayList<>();
	}
	/**
	 *  inserisce un noleggio
	 * @param n
	 */
	public void insert(Noleggio n){
		noleggi.add(n);
	}
	
	
	/**
	 * metodo che stampa tutti i noleggi in ordine di data di inizio
	 * */
	public void stampa(){
		System.out.println("SITUAZIONE DEI NOLEGGI");
		for(Noleggio n: noleggi){
			System.out.println(n);
		}
	}
}
