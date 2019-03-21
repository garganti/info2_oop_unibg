package negozi_Es35;

public class Prova {

	
	public static void main(String[] args) throws SameIDException, NegativeRefillException {
		Negozio n1= new Negozio("nome");
		n1.aggiungiProdotto(new Prodotto(1, 5,2));
		n1.aggiungiProdotto(new Prodotto(2, 3,5));
		n1.aggiungiProdotto(new Prodotto(3, 5,9));
		n1.aggiungiProdotto(new Prodotto(4, 7,3));
		try {
			System.out.println("Prodotto con stesso ID:");
			n1.aggiungiProdotto(new Prodotto(1, 7,3));
		} catch (Exception e) {System.err.println(e.getMessage());}
		
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
		
		try {
			System.out.println("Quantità negativa: ");
			n1.modificaQtaProdotto(1, -1);
		} catch (NegativeRefillException e) {
			e.printStackTrace();
		}
		
	}
}
