package menu_Es33;

public class Piatto {
	private int id;
	private int qta;
	private double prezzo;

	public Piatto(int id, int qta, double prezzo) {
		this.id=id;
		this.qta = qta;
		this.prezzo = prezzo;
	}

	public int getQta() {
		return qta;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setQta(int qta) {
		this.qta = qta;
	}
	
	@Override
	public String toString() {
		return id + " " + qta + " "+ prezzo;
	}
}
