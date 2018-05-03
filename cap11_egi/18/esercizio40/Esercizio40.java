package esercizio40;

class Motorino {
	private String colore;
	private String tipo;
	private boolean antifurto;
	protected float velocita;

	Motorino(String colore, String tipo, float velocita) {
		this.colore = colore;
		this.tipo = tipo;
		this.velocita = velocita;
		antifurto = false;
	}

	float getVelocita() {
		return velocita;
	}

	void accelera(float d) {
		if (!antifurto)
			velocita += d;
	}

	void inserisciAntifurto() {
		antifurto = true;
	}
}

class MotorinoImmatricolato extends Motorino {
	float maxVelocita;
	String targa;

	MotorinoImmatricolato(String colore, 
			String tipo, float velocita, 
			float maxVelocita, String targa){
		super(colore, tipo, velocita);
		this.maxVelocita = maxVelocita;
		this.targa = targa;
	}
	@Override
	void accelera(float d) {
		velocita = Math.min( velocita + d, maxVelocita);
	}
}

public class Esercizio40 {
	
	public static void main(String[] args) {
		Motorino m1 = new Motorino("", "NON IMMATRICOLATO", 0);
		MotorinoImmatricolato m2 = 
				new MotorinoImmatricolato("", "IMMATRICOLATO 2", 0,50,"RRRR");
		Motorino m3 = 
				new MotorinoImmatricolato("", "IMMATRICOLATO 3", 0,50,"RRRR");
		System.out.printf("%f %f %f\n",m1.getVelocita(),m2.getVelocita(),m3.getVelocita());
		m1.accelera(10);
		m2.accelera(10);
		m3.accelera(10);
		System.out.printf("%f %f %f\n",m1.getVelocita(),m2.getVelocita(),m3.getVelocita());
		m1.accelera(100);
		m2.accelera(100);
		m3.accelera(100);
		System.out.printf("%f %f %f\n",m1.getVelocita(),m2.getVelocita(),m3.getVelocita());
	}

}
