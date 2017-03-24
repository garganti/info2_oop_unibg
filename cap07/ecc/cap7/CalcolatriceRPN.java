package cap7;

import java.util.Stack;

public class CalcolatriceRPN {

	public static void main(String[] args) {
		System.out.println(computeSafe("3 2 +")); // 5
		System.out.println(computeSafe("3 2 -")); // 1
		System.out.println(computeSafe("3 2 5 + *")); // 21
		System.out.println(computeSafe("3 2 + 5 *")); // 25
		System.out.println(computeSafe("3 0 /")); //
		System.out.println(computeSafe("3 2 p")); // operatore non valido
		System.out.println(computeSafe("3 p")); // operatore/operando non
		// valido
		System.out.println(computeSafe("3 2 + *")); // empty stack
		System.out.println(computeSafe("3 2 + 4")); // troppi operandi
		/*
		 * } catch (ArithmeticException e) { System.out.println(
		 * "errore aritmetico " + e.getMessage());
		 * }catch(java.util.EmptyStackException este){ System.out.println(
		 * "hai inserito troppo pochi operandi"); } catch (Exception e) {
		 * System.out.println("errore " + e.getMessage()); e.printStackTrace();
		 * }
		 */
	}

	static int computeSafe(String expression) {
		try {
			return compute(expression);
		} catch (Exception e) {
			System.err.println("errore");
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 * @param expression
	 *            da valutare
	 * @return valore
	 */
	static int compute(String expression) {
		Stack<Integer> pila = new Stack<>();
		String[] tokens = expression.split(" ");
		for (String t : tokens) {
			switch (t) {
			case "+":
			case "-":
			case "*":
			case "/":
				Integer op1 = pila.pop();
				Integer op2 = pila.pop();
				int ris = calcola(op1, op2, t);
				pila.push(ris);
				break;
			default:
				// vuol dire che t è un numero
				try {
					int i = Integer.parseInt(t);
					pila.push(i);
				} catch (NumberFormatException nfe) {
					throw new RuntimeException("hai inserito una stringa " + t + " al posto di un numero");
				}
			}
		}
		Integer risultato = pila.pop();
		if (pila.isEmpty())
			return risultato;
		throw new RuntimeException("hai inserito troppo operandi");
	}

	private static int calcola(Integer op2, Integer op1, String o) {
		switch (o) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		}
		throw new RuntimeException("operatore " + o + " non valido");
	}
}
