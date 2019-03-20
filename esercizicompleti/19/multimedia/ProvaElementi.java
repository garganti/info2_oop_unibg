package multimedia;

public class ProvaElementi {

	public static void main(String[] args) {
		ElementoMultimediale myPlayList[] = {
				new RegistrazioneAudio("Psycho", 3),
				new Filmato("Green Book", 3)
		};
		((Riproducibile) myPlayList[0]).play();
		((RegistrazioneAudio) myPlayList[0]).weaker();
		((RegistrazioneAudio) myPlayList[0]).weaker();
		((RegistrazioneAudio) myPlayList[0]).weaker();
		((RegistrazioneAudio) myPlayList[0]).play();
		((Riproducibile) myPlayList[1]).play();
		
	}
	
}
