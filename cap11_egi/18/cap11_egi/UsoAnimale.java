package cap11_egi;

interface Animale {
	static final int NUMERO_ZAMPE_MIN = 2; 
	// metodo che restuisce il verso dell'animale
	String verso();
}
class Cane implements Animale{
	@Override
	public String verso() {
		return "baubau";
	}	
}

public class UsoAnimale{
	
	public static void main(String[] args) {
		Animale a = new Cane();
		
	}
	
}
