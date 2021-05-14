package main;

import dati.Paziente;
import dati.RefertoMultiplo;
import dati.RefertoSingolo;
import dati.RisultatoReferto;
import eccezioni.IdUsatoException;
import gestore.GestoreReferti;
import prog.utili.Data;

public class ProvaApplicativo {

	public static void main(String[] args) {
		// pazienti
		Paziente p1 = new Paziente("giovanni rossi");
		System.out.println(p1);
		Paziente p2 = new Paziente("matteo ferrari");
		System.out.println(p2);
		// provo il controllo di id usati due volte
		Paziente p3 = new Paziente("matteo ferraris",5);
		try{
			Paziente p4 = new Paziente("matteo verdi",5);
		} catch (IdUsatoException e) {
			System.out.println("ho due pazienti con id uguale");
		}
		Data  oggi = new Data();
		// referti
		
		RefertoSingolo rs = new RefertoSingolo(oggi, p3, "tutto ok", RisultatoReferto.POSITIVO);
		System.out.println(rs);
		// referto multiplo
		RefertoMultiplo rm = new RefertoMultiplo(oggi, p2);
		System.out.println(rm);
		rm.addRisultato("ferro", 15);
		rm.addRisultato("magnesio", 1000);
		System.out.println("criticità " + rm.criticity());
	
		// provo adesso il gestore
		GestoreReferti gr = new GestoreReferti();
		// leggiamo da file
		gr.leggiDaDile();
		
		// inserisci altri referti
		
		gr.inserisciReferto(rs);
		gr.inserisciReferto(rm);
		gr.stampaPerData();
		// stampo per paziente
		gr.stampaGruppoPaziente();
		
		// rimuovo il referto rs (id pziente è 5)
		gr.cancella(5);
		gr.stampaPerData();
	}

}
