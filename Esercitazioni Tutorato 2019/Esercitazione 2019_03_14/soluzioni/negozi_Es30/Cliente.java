package negozi_Es30;

import java.util.ArrayList;

public class Cliente {

	int id;
	static int counter=1;
	String nome, cognome;
	ArrayList<ProdottoCliente> listaspesa = new ArrayList<>();

	public Cliente(String nome, String cognome) {
		this.id = counter;
		counter++;
		this.cognome = cognome;
		this.nome = nome;
	}

	void aggiungiProdotto(ProdottoCliente p) {
		if (esisteProdotto(p))
			System.out.println("Prodotto già inserito");
		else
			listaspesa.add(p);
	}

	private boolean esisteProdotto(ProdottoCliente p) {
		for (int i = 0; i < listaspesa.size(); i++)
			if (p.getId() == listaspesa.get(i).getId())
				return true;
		return false;
	}

	int indiceProdotto(int id) {
		for (int i = 0; i < listaspesa.size(); i++)
			if (id == listaspesa.get(i).getId())
				return i;
		return -1;
	}

	void modificaQtaProdotto(int id, int nuovaQta) {
		for (int i = 0; i < listaspesa.size(); i++)
			if (id == listaspesa.get(i).getId())
				listaspesa.get(i).setQta(nuovaQta);
	}

	void rimuoviProdotto(int id) {
		int indice = indiceProdotto(id);
		if (indice != -1)
			listaspesa.remove(indice);
		else
			System.out.println("Piatto non trovato");
	}

	void faiLaSpesa(Negozio n) {
		double totale=0;
		for (int i=0; i<listaspesa.size(); i++) {
			int idProdottoSpesa = listaspesa.get(i).getId();
			int indiceP=trovaProdottoNegozio(n, idProdottoSpesa);
			if (indiceP!=-1) {
				int qtaDispNegozio = n.getListaProdotti().get(indiceP).getQta();
				if (qtaDispNegozio==0)
					System.out.println(idProdottoSpesa+ ": prodotto non disponibile");
				else {
					double prezzoProdotto = n.getListaProdotti().get(indiceP).getPrezzo();
					int qtaRichiesta = listaspesa.get(i).getQta();
					if (qtaRichiesta<=qtaDispNegozio) {//ci sono più prodotti in negozio di quelli richiesti
						n.modificaQtaProdotto(idProdottoSpesa, (qtaDispNegozio-qtaRichiesta));
						totale= totale + (prezzoProdotto*qtaRichiesta);
					}
					else { // ci sono meno prodotti in negozio di quelli richiesti: preleva tutti quelli del negozio
						n.modificaQtaProdotto(idProdottoSpesa, qtaDispNegozio);
						totale= totale + (prezzoProdotto*qtaDispNegozio);
						System.out.println(idProdottoSpesa+ ": quantità richiesta non disponibile, acquistati solo " + qtaDispNegozio + " prodotti");
					}
				}
			}else
				System.out.println("Prodotto non esistente");
			
	}
		
		System.out.println("Totale spesa: " + totale);
	}

	private int trovaProdottoNegozio(Negozio n, int id2) {
		for (int i = 0; i < n.getListaProdotti().size(); i++)
			if (n.getListaProdotti().get(i).getId() == id2)
				return i;
		return -1;
	}

	void visualizzaProdotti(){
		for (int i=0; i<listaspesa.size(); i++)
			System.out.println(listaspesa.get(i).toString());
	}
	
}
