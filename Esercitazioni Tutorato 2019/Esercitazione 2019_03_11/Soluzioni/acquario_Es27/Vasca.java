package acquario_Es27;

import java.util.ArrayList;

public class Vasca {
	
	ArrayList<Pesce> lista = new ArrayList<>();
	String nome;
	
	public Vasca(String nome) {
		this.nome=nome;
	}
	
	void aggiungiPesce(Pesce esemp) {
		lista.add(esemp);
	}
	
	void stampaPesci(){
		for(Pesce e: lista)
				System.out.println(e.toString());
	}
	
	void eliminaPesce(String id) {
		for (int i=0; i<lista.size(); i++)
			if (lista.get(i).id.equalsIgnoreCase(id)==true)
				lista.remove(i);
				
			
	}

}
