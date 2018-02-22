package esercitazione_17_04_05;

import prog.io.FileInputManager;

public class ReadFileExample {

	public static void main(String[] args) {
		FileInputManager fim = new FileInputManager("readme.txt");
		String s = fim.readLine();
		System.out.println(s);
		fim.close();
	}
	
}
