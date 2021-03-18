import java.util.ArrayList;

import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

/*
 costruisce una sequenza di 20 Rettangoli, Quadrati e Cerchi
 _a caso_ con lati da 1 a 5 a caso
 li mette in un arraylist
 calcola la figura con area massima e la stampa
 con anche il tipo di figura
 (il calcolo della figura massima lo mettiamo in un metodo a sè)
  */
public class CalcolaAreaMax {

	public static void main(String[] args) {
		ArrayList<Figura> figureCreate = new ArrayList<Figura>();
		for (int i = 0; i < 20; i++) {
			System.out.println("sto creando la figura " + (i + 1) + "-esima");
			Figura daInserire = creaFiguraAcaso();
			if (daInserire != null) {
				// stampa la figura appena inserita
				System.out.println(daInserire.getClass().getSimpleName() + daInserire.toString());
				// la aggiunge
				figureCreate.add(daInserire);
			} else {
				System.err.println("non ho inserito la figura perchè nulla");
			}
		}
		Figura max = cercaFiguraAreaMax(figureCreate);
		System.out.println("la figura più grande è " + max);
	}

	/**
	 * Crea una figura a caso.
	 *
	 * @return la figura craeata
	 */
	static Figura creaFiguraAcaso() {
		// per decidere cosa creare estriamo un numero a caso
		// tipoFigura -> 1 Rettangolo, 2 Quadrato, 3 Cerchio
		int tipoFigura = (int) (Math.random() * 3 + 1);
		Figura daInserire = null;
		switch (tipoFigura) {
		case 1:
			int base = (int) (Math.random() * 5 + 1);
			int altezza = (int) (Math.random() * 5 + 1);
			if (base == altezza)
				daInserire = new Quadrato(base);
			// rettangolo
			else
				daInserire = new Rettangolo(base, altezza);
			break;
		case 2:
			int lato = (int) (Math.random() * 5 + 1);
			daInserire = new Quadrato(lato);
			break;
		case 3:
			int raggio = (int) (Math.random() * 5 + 1);
			daInserire = new Cerchio(raggio);
			break;
		default:
			System.err.println("figura non riconosciuta " + tipoFigura);
		}
		return daInserire;
	}

	// metodo che cerca la figura con area maggiore
	// tipo prova B
	static Figura cercaFiguraAreaMax(ArrayList<Figura> ff) {
		Figura candidatoMax = ff.get(0);
		for(Figura f: ff) {
			if (f.getArea()> candidatoMax.getArea()) {
				candidatoMax = f;
			}
		}
		return candidatoMax;
	}

}
