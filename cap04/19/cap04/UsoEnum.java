package cap04;

import prog.utili.MeseDellAnno;

public class UsoEnum {

	public static void main(String[] args) {
		
		MeseDellAnno mioMesePreferito = MeseDellAnno.AGOSTO;
		
		System.out.println("i mese più bello è " + mioMesePreferito);
		
		MeseDellAnno k = mioMesePreferito;
		
		
		System.out.println(MeseDellAnno.FEBBRAIO.name());
		
		System.out.println(MeseDellAnno.GENNAIO.ordinal());
		
	}

}
