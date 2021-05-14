package dati;

import java.util.ArrayList;
import java.util.List;

import eccezioni.IdUsatoException;

public class Paziente {
	
	String nome;

	// codice numerico univoco 
	int id;
	// tengo memoria di tuui gli id usati
	private static List<Integer> idUsati = new ArrayList<>();
	
	// l'id viene calcolato dal nome
	public Paziente(String nome) {
		this(nome, calcolaID(nome));
	}
	// id passato insieme al nome
	public Paziente(String nome, int id) {
		if (idUsati.contains(id))
			throw new IdUsatoException();
		this.id = id;
		this.nome = nome;
		idUsati.add(id);
	}
	
	

	// dato un nome costruisce un ID che sia univoco possibilmente
	static private int calcolaID(String nome) {
		return nome.length() * 1000000 + nome.charAt(1)  * 1000 +
		nome.charAt(3) * 10 + (int)(Math.random()*10);
	}
	
	@Override
	public String toString() {
		return nome + "(" + id +")";
	}
}
