package cap11_egi;

public class UsoFinally {

	public static void main(String[] args) {
		try {
			throw new RuntimeException("NOOOOO");
			//return;
		} finally {
			System.out.println("ciao");
		}
	}
	
}
