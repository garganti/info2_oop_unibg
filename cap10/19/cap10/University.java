package cap10;

class Persona{ String nome; 
	Persona(String n){
		nome = n;}
	void sp() {System.out.println(nome);}
}
class Studente extends Persona {String corso;
	Studente(String n, String c){
		super(n); 
		corso = c;
	}
	String dati(int h) {return nome + corso;}
}
class StudenteUniv extends Studente{
	long matricola;
	StudenteUniv(String n, String c, long m){
		super(n,c); 
	}
	StudenteUniv(String n, String c){
		this(n,c,0);
	}
	//@Override
	String dati(int h) {return String.valueOf(matricola);}
	
}
public class University {

	public static void main(String[] args) {
		StudenteUniv piero = new StudenteUniv("piero", "ing inf", 789900);
		piero.sp();
	}
}
