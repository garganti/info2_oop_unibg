package multimedia;

public class Filmato extends RegistrazioneAudio{
	
	private static final String ASTERISCHI = "*****************";
	
	private int luminosita = 5;

	public Filmato(String t, int durata) {
		super(t, durata);
	}

	@Override
	public void play() {
		for(int i = 0; i < durata; i++) {
			System.out.println(titolo + 
					PUNTI_ESCLAMATIVI.substring(0,volume+1)+
					ASTERISCHI.substring(0,luminosita+1));
		}
	}

	
	
	void brighter(){} 
	void darker(){}
	
	
	
}
