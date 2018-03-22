package menu_Es28;
import java.util.ArrayList;
public class Tavolo 
{
	static int counter=1;
	int id;
	int numeroCoperti=0;
	int copertiresidui;
	ArrayList<Piatto> listaPiatti=new ArrayList<Piatto>();
	
	ArrayList<Persona> listaPersone=new ArrayList<Persona>();
	
	
	public Tavolo(int numeroCoperti)
	{
		this.numeroCoperti=numeroCoperti; 
		this.copertiresidui=numeroCoperti;
		id=counter;
		counter++;
	}
	
	
	
	public void inserisciPiatto(Piatto p)
	{
		if (esistePiatto(p))
			System.out.println("Piatto già inserito");
		else
			listaPiatti.add(p);
	}
	
	public void aggiungiPersona(Persona p){
		if (copertiresidui>0) {
			listaPersone.add(p);
			copertiresidui--;
		}else {
			System.out.println("Tavolo pieno");
		}
	}
	
	boolean esistePiatto(Piatto p) {
		for (int i=0; i<listaPiatti.size(); i++)
			if (p.getId()==listaPiatti.get(i).getId())
				return true;
		return false;
	}

	void rimuoviPiatto(int id){
		int indice=indicePiatto(id);
		if (indice!=-1)
				listaPiatti.remove(indice);
		else
			System.out.println("Piatto non trovato");
		
	}

	int indicePiatto(int id) {
		for (int i=0; i<listaPiatti.size(); i++)
			if (id==listaPiatti.get(i).getId())
				return i;
		return -1;
	}
	
	void modificaQta(int id, int nuovaQta){
		for (int i=0; i<listaPiatti.size(); i++)
			if (id==listaPiatti.get(i).getId())
				listaPiatti.get(i).setQta(nuovaQta);
	}


	void visualizzaPersone(){
		for (int i=0; i<listaPersone.size(); i++)
			System.out.println(listaPersone.get(i).toString());
	}
	
	void visualizzaPiatti(){
		for (int i=0; i<listaPiatti.size(); i++)
			System.out.println(listaPiatti.get(i).toString());
	}

	double calcolaTotale()
	{
		double tot=0;
		for(int i=0;i<listaPiatti.size();i++)
		{
			tot=tot+((Piatto)listaPiatti.get(i)).getPrezzo();
		}
		return tot;
	}
	
	double calcolaPrezzoMedio(){
		return calcolaTotale()/(numeroCoperti-copertiresidui);
	}
	
	public int getId() 
	{
		return id;
	}
	public int getNumeroCoperti() 
	{
		return numeroCoperti;
	}
	
	
	
	
}
