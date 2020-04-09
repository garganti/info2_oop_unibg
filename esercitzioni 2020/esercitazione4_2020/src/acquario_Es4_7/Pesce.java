package acquario_Es4_7;

public class Pesce{

	private String id;
	private int eta;
	private int profondita;
	
	public Pesce(String id, int eta, int profodinta) {
		this.id=id;
		this.eta=eta;
		this.profondita=profodinta;
	}
	
	public String toString() {
		return "ID " + getId() + " età " + eta + " profondità " + profondita;
	}

	public String getId() {
		return id;
	}
}
