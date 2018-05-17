package dipendenti_Es37;

public class Main {
	public static void main(String[] args) {
		Dipendente d = new Dipendente("Angelo","Gargantini", 200, 5);
		DipendenteResponsabile dResp = new DipendenteResponsabile("Silvia", "Bonfanti", 160, 10, 100);
		
		System.out.println(d.getStipendio()+" "+dResp.getStipendio());
	}
}
