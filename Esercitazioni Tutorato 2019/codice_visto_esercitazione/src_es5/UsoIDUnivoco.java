// esempio di come settare in modo univoco un ID
class Persona{
	private static int nPersoneCreate = 0;
	private int id;
	private String nome;
	Persona(String nome){id = nPersoneCreate++; this.nome = nome;}
	public String toString() {return id + ":" + nome;}
}
public class UsoIDUnivoco {
	public static void main(String[] args) {
		Persona p1 = new Persona("piero");
		Persona p2 = new Persona("paolo");
		Persona p3 = new Persona("giovanni");
		System.out.println(p1 + "\n" + p2 + "\n" + p3);
	}

}
