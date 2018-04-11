package divisione_Es31;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Divisione {
	public static void main(String[] args) {
		int n=0;
		try {
			BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(cin.readLine());
			cin.close();
		} catch (Exception e) {e.printStackTrace();}
		int divisore = (int)(Math.random()*4);
		if (divisore==0) throw new RuntimeException("Errore: divisione per zero");
		System.out.println(n/divisore);
	}
}
