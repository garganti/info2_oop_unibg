package negozi_Es35;

public class ProdottoCliente {

	int id;
	int qta;
	
	public ProdottoCliente(int id, int qta) {
		this.id=id;
		this.qta=qta;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setQta(int qta) {
		this.qta = qta;
	}
	
	public int getQta() {
		return qta;
	}
	
	@Override
	public String toString() {
		return id + " " + qta;
	}
}
