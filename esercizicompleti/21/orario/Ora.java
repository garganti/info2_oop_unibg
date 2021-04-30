package orario;

public abstract class Ora implements Comparable<Ora> {
	/** @return l'ora da 0 a 23*/
	public abstract int getHH();
	/** @return i minuti da 0 a 59*/
	public abstract int getMM();
	
	@Override
	public int compareTo(Ora o) {
		int deltaHH = this.getHH() - o.getHH();
		//if (deltaHH != 0) return deltaHH;
		// stessa ora, guardo i minuti
		// return this.getMM() - o.getMM();
		// con una istruzione sola
		return deltaHH == 0? (this.getMM() - o.getMM()) :deltaHH; 
		// oppure calcolando i minuti dall'ora 00:00
		// return this.getHH()* 60 + this.getMM() - o.getHH()* 60 - o.getMM();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ora) {
			Ora ora = (Ora) obj;
			return this.getHH() == ora.getHH() && this.getMM() == ora.getMM();
		}
		return false;
	}
}
