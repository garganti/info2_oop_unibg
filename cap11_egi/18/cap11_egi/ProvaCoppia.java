package cap11_egi;

class Coppia<E, F> {

	E sinistro;
	F destro;

	Coppia(E s, F d){
		sinistro = s;
		destro = d;
	}
	
	E getSinistro(){
		return sinistro;
	}
	
}

public class ProvaCoppia {

	public static void main(String[] args) {
		Coppia<String, Integer> squadraPunti = 
				new Coppia<>("atalanta",47);
		Coppia<String,String> nomeCognome = new Coppia<>("piero","rossi");
		Coppia<Integer,Double> numeri = new Coppia<>(4, 7.9);
	}
}
