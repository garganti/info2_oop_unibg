package cap10;
// classe animale che rappresenta gli animali 
// che possono essere o Gatti o Cani 
// non voglio animali che non siamo ne gatti ne cani
abstract class Animale{
	// tutti gli animali hanno un nome
	private String nome;
	protected Animale(String na){nome = na;}
	
	abstract public String verso();
}
class Gatto extends  Animale{ Gatto(String ng){super(ng);}}
class Cane extends Animale{Cane(String ng){super(ng);}}

public class UsoAbstract {

	public static void main(String[] args) {
		Animale n = new Animale();
	}
	
}
