import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es12 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String input = in.readLine("Inserisci le frazioni separate da ;: ");
		ArrayList<Frazione> listaFrazioni = new ArrayList<>();
		listaFrazioni = extractFrazioni(input);
		Frazione prodotto = getProdotto(listaFrazioni);
		out.println("Il prodotto è: " + prodotto);
	}

	//calcola il prodotto delle frazioni
	private static Frazione getProdotto(ArrayList<Frazione> listaFrazioni) {
		Frazione result= new Frazione(1);
		for (Frazione f: listaFrazioni)
			result=result.per(f);
		return result;
	}

	//estrai le frazioni e inseriscile in un arraylist
	private static ArrayList<Frazione> extractFrazioni(String input) {
		ArrayList<Frazione> listaFrazioni = new ArrayList<>();
		int[] numDen = new int[2];
		StringTokenizer st = new StringTokenizer(input, ";");
		//separa la stringa utilizzando come simbolo separatore il ;
		while (st.hasMoreTokens()) {
			String frazione = st.nextToken();
			StringTokenizer stFrazione = new StringTokenizer(frazione, "/");
			int i = 0;
			//separa la stringa utilizzando come simbolo separatore il /
			while (stFrazione.hasMoreTokens()) {
				//estrai num e den: il num è alla posizione 0 dell'array, il den alla posizione 1 dell'array
				numDen[i] = Integer.parseInt(stFrazione.nextToken()); 
				i++;
			}
			listaFrazioni.add(new Frazione(numDen[0], numDen[1])); //costriusci l'oggetto frazione e inseriscilo nell'arraylist
		}
		return listaFrazioni;
	}

}
