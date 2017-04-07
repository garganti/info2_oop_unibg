
public class Automobile {
	String targa;
	int numeroIncidenti;	
	String marca;

	// 0 incdicenti
	public Automobile(String t, String m) {
		targa = t;
		marca = m;
		numeroIncidenti = 0;
	}
	// già incidentato n volte
	public Automobile(String t, String m, int n) {
		targa = t;
		marca = m;
		numeroIncidenti = n;
	}
	
	// aggiunge un incidente all'automobile
	public void incIncidenti(){
		numeroIncidenti ++;
	}
	
	@Override
	public String toString() {
		return marca + " targata "+ targa + " incidenti:"+numeroIncidenti;
	}
	
	public static void main(String[] args) {
		Automobile a = new Automobile("AA567JK","fiat brava");
		System.out.println(a);
		a.incIncidenti();
		System.out.println(a);		
	}
	
}
