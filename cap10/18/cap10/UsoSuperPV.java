package cap10;

class Persona{
	@Override
	public String toString() {
		return "NOME COGNOME";
	}
}

class Studente extends Persona{
	@Override
	public String toString() {
		//return "NOME COGNOME MATRICOLA";
		return super.toString() + " MATRICOLA";
	}
	
}

public class UsoSuperPV {

}
