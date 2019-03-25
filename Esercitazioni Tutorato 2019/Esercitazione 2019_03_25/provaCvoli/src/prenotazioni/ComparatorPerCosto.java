package prenotazioni;
import java.util.Comparator;

import prenotazioni.Prenotazione;

public class ComparatorPerCosto implements Comparator<Prenotazione> {

	@Override
	public int compare(Prenotazione o1, Prenotazione o2) {
		return Double.compare(o1.getCosto(),o2.getCosto());
	}


}
