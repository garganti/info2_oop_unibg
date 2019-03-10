package cap09_classi;

import prog.utili.SequenzaOrdinata;

/** rappresenta un gruppo di studenti
 */
public class GruppoStudenti {

	// memorizzare il nome degli studenti in ordine alfabetico
	SequenzaOrdinata<String> nomi;
	// campo a comune tra tutte le istanze
	static String intestazione = "----------\n";
	
	public GruppoStudenti(){
		nomi = new SequenzaOrdinata<String>();
	}
	public void addStudente(String nome) {
		nomi.add(nome);
	}
	@Override
	public String toString() {
		return intestazione +nomi.toString();
	}
	public static void main(String[] args) {
		GruppoStudenti ingInf1A = new GruppoStudenti();
		ingInf1A.addStudente("piero");
		System.out.println(ingInf1A);
		GruppoStudenti ingInf2A = new GruppoStudenti();
		ingInf2A.addStudente("paolo");
		System.out.println(ingInf2A);
		
		System.out.println(ingInf1A.intestazione);
		System.out.println(ingInf2A.intestazione);
		ingInf1A.intestazione = "***" + ingInf1A.intestazione; 
		System.out.println(ingInf1A.intestazione);
		//
		System.out.println(ingInf2A.intestazione);
		
		
	}
}
