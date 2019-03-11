package cap06;

import java.util.ArrayList;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;

/** legge da string una sequenza di rettangoli/quadrati
 * (se base == altezza costruisce un quqdrato)
 * la memorizza in una ArrayList, cerca il più grande e lo stampa
 * e stampa se è una quadrato o un rettangolo
 */
public class SeqRettangoli {
	
	public static void main(String[] args) {
		// separiamo le figure con ;
		// separiamo base e altezza da ,
		String data = "8,9;8,10;7,7;1,10";
		// le miei figure 
		ArrayList<Rettangolo> figure = new ArrayList<Rettangolo>();
		// leggi la string
		for(String figura: data.split(";")) {
			String[] basealtezza =  figura.split(",");
			double base = Double.parseDouble(basealtezza[0]);
			double altezza = Double.parseDouble(basealtezza[1]);
			if (base == altezza)
				figure.add(new Quadrato(base));
			else
				figure.add(new Rettangolo(base,altezza));
		}
		// cerca il più grande
		double maxArea = 0;
		Rettangolo maxFigura = null;
		for(Rettangolo r: figure) {
			if (r.getArea() > maxArea) {
				maxArea = r.getArea();
				maxFigura = r;
			}
		}
		// stampa maxFigura
		System.out.println("il rettangolo più grande è "+ maxFigura);
		// maxFigura è rettangolo o quadrato???
		// NOOif (maxFigura instanceof Rettangolo)
		if (maxFigura instanceof Quadrato)
			System.out.println("Quadrato");
		else 
			System.out.println("Rettangolo");
		//
		System.out.println(maxFigura.getClass().getSimpleName());
	}

}
