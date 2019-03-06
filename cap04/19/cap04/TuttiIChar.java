package cap04;

public class TuttiIChar {

	public static void main(String[] args) {
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			int x = c; // conversione implicita a intero
			System.out.println(" ->" + x);
			char g = (char)x;
		}
		System.out.println("ciao \ncome \b\b\bstai");
	}
}
