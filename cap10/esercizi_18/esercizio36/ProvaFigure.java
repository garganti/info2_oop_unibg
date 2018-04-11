package esercizio36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*	Definire l'architettura a oggetti del dominio "Figure geometriche", 
 *  definendo classe Figura (astratta), e l
 *  e sottoclassi: Rettangolo, Quadrato (sottoclasse di Rettangolo), 
 *  Triangolo e Cerchio. è simile alle figure del libro ma non usare 
 *  quelle, definisci delle tue figure
	
	ogni figura ha due metodi per calcolare l'area e il perimetro
	Scrivi un main in cui Inserisci delle figure 
	in una lista (ArrayList, Sequenza o Vector) 
	(non fare input con l’utente, 
	costruisci gli oggetti programmaticamente), 
	e le ordini per area (usa Comparable e 
	Collections.sort o SequenzaOrdinata).
	
	Stampare tale lista.
	Stampare solo i triangoli sempre in ordine di perimetro
	
	[opzionale] Scrivi un metodo che stampa solo i rettangoli 
	o quadrati con area > 20 in una lista passata come argomento, 
	in ordine decrescente di area.
	usa sort e un comparator diverso dal Comparable*/

abstract class Figura implements Comparable<Figura>{ 
	//protected Figura(){}
    abstract double getArea();
    abstract double getPerimetro();
    // ordina rispetto area
    @Override
    public int compareTo(Figura o) {
    	double deltaA = this.getArea() - o.getArea();
		if (deltaA < 0) return -1;
		else if (deltaA > 0) return 1;
    	return 0;
    }
}

class Rettangolo extends Figura{
	protected final double base, altezza;
	Rettangolo(double base, double altezza){
		this.base = base;
		this.altezza = altezza;
	}
	@Override
	public double getArea() {
		return base*altezza;
	}
	@Override
	double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Quadrato extends Rettangolo{
	private static final int AL_QUADRATO = 2;
	// nessun campo
	public Quadrato(double lato) {
		super(lato,lato);
	}
	@Override
	public double getArea() {
		return Math.pow(base, AL_QUADRATO);
	}
	
}

class Cerchio extends Figura{
	final double raggio;
	/**
	 * @param r raggio
	 */
	public Cerchio(double r) {
		raggio = r;
	}
	@Override
	double getArea() {
		return raggio*raggio*Math.PI;
	}
	@Override
	double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Triangolo extends Figura{
	double l1,l2,l3;
	public Triangolo(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	@Override
	double getArea() {
		// formula di erone
		// TODO
		return Math.sqrt(60);
	}
	@Override
	double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class ProvaFigure{
	public static void main(String[] args) {
		Figura fr = new Rettangolo(3, 4);
		Figura fq = new Quadrato(5);
		Figura fc = new Cerchio(7);
		System.out.println(fr.getArea());
		List<Figura> figure = new ArrayList<>();
		figure.add(fc);
		figure.add(fr);
		figure.add(fq);
		System.out.println(figure);
		Collections.sort(figure);
		System.out.println(figure);		
		// voglio ordinare rispetto il perimetro
		// come faccio?
		ComparatorByPerimetro comparatorByPerimetro = new ComparatorByPerimetro();
		Collections.sort(figure, comparatorByPerimetro);
	}
	
}
// per confrontare le figure con un alytro cirteiro 
// rispetto il COmparable
class ComparatorByPerimetro implements Comparator<Figura>{

	@Override
	public int compare(Figura o1, Figura o2) {
		double deltaP = o1.getPerimetro() - o2.getPerimetro();
		if (deltaP < 0) return -1;
		else if (deltaP > 0) return 1;
    	return 0;
	}
	
}
