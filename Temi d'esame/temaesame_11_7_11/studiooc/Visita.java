package temaesame_11_7_11.studiooc;

public class Visita {

	public void registraAcutezza(Eye eye, int val) {
		if (val <0 || val > 20)
			throw new RuntimeException("acutezza non valida");
		// ....
	}
	
	public void aggiungiNota(String s) throws NotaTroppoCortaExcp{
		if (s == null | s.length() < 10)
			throw new NotaTroppoCortaExcp();
	}
	
}

enum Eye{ LEFT,RIGHT;}