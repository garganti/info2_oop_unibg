package cap10;

import java.util.Random;

// prenotazione base -> costo è 10 euro per persona
class Prenotazione {	
	private static final int COSTO_PER_PERSONA = 10;
	int costo(int numeroPersone) {
		return numeroPersone * COSTO_PER_PERSONA;
	}
}
// prenotazione di gruppo
// costo è 20 euro + 1euro per persona
class PrenotazionediGruppo extends Prenotazione {	
	private static final int VENTI = 20, UNO = 1;
	int costo(int numeroPersone) {
		return VENTI + numeroPersone * UNO;
	}
}

public class EsempioOverride {
	
	static final Random rnd = new Random();
	
	public static void main(String[] args) {
		Prenotazione p;
		// estraggo un numero a caso di partecipati se
		// > 7 faccio prenoatzone dri gruppo
		int numeroPersone = rnd.nextInt(20);
		System.out.println("persone " + numeroPersone);
		if (numeroPersone> 7) {
			p = new PrenotazionediGruppo();
		} else {
			p = new Prenotazione();
		}
		System.out.println("costo "+ p.costo(numeroPersone));
	}

}
