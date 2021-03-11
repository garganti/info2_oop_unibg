

import prog.utili.MeseDellAnno;
import prog.utili.*; // importa tutte le classi 
import static prog.utili.MeseDellAnno.*;
import static java.lang.Math.*; // importa tutti i campi e metodi statici di Math
import static java.lang.String.copyValueOf;

public class UsoEnum {
	public static void main(String[] args) {
		
		MeseDellAnno questomese = MeseDellAnno.MARZO;
		// NOOO
		// new MeseDellAnno("marzo");
		System.out.println(questomese.numeroGiorni());
		
		MeseDellAnno x = questomese;
		
		MeseDellAnno prossimo = questomese.successivo();
		
		System.out.println(prossimo);
		
		// da String a mese
		MeseDellAnno sett = MeseDellAnno.valueOf("SETTEMBRE");
		System.out.println(sett);
		
		
		MeseDellAnno ottobre = OTTOBRE;
		
		double d = sin(90);
		
	}

}
