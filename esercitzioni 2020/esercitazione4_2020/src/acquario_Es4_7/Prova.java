package acquario_Es4_7;

public class Prova {

	public static void main(String[] args) {
		Acquario mioAcquario = new Acquario();
		Vasca v1 = new Vasca("V1");
		
		v1.aggiungiPesce(new Pesce("P001",1,100));
		v1.aggiungiPesce(new Pesce("P002",1,1000));
		v1.aggiungiPesce(new Pesce("P003",12,100));
		v1.aggiungiPesce(new Pesce("P004",1,100));
		
		v1.stampaPesci();
		
		v1.eliminaPesce("P002");
		
		System.out.println("------------------------");
		
		v1.stampaPesci();
		//
		mioAcquario.addVasca(v1);
		System.out.println(mioAcquario);
		
		
	}
}
