package acquario_Es4_7;

import java.util.ArrayList;
import java.util.List;

public class Vasca {

	private List<Pesce> lista = new ArrayList<>();
	private String nome;
	static private List<String> nomi = new ArrayList<>();

	public Vasca(String nome) {
		this.nome = nome;
		if (nomi.contains(nome))
			System.err.println("nome vasca già usato");
	}

	void aggiungiPesce(Pesce esemp) {
		lista.add(esemp);
	}

	void stampaPesci() {
		for (Pesce e : lista)
			System.out.println(e.toString());
	}

	void eliminaPesce(String id) {
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i).getId().equalsIgnoreCase(id) == true)
				lista.remove(i);

	}
	
	public String toString() {
		String result = "vasca " + nome + "\n";
		for (Pesce e : lista)
			result += e.toString() + "\n";
		return result;
	}

}
