package cap10_1;

class Studente{
	private String codiceFiscale;
	Studente(String cf){
		codiceFiscale = cf;
	}
	public boolean equals(Studente st) {
		return codiceFiscale.equals(st.codiceFiscale);
	}
}
public class EsempioStrano {
		public static void main(String[] args) {
			Object a = new Studente("GRG");
			Studente b = new Studente("GRG");
			System.out.println(a.equals(b));
		}
		
}
