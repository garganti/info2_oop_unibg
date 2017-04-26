package ercizio11_1;

public class UsaOrario {
	public static void main(String[] args) {
		Orario.setSeparatore('^');
		Orario siesta = new Orario(14, 00);
		Orario siesta2 = new Orario(13, 60);
		
		//System.out.println(siesta.minuti);
		System.out.println(siesta.ore);
		
		System.out.println(siesta.isPM());
		Orario ananna = new Orario(21, 30);
		System.out.println(ananna.isPM());
		//
		System.out.println(siesta.quantoManca(ananna));
		System.out.println(siesta);
		Orario o = new Orario("7:00");
		System.out.println(o);
		//o.separatore = '-'; private
		//Orario.separatore = '-';
		System.out.println(o);
		System.out.println(siesta);
		
	}

}
