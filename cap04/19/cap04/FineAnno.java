package cap04;

import prog.utili.Data;
import prog.utili.MeseDellAnno;
import static prog.utili.MeseDellAnno.*;

public class FineAnno {
	
	/**
	 * @author garganti 
	 * 
	 *  èfkf.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// oggi
		Data oggi = new Data();
		MeseDellAnno a = GENNAIO;
		// mese corrente
		MeseDellAnno meseCorrente = oggi.getMeseDellAnno();
		int mesichemanc = 0;
		switch (meseCorrente) {
		case GENNAIO:
			mesichemanc++;
		case FEBBRAIO:
			mesichemanc++;
		case MARZO:
			mesichemanc++;
		case APRILE:
			mesichemanc++;
		default:
			mesichemanc+=7;
		}
		System.out.println(mesichemanc);
	}

}
