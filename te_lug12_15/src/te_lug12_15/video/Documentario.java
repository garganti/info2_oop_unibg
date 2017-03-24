package te_lug12_15.video;

// video di documentari
// ha anche un tema specifico
public class Documentario extends Video{

	private Tema tema;
	
	Documentario(String t, String r, Tema te, int anno) {
		super(t, r, anno);
		tema = te;
	}

	@Override
	public String toString() {
		return super.toString() + " tema:" + tema.descrizione;
	}

}

enum Tema{
	NATURA("socumentario naturalistico"),
	ATTIVITAUMANE("grattacieli o opere  umane"),
	STORIA("eventi storici");
	String descrizione;
	Tema(String d){
		descrizione = d;
	}
			
}