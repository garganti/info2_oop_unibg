package cap07ecc;

public class ProvaEccezioni19 {
	
	public static void main(String[] args) {
		double x = Math.PI / 0;
		System.out.println(x); // no ec c
		//int y = 9/0;
		//char c = "pippo".charAt(10);
		//int h[] = {5,6,7,8};
		//System.out.println(h[4]);
		
		//  prendi un numero R intero tra 0 e 4;
		// dividi 10/R e stampalo
		// se avviene una eccezione AE stampa errore
		int R = (int) Math.round(Math.random()*5);
		int h[] = {5,6};
		try{
			System.out.println(h[R]/R);
		} catch(ArithmeticException ae) {
			System.out.println("non posso dividere per zero");
		} catch(ArrayIndexOutOfBoundsException oob){
			System.out.println("non posso accedere all'array");			
		}
		System.out.println("finito");
		
	}

}
