
import java.util.ArrayList;

public class ProvaAutomobili {

	public static void main(String[] args) {
		ArrayList<Automobile> auto = new ArrayList<>();
		auto.add(new Automobile("FT908YH", 0));
		auto.add(new Automobile("BG9099", 100000000));
		auto.add(new Automobile("AC908NE", 100000));
		System.out.println(auto);

		// ordino auto con bubble sort !

		System.out.println(auto);
	}
	/**
	 * ordina le auto usando il bubble sort
	 * 
	 * @param auto la lista di auto da ordinare
	 */
	static private void ordinaAuto(ArrayList<Automobile> auto) {
		boolean ordinato = true;
		do {
			ordinato = true;
			for (int i = 0; i < auto.size() - 1; i++) {
				// confronto
				if (auto.get(i).compareTo(auto.get(i + 1)) > 0) {
					// scambio
					Automobile temp = auto.get(i);
					auto.set(i, auto.get(i + 1));
					auto.set(i + 1, temp);
					ordinato = false;
				}
			}
		} while (!ordinato);

	}
}
