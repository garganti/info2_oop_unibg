package voti_es3;

import java.util.ArrayList;

import javax.print.attribute.standard.Media;


public class Studente extends Persona{
	
	int matricola;
	float tasse;
	ArrayList<Esami> e=new ArrayList<Esami>();
	int media;
	float taxmax=2000;

	public Studente(String nome, String cognome) {
		super(nome, cognome);
	}
	
	public Studente(String nome, String cognome, int matricola) {
		super(nome, cognome);
		this.matricola=matricola;
	}

	

	public void media() {
		int somma=0;
		for (int i=0; i<e.size(); i++){
			somma+=e.get(i).voto;
		}
		media=somma/e.size();
	}
	
	public void calcolatasse() {
		switch (media){
		case 30: 
			tasse=(float) (taxmax*(1-0.1));
			break;
		case 29:
			tasse=(float) (taxmax*(1-0.08));
			break;
		case 28:
			tasse=(float) (taxmax*(1-0.6));
			break;
		case 27:
			tasse=(float) (taxmax*(1-0.4));
			break;
		default:
			tasse=taxmax;
			break;
		}
	}
	
	
	public void calcolatasse(int fascia) {
		switch (fascia){
		case 1: 
			tasse=(float) (taxmax*(1-0.50));
			break;
		case 2:
			tasse=(float) (taxmax*(1-0.35));
			break;
		case 3:
			tasse=(float) (taxmax*(1-0.25));
			break;
		case 4:
			tasse=(float) (taxmax*(1-0.10));
			break;
		default:
			tasse=taxmax;
			break;
		}
		switch (media){
		case 30: 
			tasse=(float) (tasse*(1-0.10));
			break;
		case 29:
			tasse=(float) (tasse*(1-0.08));
			break;
		case 28:
			tasse=(float) (tasse*(1-0.6));
			break;
		case 27:
			tasse=(float) (tasse*(1-0.4));
			break;
		}
	}
	
}
