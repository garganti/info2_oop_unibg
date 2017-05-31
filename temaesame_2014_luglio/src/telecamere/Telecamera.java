package telecamere;

// rappresenta una telecamera generica
public abstract class Telecamera implements Comparable<Telecamera>{
	// numero identificativo della telecamera
	int ID;
	String descrizione;
	// posizione all'interno della strada
	float posizione;
	// numero delle telecamere create
	private static int numeroTelecamere = 0; 
	/**
	 * 
	 * @param d descrizione
	 * @param pos posizione all'interno della strada
	 */
	Telecamera(String d, float pos){
		descrizione = d;
		posizione = pos;
		// assegna un ID crescente alle telecamere
		ID = numeroTelecamere;
		numeroTelecamere++;		
	}
	// operazioni
	public abstract void accendi();
	public abstract void spegni();
	public abstract void bloccoImmagine();
	
	@Override
	public int compareTo(Telecamera t2) {
		if (this.posizione > t2.posizione)
			return 1;
		else if (this.posizione <t2.posizione)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "ID" + ID + " DESCR " + descrizione + " pos " + posizione; 
	}
	public int getID() {
		return ID;
	}
	public boolean isAccesa() {
		return true;
	}
	
}
