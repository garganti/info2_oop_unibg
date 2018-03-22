package negozi_Es30;

public class Prova {

	
	public static void main(String[] args) {
		Negozio n1= new Negozio("nome");
		
		n1.aggiungiProdotto(new Prodotto(5,2));
		n1.aggiungiProdotto(new Prodotto(3,5));
		n1.aggiungiProdotto(new Prodotto(5,9));
		n1.aggiungiProdotto(new Prodotto(7,3));
		n1.aggiungiProdotto(new Prodotto(7,3));

		System.out.println("------------------------");
		n1.visualizzaProdotti();
		
		n1.modificaQtaProdotto(1, 8);
		
		System.out.println("------------------------");
		n1.visualizzaProdotti();
		
		n1.rimuoviProdotto(3);
		
		System.out.println("------------------------");
		n1.visualizzaProdotti();
		
		Cliente c1 = new Cliente("nome", "cognome");
		c1.aggiungiProdotto(new ProdottoCliente(1, 2));
		c1.aggiungiProdotto(new ProdottoCliente(2, 3));
		c1.aggiungiProdotto(new ProdottoCliente(4, 2));
		c1.aggiungiProdotto(new ProdottoCliente(5, 2));
		c1.aggiungiProdotto(new ProdottoCliente(6, 2));
		
		System.out.println("------------------------");
		c1.visualizzaProdotti();
		
		c1.modificaQtaProdotto(1, 3);
		
		System.out.println("------------------------");
		c1.visualizzaProdotti();
		
		c1.rimuoviProdotto(5);
		
		System.out.println("------------------------");
		c1.visualizzaProdotti();
		
		c1.faiLaSpesa(n1);
		
		System.out.println("------------------------");
		n1.visualizzaProdotti();
		
	}
}
