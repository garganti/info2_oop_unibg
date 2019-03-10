import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es11 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String intput = in.readLine("Inserisci i numeri separati da #: ");
		StringTokenizer st = new StringTokenizer(intput, "#");
		ArrayList<Double> numbers= new ArrayList<>();
		while(st.hasMoreTokens()) {
			numbers.add(Double.parseDouble(st.nextToken()));
		}
		
		out.println("Il massimo è: " + getMax(numbers));
		out.println("La media è: " + getMedia(numbers));

		out.println("La varianza è: " + getVarianza(numbers));
		
	}

	private static double getMax(ArrayList<Double> numbers) {
		double max= numbers.get(0); //inizializza il max al primo valore dell'array
		for (double n: numbers)
			if (n>max)
				max=n;
		return max;
	}
	
	
	private static double getMedia(ArrayList<Double> numbers) { //calcola la media
		double sum=0;
		for (double n: numbers)
				sum+=n;
		return sum/numbers.size();
	}
	
	//Varianza dei valori pari inseriti dall'utente compresi tra 0 e 100
	private static double getVarianza(ArrayList<Double> numbers) {
		double sum=0;
		ArrayList<Double> lowerthan100= new ArrayList<>();
		for (double n: numbers)
				if (n>=0 && n<=100 && (n % 2)==0) { //estrai i numeri pari tra 0 e 100 per il calcolo della varianza
					lowerthan100.add(n);
				}
		double media=getMedia(lowerthan100);
		for (double n: lowerthan100)
			sum=sum+Math.pow((n-media), 2);
		return sum/lowerthan100.size();
	}
	

}
