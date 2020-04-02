
public class Studente {
	int matricola;
	String nome;
	
	static int numeroStudentiImmatricolati = 0;
	
	Studente(String n){
		this.nome = n;
		// assegna matircola e increment il numero di stduenti ..
		matricola = ++ numeroStudentiImmatricolati;
	}

	@Override
	public String toString() {
		return matricola + " " + nome;		
	}
	
	public static void main(String[] args) {
		Studente a = new Studente("Aless");
		System.out.println(a);
		a = new Studente("Angelo");
		System.out.println(a);
		a = new Studente("Giuseppe");
		System.out.println(a);
	}
}
