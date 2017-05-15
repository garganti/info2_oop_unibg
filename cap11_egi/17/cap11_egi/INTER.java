package cap11_egi;

public interface INTER {
	// METODI
	void cambioAllenatore();
	//COSTANTI
	static final int durataAllenatore = 20;
	// No campi
	// 
}
class Trapani implements INTER{
	@Override
	public void cambioAllenatore() {
		System.out.println("SERSE VAI VIA");
	}
} 