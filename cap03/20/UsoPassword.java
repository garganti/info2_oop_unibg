import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

// chiedo all'utente la passord e se è 
// uguale alla parola magica "atalanta"
// allaora ha accesso alla cassaforte
public class UsoPassword {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String password = in.readLine("inserisci la tua password");
		
		if (password.equals("atalanta")) {
			out.println("hai accesso alla cassaforte");
		} else {
			out.println("non ti riconosco, vai via");			
		}
	}

}
