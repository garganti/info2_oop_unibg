package cap07ecc;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * QUesta
 */
public class Hp12C2_2 {

	void calcolaGestioneEcc(String s) {
		System.out.print(s + " --> ");
		try {
			System.out.print(calcola(s));
			return;
		} catch (ArithmeticException ae) {
			System.out.print("DIVISIONE PER ZERO ");
		} catch (EmptyStackException ese) {
			System.out.print("MANCA UN NUMERo");
		} catch (NumberFormatException e) {
			System.out.print(" NON è un NUMERO");
		} catch (RuntimeException e) {
			System.out.print(e.getMessage());
		} finally {
			System.out.println(" risulatato finito");
		}
	}

	// s l'espressione in forma postfissa
	// restituisce il valore numerico
	/**
	 * calcola il valore
	 * 
	 * @param s
	 *            l'espressione in notazione postifissa
	 * @return il valore di s
	 */
	double calcola(String s) {
		// stack dove memorizzare il dati
		Stack<Integer> pila = new Stack<>();
		// spezzo la stringa in tokens
		String[] dati = s.split(" ");

		for (String d : dati) {
			// System.out.println("leggo" + d + " pila: " + pila.toString());
			// se è un operatore
			switch (d) {
			case "*":
			case "+":
			case "-":
			case "/":
				// leggo i due dati dallo stack
				int d1 = pila.pop();
				int d2 = pila.pop();
				// fare operazione e metter eil risultato
				pila.push(operazione(d1, d, d2));
				break;
			default:
				// se d è un numero lo metto sulla pila
				pila.push(Integer.parseInt(d));
			}
		}
		Integer result = pila.pop();
		if (!pila.isEmpty()) {
			RuntimeException e = new RuntimeException("TROPPI OPERANDI");
			throw e;
		}
		return result;
	}

	// effttua l'oprazione d tra d1 e d2
	private int operazione(int d1, String d, int d2) {
		switch (d) {
		case "*":
			return d1 * d2;
		case "+":
			return d1 + d2;
		case "-":
			return d2 - d1;
		case "/":
			return d2 / d1;
		}
		System.err.println("ERRORE");
		return 0;
	}

	public static void main(String[] args) {
		Hp12C2_2 mc = new Hp12C2_2();
		mc.calcolaGestioneEcc("3 2 +");
		mc.calcolaGestioneEcc("3 8 90 100 + * -");
		mc.calcolaGestioneEcc("3 0 /");
		mc.calcolaGestioneEcc("90 89 *");
		// un carattere non valido
		mc.calcolaGestioneEcc("90 B9 *");
		// non ho abbastanza operandi
		mc.calcolaGestioneEcc("90 7 * +");
		// non abbastanza operatori
		mc.calcolaGestioneEcc("90 7 90 +");

	}
}
