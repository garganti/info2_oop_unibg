package gargantiniangelo;

class Persona implements Comparable<Persona> {

	String nome;

	public Persona(String n) {
		nome = n;
	}

	@Override
	public int compareTo(Persona o) {
		return nome.compareTo(o.nome);
	}
}

class AlberoPersone {

	class NodoAlbero {
		Persona p;
		AlberoPersone sx, dx;
	}

	NodoAlbero radice;

	int countPiero() {
		if (radice == null)
			return 0;
		int count = 0;
		int compareTo = radice.p.nome.compareTo("piero");
		if (compareTo == 0)
			count++;
		if (compareTo >= 0)
			count += radice.sx.countPiero();
		if (compareTo <= 0)
			count += radice.dx.countPiero();
		return count;
	}

	// copiato dall'esercizio/libro
	void inserisci(Persona e) {
		// se la radice è nulla metto e nella radice
		if (radice == null) {
			radice = new NodoAlbero();
			radice.p = e;
			radice.sx = new AlberoPersone();
			radice.dx = new AlberoPersone();
		} else {
			// confronta l'elemento della radice
			if (radice.p.compareTo(e) > 0) {
				// radice dato > di e -> inserisci a sinistra
				radice.sx.inserisci(e);
			} else {
				// inserisci a destra
				radice.dx.inserisci(e);
			}
		}
	}
}

public class GargantiniAngelo {
	public static void main(String[] args) {
		AlberoPersone classe = new AlberoPersone();
		classe.inserisci(new Persona("giovanni"));
		classe.inserisci(new Persona("paolo"));
		classe.inserisci(new Persona("piero"));
		System.out.println(classe.countPiero());

		classe.inserisci(new Persona("piero"));
		System.out.println(classe.countPiero());
	}
}