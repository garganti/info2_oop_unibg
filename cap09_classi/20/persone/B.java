package persone;
import persone.prova.*;
import persone.prova2.*;

class Persona{}

class Studente{}

class B{
	public static void main(String[] args) {
		//persone.prova.A a = new A(); 
	}
	
	int k; // vis. di package
	
	private int h;
	
	private void mooo() {
		this.h = 20;
		B b = new B();
		b.h = 100;
	}
	
}