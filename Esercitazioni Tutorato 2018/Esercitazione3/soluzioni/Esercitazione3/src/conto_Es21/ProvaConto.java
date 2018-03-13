package conto_Es21;

public class ProvaConto {

	public static void main(String[] args) {
		ContoCorrente c=new ContoCorrente("IT5026D", "Pippo", 110000);
		
		System.out.println("Numero conto: "+c.getNumeroconto());
		System.out.println("Nome proprietario: "+c.getNomeProprietario());
		System.out.println("Saldo: "+c.getImporto());
				
		c.setImporto(c.preleva(1000));
		System.out.println("Saldo dopo il prelievo: "+c.importo);
		
		c.setImporto(c.ricarica(2500));
		System.out.println("Saldo dopo la ricarica: "+c.importo);
		
		System.out.println("Interessi: "+c.calcolaInteressi(0.0001));
		
	}
	
}
