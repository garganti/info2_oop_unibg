

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Data;
import prog.utili.GiornoDellaSettimana;
import prog.utili.MeseDellAnno;

// domandiamo una data all'utente (usiamo classe data)
// (giorno mese e anno)
// stampiamo: il mese come enumertivo, il giorno della settimana
// come enumerativo
// calcoliamo i giorni fino alla fine dell'anno usando
// lo swicth con enumerativo
public class UsoEnumerativi {

	// quanti giorni mancano dal primo di mese m alla fine dell'anno (non bisestile)
	public static int giorniFineAnno(MeseDellAnno m){
		/*switch (m) {
		case GENNAIO:
			return 365;
		case FEBBRAIO:
		default:
			break;
		}*/
		int quantiG = 0;
		switch (m) {
		case GENNAIO:
			quantiG += MeseDellAnno.GENNAIO.numeroGiorni();
		case FEBBRAIO:
			quantiG += MeseDellAnno.FEBBRAIO.numeroGiorni();
		case MARZO:
			quantiG += MeseDellAnno.MARZO.numeroGiorni();
			// TO BE COMPLETED
		default:
			break;
		}
		return quantiG;
	}
	
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		int g = in.readInt("giorno?");
		int m = in.readInt("mese?");
		int a = in.readInt("anno?");
		// costruiamo la data
		Data data = new Data(g, m, a);
		// il mese
		MeseDellAnno mese = data.getMeseDellAnno();
		// ERRORE MeseDellAnno astri = new MeseDellAnno("astri");
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println("mese " + mese.name());
		// il giorno della settimana
		GiornoDellaSettimana gsett = data.getGiornoDellaSettimana();
		out.println("giorno " + gsett.name());
		// calcolo dei giorni che mancano alla fine anno
		int giorniFineAnno = giorniFineAnno(mese);
		// tolgo i giorni di questo mese
		giorniFineAnno -= g;
		out.println("mancano " + giorniFineAnno + " alla fine dell'anno");
	}
	
}
