package ospedale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paziente {

	String nome, cognome, CF;
	Date datanascita;
	char genere;
	int numletto;
	
	List<Medicina> elencoMedicine = new ArrayList<>();
	
	Paziente(String nome, String cognome, String CF, Date datanascita, char genere){
		this.nome=nome;
		this.cognome=cognome;
		this.CF=CF;
		this.datanascita=datanascita;
		this.genere=genere;
	}
	
	public char getGenere() {
		return genere;
	}
	
	public void setNumletto(int numletto) {
		this.numletto = numletto;
	}
	
	public int getNumletto() {
		return numletto;
	}
	
	public String getCF() {
		return CF;
	}
	
	void aggiungiMedicina(Medicina m){
		elencoMedicine.add(m);
	}
	
	public List<Medicina> getElencoMedicine() {
		return elencoMedicine;
	}
}
