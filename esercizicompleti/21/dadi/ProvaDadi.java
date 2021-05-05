package dadi;

import java.util.Random;

class Dado {
	protected static Random rnd = new Random();

	protected int lancia() {
		return 1 + rnd.nextInt(6);
	}
}

class DadoTruccato extends Dado {
	// quante volte fa è uscito 6. se < 10
	private int last6 = 10;

	@Override
	protected int lancia() {
		int dado;
		do {
			dado = super.lancia();
		} while (dado == 6 && last6 <= 10);
		if (dado == 6)
			last6 = 0;
		else
			last6++;
		return dado;
	}
}

class DadoConMemoria extends Dado {
	
	int v1 = 0, v2 = 0;
	
	@Override
	protected int lancia() {
		int dado;
		do{
			dado = super.lancia();
		}while(dado == v1 || dado == v2);
		v1 = v2; v2 = dado;
		System.out.print(dado + " ");
		return dado;
	}
}

public class ProvaDadi {

	public static void main(String[] args) {
		Dado d1 = new Dado();
		Dado d2 = new DadoTruccato();
		Dado d3 = new DadoConMemoria();
		int n = 10000, somma1 = 0, somma2 = 0;
		for (int i = 0; i < n; i++) {
			somma1 += d1.lancia();
			somma2 += d2.lancia();
			d3.lancia();
		}
		System.out.println(((double) somma1) / n);
		System.out.println(((double) somma2) / n);
	}

}
