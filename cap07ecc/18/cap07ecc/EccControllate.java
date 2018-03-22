package cap07ecc;

import java.io.IOException;

public class EccControllate {

	public static void main(String[] args) throws Exception{
		// PRIMO MODO
		try{//..
			//...
			if (true) throw new IOException("");
			//..
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void roo() {
		try {
			kooo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void kooo() throws IOException {
		gii();
	}
	
	private void gii() throws IOException {
		foo();
	}
	
	private void foo() throws IOException{
		// SECONDO MODO : delegare
		if (true) throw new IOException("");
	}
	
	private void foo2() {
		if (true) throw new ArithmeticException();
	}

	
}
