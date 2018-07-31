package Motorino;

public class Motorino {

	String colore;
	float velocità;
	String tipo;
	boolean antifurto = false;

	Motorino(String colore, String tipo, float velocità) {
		this.colore = colore;
		this.tipo = tipo;
		this.velocità = velocità;
	}

	public float getVelocità() {
		return velocità;
	}

	void accelera(float x) {
		if (antifurto == false)
			velocità += x;
	}
	
	void inserisciAntifurto() {
		antifurto=true;
	}
}
