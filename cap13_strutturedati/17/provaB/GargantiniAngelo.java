package provaB;

class Studente{ int m;}

class AlberoStudenti{
	
	class NodoAlbero{
		Studente dato;
		AlberoStudenti sx;
		AlberoStudenti dx;
	}
	
	NodoAlbero root;
	
	public AlberoStudenti() {
		root = null;
	}
	
	void insert(Studente s){
		if (root == null){
			NodoAlbero t = new NodoAlbero();
			t.dato = s;
			t.sx = new AlberoStudenti();
			t.dx = new AlberoStudenti();
			root = t;
		} else{
			if (root.dato.m < s.m){
				// root < s
				root.dx.insert(s);
			} else{
				root.sx.insert(s);
			}
		}
	}
	
	void print(){
		if (root == null) return;
		root.sx.print();
		System.out.println(" "+ root.dato.m);
		root.dx.print();
	}
	
	//find(){}
}

public class GargantiniAngelo {
	public static void main(String[] args) {
		AlberoStudenti a = new AlberoStudenti();
		Studente s1 = new Studente();
		s1.m= 100000;
		Studente s2 = new Studente();
		s2.m= 100200;
		Studente s3 = new Studente();
		s3.m= 100300;
		a.insert(s1);
		a.insert(s2);
		a.insert(s3);
		// stampèo albero
		a.print();
		
	}
	
}
