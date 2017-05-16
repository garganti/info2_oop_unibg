package telecamere;

/** rappresenta una telecamera generica */
public abstract class Telecamera implements Comparable<Telecamera> {
	/** numero identificativo della telecamera */
	int ID;
	String descrizione;
	/** posizione all'interno della strada */
	float posizione;
	/** numero delle telecamere create */
	private static int numeroTelecamere = 0; 
	
	StatoTelecamera stato;
	
	/**
	 * @param d descrizione
	 * @param pos posizione all'interno della strada
	 */
	Telecamera(String d, float pos) throws PosizioneOutOfBoundException {
		descrizione = d;
		if (pos<0 || pos>200) throw new PosizioneOutOfBoundException();
		posizione = pos;
		// assegna un ID crescente alle telecamere
		ID = numeroTelecamere;
		numeroTelecamere++;		
	}
	
	// operazioni, restituiscono true se hanno avuto successo (se hanno modificato lo stato della telecamera)
	
	/** Accensione: implementazione di default (è sempre possibile accendere una telecamera) */
	public boolean accendi() {
		System.out.println("accendi");
		stato = StatoTelecamera.ACCESA;
		return true;
	}
	
	/** Spegnimento: è abstract: il corpo della funzione varia di classe in classe */
	public abstract boolean spegni();
	
	/** Metodo per il blocco immagine.
	 * Se la telecamera è semplice, di questo metodo viene fatto l'overriding in modo da ritornare false
	 * @return se lo stato è stato correttamente cambiato in {@code StatoTelecamera.BLOCCOIMMAGINE}.
	 */
	public boolean bloccoImmagine() {
		System.out.println("blocca");
		stato=StatoTelecamera.BLOCCOIMMAGINE;
		return true;
	}
	
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
		return "ID" + ID + " DESCR " + descrizione + " pos " + posizione + " stato " + stato; 
	}
	public int getID() {
		return ID;
	}
	/** @return se la telecamera non è spenta (può essere in stato accesa o bloccoimmagine) */
	public boolean isAccesa() {
		return stato==null || stato!=StatoTelecamera.SPENTA; // se lo stato è null, assumiamo che sia accesa (di default)
	}
	
}
