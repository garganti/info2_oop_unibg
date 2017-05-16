package telecamere;

public class PosizioneOutOfBoundException extends Exception {
	public PosizioneOutOfBoundException() {
		super("La posizione della telecamera deve essere compresa tra 0 e 200");
	}
}
