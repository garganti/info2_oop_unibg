package telecamere;

public class Telecamera implements Comparable<Telecamera>{

	private int stato; // 0 => spento, 1 => acceso, -1 => blocco
	int ID;
	private String descrizione;
	private double posizione;
	
	static int numeroTelecamere = 0;
	
	public Telecamera(String d, double p) {
		descrizione = d;
		posizione =p;
		stato = 0; // inizilamente spenta
		ID = numeroTelecamere;
		numeroTelecamere ++;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "ID : " + ID;
		result += "al km" + posizione;
		result += " " + descrizione;
		switch (stato) {
		case 0:
			result += "spenta";
			break;
		case 1:
			result += "accesa";
			break;
		case -1:
			result += "blocco";
			break;
		default:
			result += "ERRORE";
			break;
		}
		return result;
	}
	
	public void spegni(){
		stato = 0;
	}

	public void accendi(){
		stato = 1;
	}
	

	@Override
	public int compareTo(Telecamera o) {
		return Double.compare(this.posizione, o.posizione);
	}
	
	
	
}
