package animale_Es38;

public class Main {
	public static void main(String[] args) {
		Topo t = new Topo("Tom");
		Gatto g = new Gatto("Gerry");
		
		System.out.println("C'erano una volta un topo di nome "+t.comeTiChiami()+", e un gatto chiamato "+g.comeTiChiami());
		
		g.incontra(t);
		t.incontra(g);
		
		Topo t2 = new Topo("Tom2");
		t2.incontra(t);
		t2.incontra(g);
		
		Animale a = new Animale("mucca");
		a.incontra(t);
		t.incontra(a);
		g.incontra(a);
		a.incontra(g);
	}
}
