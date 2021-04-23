import java.util.ArrayList;
import java.util.List;

// esempio di gestione ID
// con controllo di univocità e overload del costruttore
class Letto{
	int id;
	static int numero_letti = 0;
	static List<Integer> id_creati = new ArrayList<>();
	
	Letto(){
		this(numero_letti);
		numero_letti++;
	}
	// overload del costrutto con ID passato dall'esterno
	Letto(int id){
		if (id_creati.contains(id))
			throw new RuntimeException("id già usato");
		this.id = id;
		id_creati.add(id);
	}
	
	
	@Override
	public String toString() {
		return "letto " + id;
	}
	
}


public class ProvaID {
	
	public static void main(String[] args) {
		Letto l1 = new Letto();
		Letto l2 = new Letto();
		System.out.println(l1);
		System.out.println(l2);
		Letto l3 = new Letto(50);
		System.out.println(l3);
		
	}
	

}
