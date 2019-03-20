package cap10;

class Persona{   void setName(String n) {}}

class Cantante extends Persona {
	void setName(String n) /*throws Exception */{
		if (n.length() < 10) throw new RuntimeException();
	} 
}
public class UsoEcc {
	public static void main(String[] args) {
		Persona p = new Cantante();
		p.setName("A");
	}

}
