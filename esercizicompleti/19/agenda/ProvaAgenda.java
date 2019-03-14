package agenda;

import dati.Appuntamento;

public class ProvaAgenda {

	public static void main(String[] args) {
		Agenda a = new Agenda();
		Appuntamento ap = 
				new Appuntamento("lezione info2", "14.3.2019", "11:30", "13:30");
		a.add(ap);
		
		a.add(new Appuntamento("lezione info3", "15.3.2019", "10:00", "11:00"));
		a.visualizza();	}

}
