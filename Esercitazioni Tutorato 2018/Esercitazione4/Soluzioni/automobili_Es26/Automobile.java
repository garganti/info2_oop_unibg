package automobili_Es26;

public class Automobile {

	int id;
	int km;
	
	public Automobile(int id, int km) {
		this.id=id;
		this.km=km;
	}
	
	
	public boolean isMaggioreKm(Automobile a) {
		if (this.km>a.km)
			return true;
		else
			return false;
	}
	
	public boolean isMinoreKm(Automobile a) {
		if (this.km<a.km)
			return true;
		else
			return false;
	}
	
}
