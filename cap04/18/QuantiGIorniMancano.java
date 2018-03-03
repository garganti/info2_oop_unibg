

import prog.utili.Data;
import prog.utili.MeseDellAnno;

/** quanti giorni mancano all'ultimo giorno del mese corrente???*/
public class QuantiGIorniMancano {

	public static void main(String[] args) {
		Data oggi = new Data();
		System.out.println("oggi è " + oggi);
		
		int giorno = oggi.getGiorno();
		/// NON va bene
		//System.out.println(31-giorno);
		MeseDellAnno mese = oggi.getMeseDellAnno();
		switch (mese) {
		case FEBBRAIO:
			System.out.println(28-giorno);
			break;
		case MARZO:
		case MAGGIO:
			System.out.println(31-giorno);
			break;
		default:
			System.out.println(30-giorno);
		}
	}
	
}
