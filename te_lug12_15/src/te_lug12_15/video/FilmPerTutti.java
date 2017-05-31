package te_lug12_15.video;

import prog.utili.Data;

public class FilmPerTutti extends Video {

	public FilmPerTutti(String t, String r, int a) {
		super(t, r,a);
	}
	// file per tutti di quest'anno
	public FilmPerTutti(String t, String r) {
		this(t, r, new Data().getAnno());
	}

}
