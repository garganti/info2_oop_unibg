package gestoreeventimuseo;

import javax.print.attribute.standard.Finishings;

import prog.utili.Data;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

/** gestisce gli eventi del museo
 */
public class GestoreEventiMuseo {
	
	private String nomeMuseo;
	
	private SequenzaOrdinata<Evento> eventi;
	// le sale del museo
	private Sequenza<Sala> sale;
	
	public GestoreEventiMuseo(String n) {
		nomeMuseo = n;
		eventi = new SequenzaOrdinata<>();
		sale = new Sequenza<>();
	}
	/**
	 * 
	 * @param nome
	 * @param inizio
	 * @param fine
	 * @param sale
	 */
	public void insertEvento(String nome, String inizio, String fine, String sale) {
		Data inizioData = new Data(inizio);
		Data oggi = new Data();
		// controlla data di inizio
		if (inizioData.isMinore(oggi)){
			System.err.println("l'evento è nel passato non verrà inserito");
			return;
		}
		// controlla data di fine
		Data fineData = new Data(fine);
		if (inizioData.isMaggiore(fineData)){
			System.err.println("l'evento ha date sbagliate");
			return;
		}
		// controlla sale
		String[] saleArray = sale.split(",");
		Sequenza<Sala> saleEvento = new Sequenza<>();
		for(String s: saleArray){
			Sala ss = cercaSala(s);
			saleEvento.add(ss);
			for(Evento e: eventi){
				if (e.accadeInDate(inizioData, fineData)&&
				   e.sale.contains(ss)){
					System.err.println("l'evento usa la sala " + s + " già usata da " + e );
					return;
				}
			}
		}
		// altrimenti inserisci l'evento
		eventi.add(new Evento(nome, inizioData, fineData, saleEvento));
	}
	// cerca la sala, se non esiste l'agiunge
	private Sala cercaSala(String s) {
		for(Sala ss: sale){
			if (ss.nome.equals(s)) return ss;
		}
		// la sala non è stata ancora creata, aggiungila
		Sala ns = new Sala(s);
		sale.add(ns);
		return ns;
	}
	public void stampaEventi() {
		for(Evento e: eventi){
			System.out.println(e);
		}
	}

}
