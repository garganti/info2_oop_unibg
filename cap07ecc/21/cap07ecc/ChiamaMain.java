package cap07ecc;

import java.io.IOException;

public class ChiamaMain {
	
	public static void main(String[] args) {
		try {
			GeneraEccControllata.main(new String[0]);
		} catch (IOException e) {
			System.err.println("questo main non va per colpa di");
			e.printStackTrace();
		}
	}

}
