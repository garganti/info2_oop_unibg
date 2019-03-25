package negozi_Es30;

public class Prodotto {

	static int counter=1;
	int id;
	int qta;
	double prezzo;
	
	public Prodotto(int qta, double prezzo) {
		this.id=counter;
		counter++;
		this.qta=qta;
		this.prezzo=prezzo;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setQta(int qta) {
		this.qta = qta;
	}
	
	public int getQta() {
		return qta;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		return id + " " + qta + " "+ prezzo;
	}
	
	
}
