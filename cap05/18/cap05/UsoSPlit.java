package cap05;

import java.util.Arrays;

public class UsoSPlit {

	public static void main(String[] args) {
		String a = "Alessandro Manzoni;Promessi Sposi;2018";
		String[] data = a.split(";");
		
		System.out.println(data.toString());// NON è consigliato
		System.out.println(Arrays.toString(data));
		
		System.out.println("autore " + data[0]);
		String[] autore = data[0].split(" ");
		System.out.println("nome " + autore[0]);
		
	}
	
}
