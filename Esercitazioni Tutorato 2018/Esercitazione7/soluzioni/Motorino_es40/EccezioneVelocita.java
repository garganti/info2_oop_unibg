package Motorino;

public class EccezioneVelocita extends Exception{
	
	public EccezioneVelocita(float velocita) {
		super("La massima velocità è inferiore alla velocità, può essere minimo "+velocita + " km/h");
	}

}
