package dipendente_Es24;

public class Dipendente {

	String nome;
	double stipendio;
	
	public Dipendente(String nome, double stipendio) {
		this.nome=nome;
		this.stipendio=stipendio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public void incrementaStipendio(double perc){
		stipendio+=stipendio*(perc/100);
		//stipendio=stipendio+stipendio*perc/100;
	}
}
