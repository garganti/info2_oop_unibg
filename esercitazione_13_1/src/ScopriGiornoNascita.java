import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Data;


public class ScopriGiornoNascita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String dataNS = in.readLine("quando sei nato? g/m/a");
		// assumo che la stringa è GG/MM/AA
		// prendo la prima parte GG (da 0 a indexOf(/))
		String giornoS = dataNS.substring(0, dataNS.indexOf("/"));
		int giorno = Integer.parseInt(giornoS);
		// tolgo il giorno in modo di avere una stringa MM/AA
		dataNS = dataNS.substring(dataNS.indexOf("/")+1);
		// prendo ancora la prima parte MM
		String meseS = dataNS.substring(0, dataNS.indexOf("/"));
		int mese = Integer.parseInt(meseS);
		// per l'anno AA
		String annoS = dataNS.substring(dataNS.indexOf("/")+1);
		int anno = Integer.parseInt(annoS);
		out.println("sei noto il " + giorno + "/" + mese + "/"+ anno);
		Data dn = new Data(giorno,mese,anno);
		out.println("che era un "+ dn.getGiornoDellaSettimana().name());
	}

}
