package te_gestoreeventi;

import prog.utili.Data;
import prog.utili.Sequenza;

public class Evento implements Comparable<Evento>{

	private String nome;
	private Data inizio, fine;
	private Sequenza<Sala> sale;
	
	public Evento(){
		
	}
	
	// ordina rispetto la data di inizio
	@Override
	public int compareTo(Evento o) {
		return inizio.compareTo(o.fine);
	}
	
	
}
