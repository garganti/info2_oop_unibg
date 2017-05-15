package cap11_egi;

import java.util.Arrays;

public class ProvaEnum {
	public static void main(String[] args) {
		GiorniSettimana oggi = GiorniSettimana.MER;
		//GiorniSettimana domani = new GiorniSettimana();
		System.out.println(oggi.name());
		System.out.println(oggi.ordinal());
		
		System.out.println(oggi.compareTo(GiorniSettimana.GIO));

	
		System.out.println(
				Arrays.
				toString(GiorniSettimana.values()));
		// per passare da un intero (ordinal) all'enum giusto
		// esempio: primo giorno settimana
		int ng = 0;
		GiorniSettimana primoGiorno = 
				GiorniSettimana.values()[ng];
		System.out.println(primoGiorno.name());
		
		System.out.println(primoGiorno.toString());
		
		System.out.println(oggi.nextDay());
		
	}

}
