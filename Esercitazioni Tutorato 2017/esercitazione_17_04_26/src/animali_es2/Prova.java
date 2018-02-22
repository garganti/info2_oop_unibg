package animali_es2;

public class Prova {
	
	public static void main(String[] args) {
		Topo t=new Topo("Topo");
		Gatto g=new Gatto("Gatto");
		Animale a=new Animale("Animale");
		
		t.parla();
		g.parla();
		
		t.incontra(a);
		t.incontra(g);
		g.incontra(a);
		g.incontra(t);
		a.incontra(a);
		
	}

}
