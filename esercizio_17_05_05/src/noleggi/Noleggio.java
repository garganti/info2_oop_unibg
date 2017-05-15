package noleggi;

import java.util.Random;

import auto.Auto;
import javafx.scene.control.Tab;
import prog.utili.Data;

/** singolo noleggio 
 * ordinabile rispetto la data di inizio
 * */
public abstract class Noleggio implements Comparable<Noleggio>{

	Auto auto;
	Data inizio, fine;
	String ID; // 10 cifre causali
	
	public Noleggio(Auto a, Data inizio, Data fine) throws NoleggioNonvalido {
		auto= a;
		this.inizio = inizio;
		this.fine = fine;
		// controllo la data di inizio che sia nel futuro
		Data oggi = new Data();
		if (oggi.quantoManca(inizio) < 0){
			throw new NoleggioNonvalido("inizio nel passato");
		}
		// calcolo dell'ID
		ID = "";
		for(int i = 0; i < 10; i++){
			ID+= (int)(Math.random()*10);
		}
		
	}
	/**
	 * 
	 * @param a auto noleggiata
	 * @param inizio del noleggio
	 * @param ngiorni durata in giorni
	 * @throws NoleggioNonvalido 
	 */
	public Noleggio(Auto a, Data inizio, int ngiorni) throws NoleggioNonvalido {
		this(a,inizio, dopo(inizio,ngiorni));
	}
	/**
	 * 
	 * @param d
	 * @param ngiorni
	 * @return una data dopo ngiorni di d
	 */
	private static Data dopo(Data d, int ngiorni) {
		// TODO
		return null;
	}
	
	/// dice se il noleggio è valido
	abstract boolean valido();

	/// calcolo del costo
	abstract int costo();

	/// dice se l'auto è valida
	abstract boolean autovalida();
	
	@Override
	public String toString() {
		return  ID + " auto : " + auto + " dal " + inizio + " al "+ fine;
	}
	
	@Override
	public int compareTo(Noleggio o) {
		return this.inizio.compareTo(o.inizio);
	}
}
