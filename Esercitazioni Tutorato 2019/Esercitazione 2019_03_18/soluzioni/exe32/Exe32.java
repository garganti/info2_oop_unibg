package exe32;

public class Exe32 {

	public static void main(String[] args) {
		String stringavoti = "a;18;5;-3;20";
		estraiVoti(stringavoti);
	}

	private static void estraiVoti(String stringavoti) {
		String elencovoti[] = stringavoti.split(";");
		int voto = 0;
		for (int i = 0; i < elencovoti.length; i++) {
			try {
				voto = Integer.parseInt(elencovoti[i]);
				if (voto < 18 || voto > 30)
					throw new RuntimeException(voto + " Voto non valido");
			} catch (NumberFormatException e) {
				System.out.println("Errore! " + elencovoti[i] + " non è un numero " + e.toString());
			} catch (RuntimeException e) {
				System.out.println("Errore! " + elencovoti[i] + " voto non valido " + e.toString());
			}
		}
	}
}
