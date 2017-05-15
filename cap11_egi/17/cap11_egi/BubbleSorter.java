package cap11_egi;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSorter {
	/** ordina l'array usando il bubble sort */
	/*void sort(int[] a) {
		boolean scambiato;
		do {
			System.out.println("do start" +Arrays.toString(a));
			scambiato = false;
			for(int i= 1; i < a.length; i++){
				if (a[i-1]> a[i]){
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					scambiato = true;
					System.out.println("scambio" +Arrays.toString(a));
				}
			}
		} while (scambiato);
	}

	void sortAG(int[] a) {
		for(;;){
			boolean ordinato = true;
			for(int i= 1; i < a.length; i++){
				if (a[i-1]> a[i]){
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					ordinato = false;
				}
			}
			if (ordinato) break;
		} 
	}
	// NO BUBBLE SORT è inefficiente: 
	// anche se passo un array ordinato, faccio due for comunque
	void sortInefficiente(int[] a) {
		for(int j = 0; j< a.length-1;j ++){
			for(int i= 1; i < a.length - j; i++){
				if (a[i-1]> a[i]){
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
				}
			}
		} 
	}

	
	void sort(String[] a){
		boolean scambiato;
		do{
			scambiato = false;
			for(int i = 1; i < a.length; i++){
				if (a[i-1].compareTo(a[i]) > 0){
					String temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					scambiato = true;
				}
			}
		}while(scambiato);		
	}*/

	<T extends Comparable<T>> void sort(T[] a){
		boolean scambiato;
		do{
			scambiato = false;
			for(int i = 1; i < a.length; i++){
				if (a[i-1].compareTo(a[i]) > 0){
					T temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					scambiato = true;
				}
			}
		}while(scambiato);		
	}
	
	public static void main(String[] args) {
		Integer x[] = {7,2,5,9,1,1};
		new BubbleSorter().sort(x);
		System.out.println(Arrays.toString(x));
		String y[] = {"hhhh","aaa","bbb","aab"};
		new BubbleSorter().sort(y);
		System.out.println(Arrays.toString(y));
		PPerson pp[] = {new PPerson("angelo"),new PPerson("alcide")};
		new BubbleSorter().sort(pp);
		System.out.println(Arrays.toString(pp));
		//
		//Collections.sort(list);
	}
}

class PPerson implements Comparable<PPerson>{

	private String nome;

	public PPerson(String n) {nome = n;}

	@Override
	public int compareTo(PPerson o) {
		return nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
