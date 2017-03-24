import java.util.StringTokenizer;

import prog.utili.Frazione;

/*Scrivi un metodo statico che data una stringa che contiene 
 * una sequenza di Frazioni restituisce la frazione più 
 * vicina a zero. Il formato della stringa è il seguente “n1:d1;n2:d2;...” dove ni è il numeratore dell'i-esima frazione e d-i il denominatore. 
Non memorizzare le frazioni. Fai due versioni una con StringTokenizer e l'altra con split 
Scrivi un main che legge da console chiama il metodo e stampa il risultato
Esempio. “1:2;5:4;3:1”; → ½*/
public class Esercizio1 {

	static Frazione piuVicinaAZero(String fs){
		// 
		Frazione zero = new Frazione(0);
		Frazione piuVicinaaZero = null;
		// 
		StringTokenizer frazioni = new StringTokenizer(fs,";");
		while(frazioni.hasMoreTokens()){
			// prendi una frazione
			String fraz = frazioni.nextToken();
			// dividi denominatore e numeratore
			StringTokenizer parti = new StringTokenizer(fraz,":");
			// prendi il numeratore
			int numeratore = Integer.parseInt(parti.nextToken());
			int denominatore = Integer.parseInt(parti.nextToken());
			// costruisci frazione
			Frazione corrente = new Frazione(numeratore,denominatore);
			if (piuVicinaaZero == null){
				piuVicinaaZero = corrente;
				continue;
			}
			// calcolo differenza rispetto zero
			Frazione differenza = corrente.meno(zero);
			// if diff < (piuVIcina -0)
			if (differenza.isMinore(piuVicinaaZero.meno(zero))){
				piuVicinaaZero = corrente;
			}
		}
		return piuVicinaaZero;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(piuVicinaAZero("1:2"));
		System.out.println(piuVicinaAZero("1:3;7:8;9:45"));
		System.out.println(piuVicinaAZero("1:2;0:7"));

	}

}
