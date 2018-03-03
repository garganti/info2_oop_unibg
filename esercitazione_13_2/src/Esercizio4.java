import java.util.Vector;

import prog.utili.Frazione;


public class Esercizio4 {

	static void elaboraFrazioni(String fs){
		// ff memorizza tutte le frazioni
		Vector<Frazione> ff = new Vector<>();
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
		// trova massimo, minimo, media (somma)
		Frazione max = ff.get(0);
		Frazione min = ff.get(0);
		Frazione somma = new Frazione(0);
		// inizia dal secondo
		for(int i = 1; i < ff.size(); i++){
			somma = somma.piu(ff.get(i));
			// se get(i) è maggiore del max, cambialo
			if (ff.get(i).isMaggiore(max)){
				max = ff.get(i);
			}
			if (ff.get(i).isMinore(min))
				min = ff.get(i);
		}
		// stampo i risultati
		System.out.println("MASSIMO = " + max);
		System.out.println("MINIMO = "+ min);
		Frazione media = somma.diviso(new Frazione(ff.size()));
		System.out.println("MEDIA = " + media);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		elaboraFrazioni("1:2;3:4;4:5;5:6");

	}

}
