package cap07ecc;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EsempioDelega {
	
	public static void main(String[] args) {
		foo1();
	}

	private static void foo1() {
		try {
			foo2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void foo2() throws FileNotFoundException {
		foo3();
	}

	private static void foo3() throws FileNotFoundException {
		FileReader f = new FileReader("PP"); 
	}

}
