package cap07ecc;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EccControllate {

	public static void main(String[] args) throws FileNotFoundException {
		leggiFile1();
		leggiFile2();
	}
		
	public static void leggiFile1(){
		try {
			FileReader f = new FileReader("pippo");
		} catch (FileNotFoundException e) {
			System.out.println(" non ho trovato il file");
			//e.printStackTrace();
		}
	}
	public static void leggiFile2() throws FileNotFoundException{
		FileReader f = new FileReader("pippo");
	}
	
}
