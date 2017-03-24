package esercitazione1_14;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class CalcoloIIGrado {
	
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		double a = in.readDouble("coeff a");
		double b = in.readDouble("coeff b");
		double c = in.readDouble("coeff c");
		// calcolo del delta
		// d = b^2 - 4ac
		double d = Math.pow(b, 2) - 4 * a * c;
		if(d <0 ){
			out.println(" non esistono soluzioni");
		} else if (d == 0){
			out.println("solo una soluzione");
			out.println("soluzione " + -b/2*a);
		} else{
			out.println("due soluzioni");
			out.println("soluzione1 " + (-b + Math.sqrt(d))/2*a);
			out.println("soluzione2 " + (-b - Math.sqrt(d))/2*a);
			
		}
	}
	
	static int numSoluzioni(double a, double b, double c){
		
	}

}
