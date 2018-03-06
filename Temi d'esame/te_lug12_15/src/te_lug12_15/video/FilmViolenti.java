package te_lug12_15.video;

import te_lug12_15.Utente;

// questi film si possono noleggaire solo da
// maggiorenni
public class FilmViolenti extends Video {

	FilmViolenti(String t, String r, int a) {
		super(t, r, a);
	}

	@Override
	public
	void prestaA(Utente u) {
		if (u.isMaggiorenne())
			super.prestaA(u);
		else
			throw new VideoNonAdatto();
	}

}
