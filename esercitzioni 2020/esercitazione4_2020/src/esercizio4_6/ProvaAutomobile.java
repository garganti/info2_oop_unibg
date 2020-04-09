package esercizio4_6;

import java.util.Arrays;

public class ProvaAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile(0);
		Automobile b = new Automobile(90000);
		Automobile c = new Automobile(1000);
		Automobile[] garage = {a,b,c};
		System.out.println(Arrays.toString(garage));
		//Arrays.parallelSort(garage);
		Automobile.sort(garage);
		System.out.println(Arrays.toString(garage));
	}

}
