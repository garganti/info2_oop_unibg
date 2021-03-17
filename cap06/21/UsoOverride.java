class Persona{	
	public String toString() { return "persona";}
}

class Studente extends Persona{
	public String toString() { return "einstein";}
}

class Lavoratore extends Persona{
	public String toString() { return "stakanov";}

}


public class UsoOverride {
	
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println(p);
		//
		p = new Studente();
		System.out.println(p.toString());

		p = new Lavoratore();
		System.out.println(p.toString());
		
		
	}

}
