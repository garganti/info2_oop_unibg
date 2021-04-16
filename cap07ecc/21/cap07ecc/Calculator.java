package cap07ecc;

import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

	/**
	 * Compute. - interi - operatori +, ---
	 *
	 * @param s la stringa che contiene una espressione aritemica
	 * @return il valore della espressione o null se non è valida
	 */
	Integer compute(String s) {
		Stack<Integer> pila = new Stack<>();
		String[] tokens = s.split(" ");
		for (String t : tokens) {
			try {
				switch (t) {
				case "*":
					pila.push(pila.pop() * pila.pop());
					break;
				case "+":
					pila.push(pila.pop() + pila.pop());
					break;
				case "-":
					pila.push(-pila.pop() + pila.pop());
					break;
				case "/":
					int den = pila.pop();
					int num = pila.pop();
					try {
						pila.push(num / den);
						break;
					} catch (ArithmeticException a) {
						System.out.println("divisione per zero");
						return null;
					}
				default:
					// è un operando (non un operatore * + ...)
					// è un intero mettilo sullo stack
					try {
						pila.push(Integer.parseInt(t));
					} catch (NumberFormatException e) {
						System.out.println("guarda che " + t + " non è numero valido");
						return null;
					}
				}
			} catch (EmptyStackException ese) {
				System.out.println("espressione con troppi opratori");
				return null;
			}
		}
		return pila.pop();
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.compute("4 5 +"));// -> 9
		System.out.println(c.compute("3 2 * 5 6 * +"));// -> 36
		System.out.println(c.compute("8 4 /"));// -> 2
		System.out.println(c.compute("8 2 2 + /"));// -> 2
		// situazioni anomale
		// non è un numero
		System.out.println(c.compute("8.01 9.78 +"));
		System.out.println(c.compute("pippo "));
		// divisione per zero
		System.out.println(c.compute("5 0 /"));
		//
		System.out.println(c.compute("5 4 * *"));
	}

}
