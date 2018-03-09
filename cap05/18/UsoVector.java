import java.util.Arrays;
import java.util.Vector;

public class UsoVector {
	public static void main(String[] args) {
		
		String[] nomi = new String[10];
		nomi[0] = "pippo";
		
		System.out.println(nomi[0]);
		System.out.println(nomi.toString());
		
		// dovrei fare
		System.out.println(Arrays.toString(nomi));
		
		Vector<String> nomiV = new Vector<String>();
		// per aggiungere a dun vettore
		nomiV.add("pippo"); // alternativa
		nomiV.set(0, "pippo");
		// per stampare
		System.out.println(nomiV.get(0));
		for(int i = 0; i < 100; i++) {
			nomiV.add("nome " + i);
		}
		// stampa
		System.out.println(nomiV.toString());
		for(String s: nomiV) {
			System.out.println(s);
		}
		
	
	}
}
