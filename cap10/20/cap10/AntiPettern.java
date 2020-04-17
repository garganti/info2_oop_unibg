package cap10;

// alcune cose da non fare quando si definiscono i costruttori

class Persona{
	String nome,cognome;
	Persona(String n, String cognome){
		this.nome = n;
		this.cognome = cognome;
	}
	// un altro costruttore che prende solo il cognome e il nome lo lascia vuoto
	// overload del costruttore
	Persona(String cognome){
		this.cognome = cognome; // NO !!!!! 
		this.nome = "";
		// USA INVECE-->
		// this("",cognome);
	}
	// se voglil lasciare i nomie e cognomi vuoti posso avere un terzo costruttore
	// OK ho usato this
	Persona(){ this("","");}

}

class Studente extends Persona{
	int matricola; // OK
	//String nome,cognome; // NOOO altrimenti lo studente avraà due nomi e due cognomi
	
	// 
	Studente(String n, String c, int m){
		// NO non è elegante
		//nome = n; cognome = c; matricola = m;
		// corretta è:
		super(n,c);
		matricola = m;
	}
	
	
	
}


public class AntiPettern {

}
