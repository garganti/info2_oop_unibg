package Motorino;

public class MotorinoImmatricolato extends Motorino {

	float maxVelocità;
	String targa;

	MotorinoImmatricolato(String colore, String tipo, float velocità, float maxVelocità, String targa) throws EccezioneVelocita {
		super(colore, tipo, velocità);
		if (maxVelocità<velocità)
			throw new EccezioneVelocita(velocità);
		this.maxVelocità = maxVelocità;
		this.targa = targa;
	}

	public void getMax() {
		System.out.println(maxVelocità);
	}

	void accelera(float x) {
		float s = velocità + x;
		if (antifurto == false)
			if (s < maxVelocità)
				velocità = s;
			else
				velocità = maxVelocità;
	}

}
