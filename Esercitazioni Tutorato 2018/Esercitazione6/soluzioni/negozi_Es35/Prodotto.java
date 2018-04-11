package negozi_Es35;

import java.util.HashSet;
import java.util.Set;

public class Prodotto {

	int id;
	int qta;
	double prezzo;
	static Set<Integer> idProdotti = new HashSet<>();
	
	public Prodotto(int id, int qta, double prezzo) throws SameItemIDException {
		if (idProdotti.contains(id)) throw new SameItemIDException(id);
		this.id=id;
		this.qta=qta;
		this.prezzo=prezzo;
		idProdotti.add(id);
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setQta(int qta) throws NegativeRefillException {
		if (qta<0) throw new NegativeRefillException();
		this.qta = qta;
	}
	
	public int getQta() {
		return qta;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		return id + " " + qta + " "+ prezzo;
	}
	
	
}
