package temaesame_11_7_11.studiooc;

import prog.utili.Data;

public class ProvaStudioOc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		StudioOculistico studio = new StudioOculistico();
		//
		Visita v = new Visita();
		v.registraAcutezza(Eye.LEFT, 20);
		try {
			v.aggiungiNota("ffopojf  poaspof");
		} catch (NotaTroppoCortaExcp e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		studio.aggiuntaPaziente("A", "G", new Data(3,4,2000));
		studio.aggiungiVisita("A", "G", v);
		studio.printPazienti();
	}

}
