package cap7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UsoFile {

	public static void main(String[] args) throws FileNotFoundException {
		leggifile();
	}

	private static void leggifile() throws FileNotFoundException {
		FileReader fr = new FileReader("/etc/passwd");
	}

}
