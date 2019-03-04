package cap05;

import java.util.Arrays;

public class UsoArray19 {
	
	public static void main(String[] args) {
		// args viene inizilizzato da java ai valori passati in riga di comando
		// se voglio stamparli
		System.out.println("argomenti:");
		//System.out.println(Arrays.toString(args));
		for(String s: args) {
			System.out.println(s);
		}
		stampaNomi('a');
		stampaNomi('b');
	}

	private static void stampaNomi(char t) {
		String[] nomi = {"angelo", "piero", "mario"};
		
		for(String n: nomi) System.out.println(n);
		System.out.println(nomi.length);
	}

}
