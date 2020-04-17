package cap07ecc;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EccControllate {

	public static void main(String[] args)/* throws FileNotFoundException */{
		foo_trycatch();
		try {
			foo_delego();
		} catch (FileNotFoundException e) {
			System.out.println("non ho trovato il file non so cosa fare neanche nel main");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
	
	
	static private void foo_trycatch() {		
		try {
			FileReader fr = new FileReader("pippo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("non ho trovato il file non so cosa fare");
		}
	}

	
	static private void foo_delego() throws FileNotFoundException{
		FileReader fr = new FileReader("pippo.txt");
	}

	
}
