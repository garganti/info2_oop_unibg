
import prog.io.ConsoleInputManager;
import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class Es20 {

	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		// legge il nome del file e crea l’oggetto corrispondente
		String nomeFile = input.readLine("Nome del file da esaminare?");
		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
		// verifica l’esistenza del file
		if (FileInputManager.exists(nomeFile)) {
			FileInputManager ingresso = new FileInputManager(nomeFile);
			String riga;
			while ((riga = ingresso.readLine()) != null) {
				riga=riga.toLowerCase();
				for (int i = 0; i <= riga.length() - 1; i++) {
					char c = riga.charAt(i);
					switch (c) {
					case 'a':
						counta++;
					case 'e':
						counte++;
					case 'i':
						counti++;
					case 'o':
						counto++;
					case 'u':
						countu++;
					}
				}
				;
			}
			// chiusura del file
			ingresso.close();
		} else {
			System.out.println("Il file non esiste");
		}

		System.out.println("Numero A: " + counta);
		System.out.println("Numero E: " + counte);
		System.out.println("Numero I: " + counti);
		System.out.println("Numero O: " + counto);
		System.out.println("Numero U: " + countu);
	}

}
