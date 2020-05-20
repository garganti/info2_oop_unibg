package matrici;

import java.util.ArrayList;

import prog.utili.Rettangolo;

public class MatriceGen<T> {
	private ArrayList<ArrayList<T>> dati;
	protected int numeroRighe, numeroColonne;

	public MatriceGen(int numeroRighe, int numeroColonne) {
		this.numeroRighe = numeroRighe;
		this.numeroColonne = numeroColonne;
		dati = new ArrayList<ArrayList<T>>();
		for(int c = 0; c < numeroColonne; c++) {
			ArrayList<T> e = new ArrayList<T>(numeroRighe);
			for(int r = 0; r < numeroRighe; r++) {
				e.add(null);
			}
			dati.add(e);
		}
	}
	// matrice quadrata
	public MatriceGen(int numeroRighe) {
		this(numeroRighe,numeroRighe);
	}
	
	public void set(int r, int c, T v) {
		dati.get(c).set(r, v);
	}
	
	@Override
	public String toString() {
		return dati.toString();
	}
	
	// metodo generico che:
	// richiede che il tipo generico (S) extenda comparable
	// restituisce un S che è minimo nella matrice
	// prende un matrice di elementi di tipo S
	static <S extends Comparable<S>> S minimo(MatriceGen<S> matrice) {
		S min = null;
		for(int c = 0; c < matrice.numeroColonne; c++) {
			for(int r = 0; r < matrice.numeroRighe; r++) {
				S element = matrice.dati.get(c).get(r);
				if (element == null) continue;
				if ((min == null)|| (element.compareTo(min) < 0)){
					// cambio il minimo
					min = element;
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		MatriceGen<Integer> txt = new MatriceGen<>(3);
		txt.set(0,0,1);
		txt.set(2,2,10);
		System.out.println(txt.toString());
		System.out.println(minimo(txt));
		//
		MatriceGen<String> txts = new MatriceGen<>(3);
		txts.set(0,0,"akinos");
		txts.set(2,2,"olop");
		txts.set(1,2,"lyuki");
		System.out.println(txts.toString());
		System.out.println(minimo(txts));
		//
		MatriceGen<Rettangolo> rettangoli = new MatriceGen<>(3);
		rettangoli.set(1,1,new Rettangolo(5, 6));
		System.out.println(rettangoli);
		// non posso perchè Rettangolo non è comparable
		// System.out.println(minimo(rettangoli));
	}
	
}
