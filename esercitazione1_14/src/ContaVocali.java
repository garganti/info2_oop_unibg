import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class ContaVocali {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsoleInputManager t = new ConsoleInputManager();
		String frase = t.readLine("inserisci frase\n");
		// contare le vocali
		int nVocali = 0;
		for(int i = 0; i < frase.length() ; i++){
			char c = frase.charAt(i);
			if (isVocale(c)){
				nVocali ++;
			}
		}
		ConsoleOutputManager output = new ConsoleOutputManager();
		output.println("ho trovato "+ nVocali + " vocali");
	}
	
	// tipo_rest nome_metodo ( parametri)
	static boolean isVocale(char c){
		if (c == 'A' || c == 'a' || c == 'e'){
			return true;
		} else{
			return false;
		}
		
	}

}
