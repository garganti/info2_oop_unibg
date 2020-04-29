package cap10;
class Finestra{
	static final int NUMERO_LATI = 12;
/*	static final int NUMERO_LATI;
	static {
		int h = 90;
		NUMERO_LATI = h; 
	}*/	
	final int numerodiVetri;	
	Finestra(int nv){
		numerodiVetri = nv;
	}	
}

public class UsoFinal {
	
	public static void main(String[] args) {
		Finestra f1 = new Finestra(2);
		Finestra f2 = new Finestra(3);
		System.out.println(f1.numerodiVetri + "  " + f2.numerodiVetri);
		System.out.println(f1.NUMERO_LATI + "  " + f2.NUMERO_LATI);
		
		
		
		final int x;
		if (Math.random() > 0.5) x = 90;
		else x = 9;
		
		
	}

}


final class FinestraAVetri extends Finestra{
	FinestraAVetri(int nv) {
		super(nv);
	}}

//class FinestraAVetriDoppi extends FinestraAVetri{
//	FinestraAVetriDoppi(int nv) {
//		super(nv);
//	}}



