package cap07ecc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GeneraEccControllata {

	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		leggiDalFile();
				
	}

	private static void leggiDalFile() 
			throws FileNotFoundException, IOException{
		// apro il file
		FileReader fr = new FileReader("pippo.txt");
		// leggo da fr
		// TODO
		// chiudo
		fr.close();
	}
	
}
