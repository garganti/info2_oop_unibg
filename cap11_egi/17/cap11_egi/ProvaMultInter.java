package cap11_egi;

interface Furgone {
	int getNumeroRuote();
}
interface Negozio{
	String nomeNegozio();
}
class Formaggiaio implements Furgone, Negozio{
	@Override
	public String nomeNegozio() {
		return "formaggiaio";
	}
	@Override
	public int getNumeroRuote() {
		return 6;
	}
	
}
abstract class FurgoneAC {
	abstract int getNumeroRuote();
}
abstract class NegozioAC{
	abstract String nomeNegozio();
}
class FormaggiaioAC extends FurgoneAC, NegozioAC{
	
}

public class ProvaMultInter {

}
