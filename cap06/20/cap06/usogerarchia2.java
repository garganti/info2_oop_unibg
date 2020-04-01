package cap06;
interface EssereVivente{ int eta();} 
abstract class Persona{  abstract int getSalario();  String name () {return "yyy";}}

class Lavoratore extends Persona{
	int getSalario() {return 2000;} 
}  
class Studente extends Persona implements Comparable<Studente>{
	int getSalario() {return 0;} 
	@Override
	public int compareTo(Studente o) {return 0;}	
}
class StudenteTriennale extends Studente{}

public class usogerarchia2 {
	
	public static void main(String[] args) {
		Persona p = new Studente();
		// NO Studente s = new Lavoratore()
		Studente s = new StudenteTriennale();
		// StudenteTriennale st = new Studente();
		Object o = new Studente(); // cast non è ncessario
		Object os = new String("ddd");
		// CAST
		Studente so = (Studente)o;
		//Studente piero = (Studente)"piero" // NO
		Studente sp = (Studente)p;
		Studente piero0 = (Studente)((Object)sp);
		//Studente piero = (Studente)((Object)"piero");
		
		Studente ssso = (StudenteTriennale) new Object();
		
	}
	

}
