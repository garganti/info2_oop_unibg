package te_lug12_15.video;

import te_lug12_15.Utente;

// rappresenta un video generico
public abstract class Video implements Comparable<Video>{
	
	String titolo;
	String regista;
	int anno;
	
	// se null non è imprestato
	protected Utente prestatoA;

	/**
	 * 
	 * @param t titolo
	 * @param r regista
	 * @param y anno di produzione
	 */
	protected Video(String t, String r, int y){
		titolo = t;
		regista = r;
		anno = y;
	}
	
	// presta questo video a u
	public void prestaA(Utente u){
		if (prestatoA != null){
			throw new VideoNonInCasa();
		}
		prestatoA = u;
	}
	
	@Override
	public int compareTo(Video o) {
		return this.anno - o.anno;
	}
	
	@Override
	public String toString() {
		return titolo + " di " + regista + " del " + anno;
	}
	
}
