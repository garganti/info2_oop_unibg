package negozi_Es35;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

	static int counter=1;
	static List<Negozio> negozi = new ArrayList<>();
	int id;
	String nome;
	
	ArrayList<Prodotto> listaProdotti= new ArrayList<>();
	
	public Negozio(String nome) throws SameStoreIDException {
		this(counter++, nome);
	}

	/** 
	 * La clausola "throws" è necessaria in quanto l'eccezione è di tipo "controllato" (non è una RuntimeException)
	 * @param id l'ID del negozio
	 * @param nome il nome del negozio
	 * @throws SameStoreIDException se c'è già un negozio con lo stesso ID
	 */
	public Negozio(int id, String nome) throws SameStoreIDException {
		if (idAlreadyPresent(id)) throw new SameStoreIDException(id);
		this.id=id;
		this.nome=nome;
	}
	
	/**
	 * 
	 * @param p il prodotto da aggiungere
	 * @throws SameItemIDException se il prodotto è già presente (con stesso id)
	 */
	void aggiungiProdotto(Prodotto p) throws SameItemIDException {
		if (esisteProdotto(p))
			throw new SameItemIDException(p.id);
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
	
	void modificaQtaProdotto(int id, int nuovaQta) throws NegativeRefillException {
		for (int i=0; i<listaProdotti.size(); i++) {
			if (id==listaProdotti.get(i).getId()) {
				listaProdotti.get(i).setQta(nuovaQta);			
			}
		}
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

	boolean idAlreadyPresent(int id) {
		for (Negozio n : negozi) if (n.id==id) return true;
		return false;
	}
}
