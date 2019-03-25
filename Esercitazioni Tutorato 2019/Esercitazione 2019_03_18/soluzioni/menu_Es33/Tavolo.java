package menu_Es33;
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
	
	public Tavolo(int id, int numeroCoperti) {
		this(numeroCoperti);
		this.id=id;
		counter=id+1;
	}
	
	
	/** It may throw a RuntimeException.
	 * Siccome è un'eccezione NON controllata (Runtime), non è necessario dichiarare che 
	 * il metodo può lanciare un'eccezione (throws Exception)
	 * @param p
	 */
	public void inserisciPiatto(Piatto p)
	{
		if (esistePiatto(p))
			throw new RuntimeException("Piatto già inserito: "+p);
		else
			listaPiatti.add(p);
	}
	
	public void aggiungiPersona(Persona p){
		if (listaPersone.contains(p)) throw new RuntimeException("Persona già esistente: "+p);
		else if (copertiresidui>0) {
			listaPersone.add(p);
			copertiresidui--;
		} else {
			throw new RuntimeException("Tavolo già pieno, impossibile inserire la persona "+p);
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
			throw new RuntimeException("Piatto con ID="+id+" non trovato");
		
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
	
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Tavolo && ((Tavolo)o).getId()==id;
	}
	
	
}
