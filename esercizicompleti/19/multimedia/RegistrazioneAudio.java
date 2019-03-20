package multimedia;

public class RegistrazioneAudio 
	extends ElementoMultimediale implements Riproducibile{

	protected static final String PUNTI_ESCLAMATIVI = "!!!!!!!!!!!!!";
	private static final int VOLUME_INIZIALE = 2;
	private static final int VOLUME_MASSIMO = 10;
	protected final int durata;
	protected int volume; // NO final perchè può cambiare
	
	public RegistrazioneAudio(String t, int durata) {
		super(t);
		this.durata = durata;
		this.volume = VOLUME_INIZIALE;
	}
	@Override
	public int durata() {return durata;}
	@Override
	public void play() {
		for(int i = 0; i < durata; i++) {
			System.out.println(titolo + PUNTI_ESCLAMATIVI.substring(0,volume+1));
		}
	}
	public void weaker() {
		volume = volume >0 ? volume -1: 0; 
	}
	public void louder() {
		volume = volume < VOLUME_MASSIMO ? volume +1: volume; 		
	}
	
}
