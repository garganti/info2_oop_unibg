package acquario_Es27;

public class Pesce{

	String id;
	int eta;
	int profondita;
	
	public Pesce(String id, int eta, int profodinta) {
		this.id=id;
		this.eta=eta;
		this.profondita=profodinta;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "ID " + id + " età " + eta + " profondità " + profondita;
	}
}
