import prog.io.FileInputManager;

public class UsoFile {

	public static void main(String[] args) {

		if (!FileInputManager.exists("testo.txt")) {
			System.out.println("attenzione in file non esiste!");
			return;
		}
		FileInputManager filein = new FileInputManager("testo.txt");
		System.out.println("il file esiste");
		String line;
		/* alternativa 1 con do while, attenti che mette anche null in line
		 do {
			line = filein.readLine();
			System.out.println(line);
		} while (line != null);*/
		
		/* alternativa 2 con ciclo while e condizione e assegnamento insieme
		  
		 while((line = filein.readLine()) != null) {
			System.out.println(line);
		}*/
		/* alternativa 3 - con break */
		while(true) {
			String linea = filein.readLine();
			if (linea == null) break;
			System.out.println(linea);
		}

	}
}
