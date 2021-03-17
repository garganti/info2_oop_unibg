import prog.utili.Frazione;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

// NO in java class StudenteLavoratore extends Studente, Lavoratore{}
// mentre in C++

public class UsoSottoclassi {
	
	public static void main(String[] args) {
		Persona piero = new Persona();
		// ...
		piero = new Studente();
		
		//piero = "Piero";
		
		//Studente pieroS = (Studente) piero;
		
		Object o = new Frazione(1);
		
		Number n = new Integer(6);
		
		Rettangolo r = new Quadrato(6);
		
		//Frazione f = new Object();
		
		//Cerchio c = new Rettangolo();
		
		Object o2 = new Quadrato(7);
		
		//
		Object o3 = n;
		
		Object o4 = r.toString();
		// NO o4.toUpperCase();
		
		String s = "pippo";
		String t = "paolo";
		s.equals(t); // s == t 
		
		Rettangolo q = new Rettangolo(0, 0);
		r.equals(q);
		
	}

}
