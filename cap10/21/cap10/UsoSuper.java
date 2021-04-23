package cap10;

class Persona2{
	String name;
	String getData() { return("person name");}
}

class Studente2 extends Persona2{
	String name; //--> cattiva pratica: 2 name NON FARE 
	// overriding
	String getData() { return("student matricola");}
	
	@Override
	public String toString() {
		// return getData(); --> getData di studente2
		//return super.getData(); // getData di Persona2
		return super.getData() + " " + this.getData();
	}
}

public class UsoSuper {
	public static void main(String[] args) {
		Studente2 s = new Studente2();
		System.out.println(s.toString());
	}

}
