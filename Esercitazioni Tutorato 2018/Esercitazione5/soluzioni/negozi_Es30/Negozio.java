package negozi_Es30;

import java.util.ArrayList;

public class Negozio {

	static int counter=1;
	int id;
	String nome;
	
	ArrayList<Prodotto> listaProdotti= new ArrayList<>();
	
	public Negozio(String nome) {
		this.id=counter;
		counter++;
		this.nome=nome;
	}
	
	void aggiungiProdotto(Prodotto p){
		if (esisteProdotto(p))
			System.out.println("Prodotto già inserito");
		else
			listaProdotti.add(p);
	}

	private boolean esisteProdotto(Prodotto p) {
		for (int i=0; i<listaProdotti.size(); i++)
			if (p.getId()==listaProdotti.get(i).getId())
				return true;
		return false;
	}
	

	int indiceProdotto(int id) {
		for (int i=0; i<listaProdotti.size(); i++)
			if (id==listaProdotti.get(i).getId())
				return i;
		return -1;
	}
	
	void modificaQtaProdotto(int id, int nuovaQta){
		for (int i=0; i<listaProdotti.size(); i++)
			if (id==listaProdotti.get(i).getId())
				listaProdotti.get(i).setQta(nuovaQta);
	}

	
	void rimuoviProdotto(int id){
		int indice=indiceProdotto(id);
		if (indice!=-1)
			listaProdotti.remove(indice);
		else
			System.out.println("Piatto non trovato");
	}

	
	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}
	
	void visualizzaProdotti(){
		for (int i=0; i<listaProdotti.size(); i++)
			System.out.println(listaProdotti.get(i).toString());
	}

	
}
