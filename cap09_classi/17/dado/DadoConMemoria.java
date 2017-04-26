package dado;

import java.util.Random;

// dado a N facce tale che 
// ogni lancio è diverso dal precedente
public class DadoConMemoria {

	static Random rnd = new Random();

	int nFacce;
	
	int ultimoNumero; // ultimo numero uscito
	
	public DadoConMemoria(int n) {
		nFacce = n;
		ultimoNumero = 0;
	}
	public DadoConMemoria(){
		this(6);
	}
	// restituisce un valore a caso tra 1 e 6
	public int lancio() {
		int nn;
		for(;;){
			nn = 1 + (int)(Math.random()*nFacce);
			if (nn!= ultimoNumero) break;
		}
		ultimoNumero = nn;
		return nn;
	}

	public static void main(String[] args) {
		DadoConMemoria miod = new DadoConMemoria(10);
		DadoConMemoria dadoPC = new DadoConMemoria();
		for (int i = 0; i < 100; i++) {
			System.out.print(miod.lancio());
			System.out.print(" ");
			System.out.println(dadoPC.lancio());
		}
	}

}
