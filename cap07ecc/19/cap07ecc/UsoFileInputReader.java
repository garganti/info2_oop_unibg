package cap07ecc;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UsoFileInputReader {

	public static void main(String[] args){
		try {
			b();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void b() throws FileNotFoundException{a();}

	private static void a() throws FileNotFoundException{
		FileReader fr = new FileReader("cfff");
	}
	
}
