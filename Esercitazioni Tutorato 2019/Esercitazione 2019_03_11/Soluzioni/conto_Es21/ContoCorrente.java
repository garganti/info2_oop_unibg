package conto_Es21;

public class ContoCorrente {
	
	String numeroconto;
	String nomeProprietario;
	double importo;
	
	public ContoCorrente(String numeroconto, String nomeProprietario, double importo) {
		this.numeroconto=numeroconto;
		this.nomeProprietario=nomeProprietario;
		this.importo=importo;
	}
	
	
	public double preleva(double prelievo) {
		return importo-prelievo;
	}
	
	public double ricarica(double impricarica) {
		return importo+impricarica;
	}
	
	public double calcolaInteressi(double percentuale){
		return importo*percentuale/100;
	}
	

	//generare automaticamente i metodi get e set:
	// Source --> Generate getters and setters
	
	public String getNumeroconto() {
		return numeroconto;
	}

	public void setNumeroconto(String numeroconto) {
		this.numeroconto = numeroconto;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}
	

	
	
	
}
