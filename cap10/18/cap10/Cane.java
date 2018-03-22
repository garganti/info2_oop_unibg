package cap10;

public class Cane {
	String nome;
	public Cane(String n) {nome = n;}

	// non è overriding
	//public boolean equals(Cane c) 
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cane) {
			Cane new_name = (Cane) obj;
			return nome.equals(new_name.nome);
		}
		return false;
	}
	public static void main(String[] args) {
		Cane c1 = new Cane("pluto");
		Cane c2 = new Cane("pluto");
		System.out.println(c1.equals(c2));
	}
}
