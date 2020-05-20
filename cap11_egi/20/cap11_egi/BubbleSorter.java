package cap11_egi;

interface Sorter<E extends Comparable<E>> {
	void sort(E[] e);
}

public class BubbleSorter<E extends Comparable<E>> implements Sorter<E> {
	@Override
	public void sort(E[] e) {
		boolean ordinato = true;
		do {
			ordinato = true;
			for(int i= 0; i < e.length-1; i++) {
				if (e[i].compareTo(e[i+1])>0) {
					// scambio
					E temp = e[i];
					e[i] = e[i+1];
					e[i+1] = temp;
					ordinato = false;
				}
			}
		}while(!ordinato);				
	}
}
