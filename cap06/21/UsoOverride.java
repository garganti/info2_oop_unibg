import prog.utili.Frazione;

class Persona{	
	public String toString() { return "persona";}	
	//abstract int getSalary();
}

class Studente extends Persona{
	public String toString() { return "einstein";}
	/*@Override
	int getSalary() {
		return 100;
	}*/
}

class Lavoratore extends Persona{
	public String toString() { return "stakanov";}
	//int getSalary() {return 10000;}
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
		
		if (p instanceof Lavoratore) {
			System.out.println("� un lavoratore !!!");
		}
		if (p instanceof Studente) {
			System.out.println("� un studente !!!");
		}
		if (p instanceof Persona) {
			System.out.println("� una persona !!!");
		}
		if (p instanceof Object) {
			System.out.println("� una object !!!");
		}
		
		Frazione f = new Frazione(4);
		if (f instanceof Object) 
			System.out.println("f � un object");
		Object o = new Object();
		if (o instanceof Frazione)
			System.out.println("o � una frazione");
		else 
			System.out.println("o NON � una frazione");
		/*if (f.getClass().equals(Object.class)) {
			
		}*/
		
	}

}
