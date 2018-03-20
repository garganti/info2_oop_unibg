package voli_Es29;

import java.util.ArrayList;


public class Volo {

	static int counter=1;
	String id="";
	String destinazione, partenza;
	int postiDispE;
	int postiDispP;
	ArrayList<Passeggero> passeggeri;

	public Volo(String destinazione, String partenza, int postiDispE, int postiDispP) {
		this.destinazione = destinazione;
		this.partenza = partenza;
		this.postiDispE = postiDispE;
		this.postiDispP = postiDispP;
		passeggeri = new ArrayList<>();
		id=String.valueOf(counter);
		counter++;
	}

	void aggiungiPasseggero(Passeggero p) {
		if (p.getClasse() == 'E' && postiDispE > 0) {
			passeggeri.add(p);
			postiDispE--;
		} else if (p.getClasse() == 'P' && postiDispP > 0) {
			passeggeri.add(p);
			postiDispP--;
		} else
			System.out.println("Non ci sono più posti in classe " + p.getClasse());
	}
	
	int indicePasseggero(int id) {
		for (int i=0; i<passeggeri.size(); i++)
			if (id==passeggeri.get(i).getIdBiglietto())
				return i;
		return -1;
	}
	

	void rimuoviPasseggero(int idBiglietto) {
		for (int i=0; i<passeggeri.size(); i++) {
			int indice=indicePasseggero(idBiglietto);
			if (indice!=-1) {
			if (passeggeri.get(indice).getClasse()=='E')
					postiDispE++;
			else if (passeggeri.get(indice).getClasse()=='P')
					postiDispP++;
			passeggeri.remove(indice);
			}else
				System.out.println("Passeggero non trovato");
		}
	}
	
	
	double incassoVolo() {
		double tot=0;
		for (int i=0; i<passeggeri.size(); i++) 
			tot+=passeggeri.get(i).getPrezzoBiglietto();
		return tot;
	}
	

	void stampaPasseggeri() {
		for (Passeggero p: passeggeri)
			System.out.println(p.toString());
	}
	
	@Override
	public String toString() {
		return id + " " + destinazione + " " + partenza + " disp E " + postiDispE + " disp P " + postiDispP;
	}
}
