import java.util.Vector;

import prog.utili.Data;
import prog.utili.SequenzaOrdinata;
// confronto in ordine alfebetico
public class Studente implements Comparable<Studente>{
	
	// CAMPI
	long matricola;
	String nome;
	String cognome;
	Data ddn;
	Vector<Integer> voti;

	// COSTRUTTORI
	// costruttuttore che prende una unica stringa che contiene tutt i dati
	// in questo formato
	// nome;cognome;matricola;d/m/anno;
	public Studente(String stadstring) {
		String[] dati = stadstring.split(";");
		nome = dati[0];
		cognome = dati[1];
		matricola = Long.parseLong(dati[2]);
		String[] gdin = dati[3].split("/");
		int giorno = Integer.parseInt(gdin[0]);
		int mese = Integer.parseInt(gdin[1]);
		int anno = Integer.parseInt(gdin[2]);
		ddn = new Data(giorno,mese,anno);
		voti = new Vector<>();
	}
	// METODI
	public String toString() {
		return cognome + "  " + nome + " " + matricola + 
				" nato il "+ ddn.toString() +  " voti " + voti.toString(); 
	}
	
	public void addVoto(int v){
		voti.add(v);
	}
	
	
	public static void main(String[] args) {
		Studente s = new Studente("piero;rossi;9000;10/08/1997");
		System.out.println(s.toString());
		s.addVoto(30);
		System.out.println(s.toString());
		SequenzaOrdinata<Studente> classe = new SequenzaOrdinata<>();
		classe.add(s);
		classe.add(new Studente("andrea;previtali;9800;10/9/1978"));
		classe.add(new Studente("fulvio;adobati;9800;10/9/1978"));
		for(Studente g: classe){
			System.out.println(g);
		}
	}
	@Override
	public int compareTo(Studente o) {
		return this.cognome.compareTo(o.cognome);
	}

}
