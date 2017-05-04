class Studente{
	//int media(){return 30;}
	// voglio vietrare overriding:
	final int media(){return 30;}
}
// non posso perchè il metodo media è final
class StudenteLM extends Studente{
	int media(){return 37;}	
}

// non posso perchà string è final
class MyString extends String{}

final class K{}
// non posso perchè la classe K è final
class H extends K{}

public class FinalMetodi {
	public static void main(String[] args) {
		Studente s = new StudenteLM();
		System.out.println(s.media());
	}
}
