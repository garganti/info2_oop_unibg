import prog.io.ConsoleOutputManager;

// simulo il lancio di 5 dadi
// se la somma è > 25 dico "sei fortunato"
// altrimenti stampo riprova

//usiamo ciclo for 
// usiamo Math.random per simulare un dato

public class GiocaDadi {
	
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		int somma = 0;
		// lancio 5 dadi
		for(int i = 1; i <=5; i++) {
			// ad ognilancio
			out.print("lancio numero " + i + " : ");
			//
			long dado = 1 + Math.round(Math.floor(Math.random()*6));
			out.println(dado);
			
			//
			somma += dado;			
		}
		if (somma> 15) {
			out.println("sei fortunato");
		} else {
			out.println("riprova");
		}
		
	}
	

}
