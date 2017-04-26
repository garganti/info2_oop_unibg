package ercizio11_1;

// orari della giornata ore e minuti
public class Orario implements Comparable<Orario>{

	// campi
	public int ore;
	private int minuti;

	private static char separatore = ':';

	public static void setSeparatore(char c){
		separatore = c;
	}
	
	public Orario(int ore, int m) {
		minuti = m % 60;
		this.ore = ore + m / 60;
	}

	// stringa in formato hh:mm
	public Orario(String s) {
		String[] data = s.split(":");
		minuti = Integer.parseInt(data[1]);
		ore = Integer.parseInt(data[0]);
	}

	// solo ore = h, minuti = 0
	public Orario(int h) {
		// ore = h;
		// minuti = 0;
		this(h, 0);
	}

	// dopo mezzogiorno?
	boolean isPM() {
		return ore > 12 || (ore == 12 && minuti > 0);
	}

	// quanto manca dall'orario che esegue il metodo
	// fino ad altro
	public int quantoManca(Orario altro) {
		return (altro.ore - this.ore) * 60 + (altro.minuti - this.minuti);
	}

	@Override
	public String toString() {
		//setSeparatore('=');
		return ore + separatore + (minuti < 10 ? "0" : "") + minuti;
	}

	@Override
	public int compareTo(Orario o) {
		return o.ore - this.ore; //TODO da completare
	}

}
