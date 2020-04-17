package cap07ecc;

import java.util.EmptyStackException;
import java.util.Stack;

public class HP12 {

	public static void main(String[] args) {
		// 3 * (5 + 6)
		calcolaEspressione("3 5 6 + *");
		// 3 + (5 * 6)
		calcolaEspressione("3 5 6 * +");
		// errori:
		// troppi operatori
		calcolaEspressione("3 5 + *");
		// operatori sconosciuti
		calcolaEspressione("3 p +");
		// divisione per zero
		calcolaEspressione("3 0 :");

	}

	private static void calcolaEspressione(String espressione) {
		System.out.print(espressione + " = ");
		Stack<Integer> pila = new Stack<>();
		for (String s : espressione.split(" ")) {
			switch (s) {
			case "+":
			case "-":
			case "*":
			case ":":
				try {
					Integer el1 = pila.pop();
					Integer el2 = pila.pop();
					Integer ris = operazione(el1, el2, s);
					pila.push(ris);
				} catch (EmptyStackException e) {
					System.out.println("hai messo troppi operatori");
					return;
				} catch (ArithmeticException e) {
					System.out.println("divisione per zero");
					return;
				}
				break;
			default: // è un numero
				try {
					int number = Integer.parseInt(s);
					pila.push(number);
				} catch (NumberFormatException e) {
					System.out.println("questo: "+ s +" non è un numero");
					return;
				}
			}
		}
		// in fondo alla pila ho risultato
		System.out.println("il risultato è " + pila.pop());
	}

	private static Integer operazione(Integer el1, Integer el2, String op) {
		switch (op) {
		case "+":
			return el1 + el2;
		case "-":
			return el2 - el1;
		case "*":
			return el2 * el1;
		// case ":":
		default:
			return el2 / el1;
		}
	}

}
