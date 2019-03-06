package cap05;

import javax.sound.midi.Sequence;

import prog.io.ConsoleInputManager;
import prog.utili.Sequenza;

public class StampaInverso {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		usaArray(in);
		usaSequenza(in);

	}

	private static void usaSequenza(ConsoleInputManager in) {
		// domanda all'utente e inserisci in sequenza fino a quando inserisce la string vuota
		Sequenza<String> nomi = new Sequenza<>();
		for(;;) {
			String nome = in.readLine("inserisci nome");
			if (nome.equals("")) break;
			nomi.add(nome);
		}
		System.out.println(nomi.toString());
	}

	private static void usaArray(ConsoleInputManager in) {
		int nS = in.readInt("quante stringhe vuoi inserire?");
		String[] nomi  = new String[nS];
		for(int i = 0; i < nomi.length; i++) {
			nomi[i] = in.readLine("inserisci la "+ i + "esima stringa");
		}
		// ristampo in ordine inverso
		for(int i = nomi.length -1; i >= 0; i --) {
			System.out.print(nomi[i]);
		}
	}

}
