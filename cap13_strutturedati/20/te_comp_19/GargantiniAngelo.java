package te_comp_19;
class Persona implements Comparable<Persona>{
	String nome;
	public Persona(String string) {
		nome = string;
	}
	@Override
	public int compareTo(Persona o) {
		return nome.compareTo(o.nome);
	}
}

class AlberoPersone{
	NodoAlbero root;
	class NodoAlbero{
		Persona dato;
		AlberoPersone sx, dx;
	}
	
	public AlberoPersone() {
		root = null;
	}
	
	void insert(Persona p) {
		if (root == null) {
			root = new NodoAlbero();
			root.dato = p;
			root.sx = new AlberoPersone();
			root.dx = new AlberoPersone();
		} else {
			if (root.dato.compareTo(p) <0) {
				root.dx.insert(p);
			} else {
				root.sx.insert(p);
			}
		}
	
	}
	void print(){
		
	}
	
}

public class GargantiniAngelo {

	public static void main(String[] args) {
		AlberoPersone ap = new AlberoPersone();
		ap.insert(new Persona("pippo"));
		ap.insert(new Persona("annah"));
		ap.insert(new Persona("balli"));
		ap.insert(new Persona("manni"));
		
	}
	
}
