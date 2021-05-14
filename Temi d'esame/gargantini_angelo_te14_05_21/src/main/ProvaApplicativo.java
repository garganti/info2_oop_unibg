package main;

import dati.Paziente;
import eccezioni.IdUsatoException;

public class ProvaApplicativo {

	public static void main(String[] args) {
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
		
	}

}
