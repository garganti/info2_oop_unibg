package ercizio11_1;

import java.util.StringTokenizer;

public class Episode{
	String titolo;
	String trama;
	Episode prossimo;// null per l'ultimo episodio
	
	public Episode(String s, Episode next){
		StringTokenizer st = new StringTokenizer(s, ";");
		titolo = st.nextToken();
		trama = st.nextToken();
		prossimo = next;
	}
	public Episode(String s){
		StringTokenizer st = new StringTokenizer(s, ";");
		titolo = st.nextToken();
		trama = st.nextToken();
		prossimo = null;
	}
	
	@Override
	public String toString() {
		return "\"" +titolo + "\"" + 
	(prossimo != null ? " prossimo: " + prossimo.titolo : " ultimo finalmente") ;
	}

	public static void main(String[] args) {
		Episode ga2 = new Episode("ga 2;nathan tradisce meredith");
		Episode ga1 = new Episode("grey's anatomy;meredith meets nathan",ga2);
		System.out.println(ga1);
	}	
}
