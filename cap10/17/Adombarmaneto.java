class Persona{
	String nome;
}
class Studente extends Persona{
	// NOOOOOOOOOOOOOO String nome;
	int matricola;
}

class AAA{
	int k = 10;
}
class AAI extends AAA{
	int k = 20;
	void foo(){
		System.out.println(k);
		System.out.println(super.k);
	}
}
public class Adombarmaneto {
public static void main(String[] args) {
	new AAI().foo();
}
}
