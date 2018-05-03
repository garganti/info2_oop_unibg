package figure_Es36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Figura> v = new ArrayList<Figura>();
		
		v.add(new Quadrato(2));
		v.add(new Rettangolo(5,10));
		v.add(new Quadrato(6));
		v.add(new Triangolo(3,4,5));
		v.add(new Triangolo(9, 40, 41));
		v.add(new Cerchio(5));
		v.add(new Cerchio(4.5));
		
		System.out.println("Stampo lista prima di ordinare:");
		System.out.println(v);
		
		// ordino
		Collections.sort(v);
		
		System.out.println("Stampo lista ordinata per perimetro:");
		System.out.println(v);
		
		System.out.println("Stampo solo triangoli (ordinati per perimetro):");
		for (Figura f : v) if (f instanceof Triangolo) System.out.print(f+"; ");
		
		System.out.println("\nStampo il ranking dei rettangoli (e quadrati) top per area:");
		stampaRettangoliGrandi(v);
	}
	
	/** Metodo per l'esercizio opzionale */
	public static void stampaRettangoliGrandi(List<Figura> figure) {
		
		// seleziono rettangoli e quadrati con area > 20
		List<Figura> selected = new ArrayList<>();
		for (Figura f : figure) 
			if (f instanceof Rettangolo && f.getArea()>20)   // se è instanza di Quadrato, lo è anche di Rettangolo
				selected.add(f);
		
		// ordino in modo decrescente di area
		Collections.sort(selected, new Comparator<Figura>() {

			@Override
			public int compare(Figura a, Figura b) {
				return a.getArea() > b.getArea() ? -1 : (a.getArea()==b.getArea()) ? 0 : 1;
			}
			
		});
		
		// stampo lista
		System.out.println(selected);
	}
}
