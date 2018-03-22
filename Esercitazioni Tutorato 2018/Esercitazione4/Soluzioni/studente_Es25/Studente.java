package studente_Es25;

public class Studente {

	String nome;
	String cognome;
	int[] voti = new int[5];
	String residenza;
	
	
	public Studente(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		for (int i=0;i<voti.length; i++)
			voti[i]=0;
	}
	
	public Studente(String nome, String cognome, String residenza) {
		this(nome,cognome);
		this.residenza=residenza;
	}
	
	public void addVoto(int pos, int value) {
		voti[pos]=value;
	}
	
	public double calcolaMedia() {
		int somma=0;
		int count=0;;
		for (int i=0; i<voti.length; i++)
			if (voti[i]!=0) {
				somma+=voti[i];
				count++;
			}
		return somma/count;
	}
	
	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	
	public String getResidenza() {
		return residenza;
	}
	
}
