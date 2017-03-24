package te_lug12_15;

import java.util.ArrayList;

import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;
import te_lug12_15.video.Video;

// gestisce i video e gli utenti della videteca
public class Videoteca {

	SequenzaOrdinata<Video> video;
	
	ArrayList<Utente> utenti;
	
	public Videoteca() {
		video = new SequenzaOrdinata<Video>();
		utenti = new ArrayList<Utente>();
	}
	
	void inserisciUtente(Utente u){
		utenti.add(u);
	}
	
	/** 
	 * inserisci un video in videoteca
	 */
	void insertVideo(Video v){
		video.add(v);
	}
	/**
	 * assegna il prestito ad un utente
	 * @param v
	 * @param utenteID
	 */
	void prestaA(Video v, int utenteID){
		for(Utente u: utenti){
			if (u.getId() == utenteID){
				v.prestaA(u);
				return;
			}
		}
		System.out.println("utente non trovato");
	}
	
	
	/**
	 * stampa a console i video della videoteca
	 */
	void printVideo(){
		for (Video v: video){
			System.out.println(v);
		}
	}
	
	
	
	
}
