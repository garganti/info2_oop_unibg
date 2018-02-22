package main;

import auto.Auto;
import auto.AutoCompatta;
import gestorenoleggi.GestoreNoleggi;
import noleggi.Noleggio;
import noleggi.NoleggioGiornaliero;
import noleggi.NoleggioNonvalido;
import prog.utili.Data;

public class ProvaGestoreNoleggi {
	
	public static void main(String[] args) throws NoleggioNonvalido {
		// creo qualche auto
		Auto a = new AutoCompatta("AB789OP",new Data(4,5,2007));
		// creo un noleggio
		Data oggi = new Data();
		Data domani = new Data(6,5,2017);
		Noleggio n = new NoleggioGiornaliero(a, oggi, domani);
		System.out.println(n);
		Noleggio n2 = new NoleggioGiornaliero(a, oggi, new Data(3,8,2017));
		//
		//
		GestoreNoleggi ge = new GestoreNoleggi();
		ge.insert(n);
		ge.insert(n2);
		ge.stampa();
		
	}

}
