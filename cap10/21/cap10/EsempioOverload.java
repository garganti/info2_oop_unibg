package cap10;

class Veicolo{
	String id; // numero telaio
	
	void stop() {System.out.println("stop");}
}
class Auto extends Veicolo {
	String targa;// targa in aggiunta ad id

	// Overloading
	void stop(int metri){
		System.out.println("stop in metri "+ metri);}
	
	// overloading nella stessa classe
	void accelera() {}
	void accelera(long h) {}
}


public class EsempioOverload {

}
