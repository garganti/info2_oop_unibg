package cap07ecc;

import java.util.EmptyStackException;
import java.util.Stack;

/** QUesta  
 * */
public class Hp12C {

	// s l'espressione in forma postfissa
	// restituisce il valore numerico
	/**
	 *  calcola il valore
	 * @param s l'espressione in notazione postifissa
	 * @return il valore di s
	 */
	double calcola(String s){
		// stack dove memorizzare il dati
		Stack<Integer> pila = new Stack<>();
		// spezzo la stringa in tokens
		String[] dati = s.split(" ");
		
		for(String d: dati) {
			//System.out.println("leggo"  + d  + " pila: " + pila.toString());
			// se è un operatore
			switch (d) {
			case "*":
			case "+":
			case "-":
			case "/":
				try{
					// leggo i due dati dallo stack
					int d1 =  pila.pop();
					int d2 =  pila.pop();
					// fare operazione e metter eil risultato
					pila.push(operazione(d1,d,d2));
				} catch(ArithmeticException ae) {
					System.out.print("DIVISIONE PER ZERO ");
					return 0;
				} catch(EmptyStackException ese) {
					System.out.print("MANCA UN NUMERo");
					return 0;
				}
				break;
			default:
				// se d è un numero lo metto sulla pila
				try{
					pila.push(Integer.parseInt(d));
				}catch (NumberFormatException e) {
					System.out.print(d + " NON è un NUMERO");
					return 0;
				}
			}
		}
		Integer result = pila.pop();
		if(!pila.isEmpty()) {
			System.out.print("TROPPI OPERANDI");
			return 0.0;
		}
		return result;
	}
	// effttua l'oprazione d tra d1 e d2
	private int operazione(int d1, String d, int d2) {
		switch (d) {
		case "*":
			return d1*d2;
		case "+":
			return d1+d2;
		case "-":
			return d2-d1;
		case "/":
			return d2/d1;
		}
		System.err.println("ERRORE");
		return 0;
	}

	public static void main(String[] args) {
		Hp12C mc = new Hp12C();
		System.out.println(mc.calcola("3 2 +"));
		System.out.println(mc.calcola("3 8 90 100 + * -"));
		System.out.println(mc.calcola("3 0 /"));
		System.out.println(mc.calcola("90 89 *"));
		// un carattere non valido
		System.out.println(mc.calcola("90 B9 *"));
		// non ho abbastanza operandi
		System.out.println(mc.calcola("90 7 * +"));
		// non abbastanza operatori
		System.out.println(mc.calcola("90 7 90 +"));
		
	}
}
