package cap11_egi;

public class BinarySearcher {

	static int cercaint(int[] a, int k) {
		int i = 0, j = a.length - 1, m;
		while (i <= j) {
			System.out.println("cerco tra i:" + i + " j: " + j);
			m = (i + j) / 2;
			if (a[m] == k)
				return m;
			else if (a[m] < k)
				i = m + 1;
			else
				j = m - 1;
		}
		return -1;
	}

	static <E extends Comparable<E>> int cerca(E[] a, E k) {
		int i = 0, j = a.length - 1, m;
		while (i <= j) {
			System.out.println("cerco tra i:" + i + " j: " + j);
			m = (i + j) / 2;
			if (a[m].compareTo(k) == 0)
				return m;
			else if (a[m].compareTo(k) < 0)
				i = m + 1;
			else
				j = m - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numeri = { 1, 3, 7, 9, 10, 50, 100 };
		System.out.println(cercaint(numeri, 60));
		System.out.println(cercaint(numeri, 3));

		String[] nomi = { "anna", "barba", " carlo", "mario", "nadia" };
		System.out.println(cerca(nomi, "piero"));

		Studente[] stduenti = { new Studente(1), new Studente(50) };
		System.out.println(cerca(stduenti, new Studente(5)));
		System.out.println(cerca(stduenti, new Studente(50)));
	}

}

class Studente implements Comparable<Studente>{
	int matricola;

	public Studente(int i) {
		matricola = i;
	}

	@Override
	public int compareTo(Studente o) {
		return matricola -o.matricola;
	}

}