

import prog.io.ConsoleInputManager;
import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class Es18 {

	public static void main(String[] args) {
		ConsoleInputManager input = new ConsoleInputManager();
		//legge il nome del file e crea l’oggetto corrispondente 
		String nomeFile = input.readLine("Nome del file da esaminare?");
		SequenzaOrdinata<String> seqParole= new SequenzaOrdinata<>();
		//verifica l’esistenza del file 
		if (FileInputManager.exists(nomeFile)) {
		  FileInputManager ingresso = new FileInputManager(nomeFile);	
		  String riga;
		  while ((riga = ingresso.readLine()) != null){
		       seqParole.add(riga);
		  }
		  //chiusura del file 
		  ingresso.close() ;
		} else {
		  System.out.println("Il file non esiste");
		}

		for (String s: seqParole)
			System.out.println(s);
	}
	
}
