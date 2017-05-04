package cap07ecc;

import java.util.Stack;

public class Calcolatrice {

	public static void main(String[] args) {
		System.out.println(calcolo("5 6 *"));
		System.out.println(calcolo("7 6 -"));
		System.out.println(calcolo("3 2 + 5 3 - *"));
		// division by zero
		System.out.println(calcolo("50 0 /"));
		// sbaglio un simbolo
		System.out.println(calcolo("80 90 x"));
		// sbaglio un simbolo
		System.out.println(calcolo("90 0 * +"));
	}

	public static int calcolo(String expressione) {
		Stack<Integer> pila = new Stack<>();
		String[] tokens = expressione.split(" ");
		try {
			for (String e : tokens) {
				if (e.equals("*") || e.equals("-") || e.equals("+") || e.equals("/")) {
					// prendi i due elementi dalla pila
					int e1 = pila.pop();
					int e2 = pila.pop();
					// fai operazione
					switch (e) {
					case "+":
						pila.push(e1 + e2);
						break;
					case "*":
						pila.push(e1 * e2);
						break;
					case "/":
						pila.push(e2 / e1);
						break;
					case "-":
						pila.push(e2 - e1);
						break;
					}
				} else {
					// è numero: metti sullo stack
					pila.push(Integer.parseInt(e));
				}
			}
		} catch (ArithmeticException ae) {
			System.out.println("disione per zero ");
			System.out.println(ae.getMessage());
			return 0;
		} catch (NumberFormatException ne) {
			System.out.println(ne.getMessage() +" non è un numero");
			return 0;			
		}
		return pila.pop();
	}

}
