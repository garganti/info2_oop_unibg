package cap10;

import javax.swing.text.LabelView;

class StudenteFinal{
	// campo final
	final int matricola;
	// campo static final: COSTANTE
	final static int MAX_VOTO = 30;
	
	StudenteFinal(int m){
		matricola = m;
	}
	
	final void stampaMatricola() {System.out.println(matricola);}
	
	public double getVotoMax() {
		// variabile locale final
		final int maxvoto;
		maxvoto = 10;
		//maxvoto = 20;
		return 0;
	}
}

class StudenteMoltoBravo extends StudenteFinal{

	StudenteMoltoBravo(int m) {
		super(m);
	}
	// ERRORE: è final void stampaMatricola() {System.out.println(matricola*2);}
}

final class Lavoratore{}

// ERRORE non posso fare sotto classi:
// class LavoratoreDomenicale extends Lavoratore{} 

//class MyString extends String{}

public class UsoFinal {
	public static void main(String[] args) {
		StudenteFinal sf = new StudenteFinal(10);
		sf.matricola = 30;
		StudenteFinal sf2 = new StudenteFinal(100000);
	}

}
