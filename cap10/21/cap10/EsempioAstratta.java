package cap10;

abstract class Figura{
	Figura(){System.out.println("costruisco la figura");}
}

class RettangoloScaleno extends Figura{
	
}
public class EsempioAstratta {
	
	public static void main(String[] args) {
		// NOFigura f = new Figura();
		RettangoloScaleno f = new RettangoloScaleno();
	}

}
