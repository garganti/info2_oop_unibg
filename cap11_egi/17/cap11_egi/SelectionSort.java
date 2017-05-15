package cap11_egi;

import java.util.Arrays;

public class SelectionSort {

	 void sort(int[] a){
		 // la posizione i i da 0 a length -1 è da riempire
		 for(int i = 0; i < a.length-1; i++){
			 // cerca l'elemento da mettere in posizione i
			 // sarà il più picccol elemnto da i a length -1
			 int index_min = i;
			 for(int j = i +1; j < a.length; j++){
				 if (a[j] < a[index_min]){
					 index_min = j;
				 }
			 }
			 // metto il minimo nella posizione i
			 int temp = a[i];
			 a[i] = a[index_min];
			 a[index_min] = temp;
			 System.out.println(Arrays.toString(a));
		 }
	 }
	 
	 public static void main(String[] args) {
		int[] x = {2,7,9,1,6,0};
		new SelectionSort().sort(x);
		System.out.println(Arrays.toString(x));
	}
}
