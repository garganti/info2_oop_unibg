package cap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsoSort {
	
	public static void main(String[] args) {
		ArrayList<String> nomi = new ArrayList<>();
		nomi.add("Piero");
		nomi.add("Mario");
		nomi.add("Gigi");
		nomi.add("Gioan");
		nomi.add("Andrea");
		System.out.println(nomi.toString());
		//
		Collections.sort(nomi);
		System.out.println(nomi.toString());
	}

}
