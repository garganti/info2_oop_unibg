package serietv;

public class Serial {
	private Episode first;
	String title;
	/**
	 * 
	 * @param t titolo della serie
	 * @param e1 il primo episodio della serie
	 */
	public Serial(String t, Episode e1) {
		title = t;
		first = e1;
	}

	@Override
	public String toString() {
		String result = "";
		// aggiungo il titolo
		result += title + "\n";
		int i = 1;
		// aggiungo tutti gli episodi
		Episode current = first;
		do{
			result += "ep " + i++ + " " + current.toString() + "\n"; 
			current = current.getNext();
		}while (current != null);
		return result;
	}

}
