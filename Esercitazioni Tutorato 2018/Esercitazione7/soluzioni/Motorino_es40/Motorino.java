package Motorino;

public class Motorino {

	String colore;
	float velocitÓ;
	String tipo;
	boolean antifurto = false;

	Motorino(String colore, String tipo, float velocitÓ) {
		this.colore = colore;
		this.tipo = tipo;
		this.velocitÓ = velocitÓ;
	}

	public float getVelocitÓ() {
		return velocitÓ;
	}

	void accelera(float x) {
		if (antifurto == false)
			velocitÓ += x;
	}
	
	void inserisciAntifurto() {
		antifurto=true;
	}
}
