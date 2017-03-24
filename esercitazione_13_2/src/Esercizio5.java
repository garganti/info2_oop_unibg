import java.util.Vector;

import prog.utili.Frazione;
import prog.utili.SequenzaOrdinata;

/** legeg frazioni e metti in ordine */
public class Esercizio5 {

	static void elaboraFrazioni(String fs){
		// ff memorizza tutte le frazioni
		SequenzaOrdinata<Frazione> ff = new SequenzaOrdinata<>();
		// spezzare la string in ingresso
		String[] frazioni = fs.split(";");
		for(String f:frazioni){
			// spezzare num e denum
			String[] frazione = f.split(":");
			// frazione[0] è il numeratore
			int num = Integer.parseInt(frazione[0]);
			int den = Integer.parseInt(frazione[1]);
			//aggiungo al vector
			ff.add(new Frazione(num,den));
		}
		// stampo le frazioni
		for(Frazione f: ff){
			System.out.println(f.toString());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		elaboraFrazioni("1:2;3:4;4:5;5:6");

	}

}
