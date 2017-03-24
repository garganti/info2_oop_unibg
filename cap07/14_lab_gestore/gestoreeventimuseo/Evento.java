package gestoreeventimuseo;

import java.util.List;

import prog.utili.Data;
import prog.utili.Sequenza;

/***
 * singolo evento del museo
 */
public class Evento implements Comparable<Evento>{
	Data inizio;
	Data fine;
	String nome;
	// le sale occupate dall'evento 
	Sequenza<Sala> sale;

	/**
	 * 
	 * @param nome
	 * @param inizio
	 * @param fine
	 * @param sale
	 */
	Evento(String nome, Data inizio, Data fine, Sequenza<Sala> sale) {
		this.nome = nome;
		this.inizio = inizio;
		this.fine = fine;
		this.sale = sale;
	}

	@Override
	public String toString() {
		return nome + " dal " + inizio + " al " + fine + " in "
				+ sale.toString();
	}

	@Override
	public int compareTo(Evento o) {
		return this.inizio.compareTo(o.inizio);
	}

	/** se l'evento accade (anche parzialmente) in queste date*/
	public boolean accadeInDate(Data inizioData, Data fineData) {
		// se finisce prima allora non accade
		if (fine.isMinore(inizioData)) return false;
		// se inizia dopo della data di fine, allora non accade
		if (inizio.isMaggiore(fineData)) return false;
		// altrimenti accade in questa data
		return true;
	}

}
