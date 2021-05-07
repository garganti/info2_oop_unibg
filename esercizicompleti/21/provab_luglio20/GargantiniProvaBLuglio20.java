package provab_luglio20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Automobile implements Comparable<Automobile>{
	private int km;

	public Automobile(int k) {km = k;}
	
	@Override
	public int compareTo(Automobile o) {
		// 1 + semplice e concisa
		return this.km - o.km;
		// 2
		//return Integer.compare(this.km, o.km);
		// 3 - è un po' prolissa
		/*if (this.km>o.km) return 1;
		else if (this.km == o.km) return 0;
		else return -1;*/
	}	
	@Override
	public String toString() {
		return "auto:" + km;
	}
	
	// bubble sort
	// solo 2 usare il merge sort
	static void ordinaAuto(List<Automobile> l) {
		boolean ordinato;
		do {
			ordinato = true;
			for(int i = 0; i< l.size()-1; i++) {
				if (l.get(i).compareTo(l.get(i+1))>0) {
					Automobile temp = l.get(i);
					l.set(i, l.get(i+1));
					l.set(i+1, temp);
					ordinato = false;
				}
			}
		}while(!ordinato);
	}
	
	static Automobile trovaAutoPiuVecchia(List<Automobile> l) {
		// sol 1. soluzione ordina l e prendi l'ultima
		// TODO
		// sol 2. soluzione ciclo for
		if (l.size() == 0) return null;
		// memorizza la più vecchia - inizialmente assumo la prima
		Automobile piuVecchia = l.get(0);
		for(int i=1; i < l.size(); i++) {
			// se trovo un'auto più vecchia di quella ipotizzata
			if (l.get(i).km > piuVecchia.km) {
				piuVecchia = l.get(i);
			}
		}
		return piuVecchia;
	}
	static Automobile trovaAutoConKm(List<Automobile> l, int km) {		
		//sol 1. utilizza la ricerca sequenziale, appena la trovi fai return
		// TODO
		//sol 2. utilizza la ricerca binaria
		// per prima cosa ordina l
		ordinaAuto(l);
		int sx = 0, dx = l.size() -1;
		while(sx <= dx){
			// scelgo il punto medio
			int m = (sx+dx)/2;
			// confronto con i km cercati
			int kmM = l.get(m).km;
			// se hanno uguali km, ho trovato la mia auto con i km cercati
			if (kmM == km) return l.get(m);
			// altrimenti cerco a seconda dei km
			if (kmM > km) {
				// cerca a sinistra (nelle auto con meno km)
				dx = m-1;
			} else {
				// cerca tra la auto con più km
				sx = m+1;
			}
		}
		return null;
	}

}
public class GargantiniProvaBLuglio20 {
	
	public static void main(String[] args) {
		Automobile panda = new Automobile(100000);
		Automobile uno = new Automobile(9000);
		Automobile ferrari = new Automobile(50);
		//List<Automobile> mieauto = Arrays.asList(panda,uno,ferrari);
		ArrayList<Automobile> mieauto = new ArrayList<Automobile>();
		mieauto.add(ferrari);
		mieauto.add(panda);
		mieauto.add(uno);
		
		System.out.println(mieauto);
		Automobile.ordinaAuto(mieauto);
		System.out.println(mieauto);
		System.out.println(Automobile.trovaAutoPiuVecchia(mieauto));
		// cerco le auto con determinati km
		System.out.println(Automobile.trovaAutoConKm(mieauto,50)); //-> ok
		System.out.println(Automobile.trovaAutoConKm(mieauto,500)); //-> non lo trova
		
	}

}
