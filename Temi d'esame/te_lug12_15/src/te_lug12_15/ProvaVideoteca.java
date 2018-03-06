package te_lug12_15;

import te_lug12_15.video.FilmPerTutti;

public class ProvaVideoteca {

	public static void main(String[] args) {
		Videoteca v = new Videoteca();
		FilmPerTutti fpt = new FilmPerTutti("Via col vento", "Glenn", 1956);
		v.insertVideo(fpt);
		v.printVideo();
	}

}
