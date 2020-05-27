package cap13_strutturedati;

class PilaVuotaException extends RuntimeException{}


public class Stack<E> {

	final static int N_ELEMENTI = 10;

	// E[] data; --> non si può
	Object[] data; // qui ci metto i miei E
	int primaPosizioneLibera; 

	public Stack() {
		data = new Object[N_ELEMENTI];
		primaPosizioneLibera = 0;
	}

	public void push(E a) {
		if (primaPosizioneLibera == data.length) {
			System.out.println("sto allargando la pila");
			// allargiamo l'array
			Object newData[] = new Object[data.length+ N_ELEMENTI];
			// copiare l'array vecchio
			for(int i = 0; i< data.length; i++) {
				newData[i] = data[i];				
			}
			data = newData;
		}
		data[primaPosizioneLibera] = a;
		primaPosizioneLibera ++;
	}

	public E pop() {
		if (isEmpty()) throw new PilaVuotaException(); 
		return (E)data[--primaPosizioneLibera];
	}
	
	public boolean isEmpty() {
		return primaPosizioneLibera == 0;
	}
	

	public static void main(String[] args) {
		Stack<Integer> numeriStack = new Stack<Integer>();
		numeriStack.push(5);
		numeriStack.push(15);
		System.out.println(numeriStack.pop()); // -> 15
		System.out.println(numeriStack.pop()); // -> 5
		try{
			System.out.println(numeriStack.pop()); 
		} catch(PilaVuotaException pve) {
			System.out.println("la pila è vuota");
		}
		for(int i=0; i <= 10; i++) {
			numeriStack.push(i);
		}
		for(int i=0; i <= 10; i++) {
			System.out.println(numeriStack.pop());
		}
	}

}
