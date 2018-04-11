package esercizio39;

import java.util.ArrayList;
import java.util.List;

class Persona {
	String nome, cognome;
}

class Esame {
	public Esame(String n, int v) {
		nome = n;
		voto = v;
	}
	String nome;
	int voto;
}

class Studente extends Persona {
	
	final static int TAX_MAX = 2000;
	
	int matricola;
	List<Esame> esami = new ArrayList<>();
	double mediaVoti;

	void calcolaMediVoti() {
		double somma = 0;
		for (Esame e : esami) {
			somma += e.voto;
		}
		mediaVoti = somma / esami.size();
	}
	void inserisciVoto(String string, int i) {
		esami.add(new Esame(string, i));
	}
	// calcolo delle tasse
	// in base alla fascia di reddito + merito
	int getTassa(int fascia){
		calcolaMediVoti();
		int tassaVoti = getTassa();
		switch (fascia) {
		case 1:
			return (int) (tassaVoti *.5);
		case 2:
			return (int) (tassaVoti *.65);
		// TODO
		default:
			return tassaVoti;
		}
		
		
	}
	// in base solo al merito
	// non indica fascia di reddito
	int getTassa(){
		calcolaMediVoti();
		int mediVotiArr = (int)Math.ceil(mediaVoti);
		switch (mediVotiArr) {
		case 30:
			return (int) (TAX_MAX *.9);
		case 29:
			return (int) (TAX_MAX *.92);
		case 28:
			return (int) (TAX_MAX *.94);
		// TODO
		default:
			return TAX_MAX;
		}
		
	}
	
}

public class Esercizio39 {
	public static void main(String[] args) {
		Studente s = new Studente();
		s.inserisciVoto("Analisi1", 30);
		s.inserisciVoto("Analisi2", 29);
		s.calcolaMediVoti();
		System.out.println(s.mediaVoti);
		System.out.println(s.getTassa());
		System.out.println(s.getTassa(2));
	}
}
