package automobili_Es26;

public class Prova {

	public static void main(String[] args) {
		Automobile a1=new Automobile(1,100);

		Automobile a2=new Automobile(1,20);
		
		System.out.println(a1.isMaggioreKm(a2));
		System.out.println(a1.isMinoreKm(a2));
		
		Automobile [] arrayAuto = new Automobile[5];
		
		arrayAuto[0]=new Automobile(1, 20);
		arrayAuto[1]=new Automobile(2, 50);
		arrayAuto[2]=new Automobile(3, 30);
		arrayAuto[3]=new Automobile(4, 80);
		arrayAuto[4]=new Automobile(5, 40);
		
		
		
		System.out.println("Prima dell'ordinamento: ");
		for (Automobile a: arrayAuto)
			System.out.println(a.id);
		
		bubblesort(arrayAuto);	
		
		System.out.println("Dopo l'ordinamento: ");
		for (Automobile a: arrayAuto)
			System.out.println(a.id);
		
	}
	
	private static Automobile[] bubblesort(Automobile[] autoArray) {
		int ultimoscambiato = autoArray.length;
		int n = autoArray.length-1;
		Automobile temp;
		while (ultimoscambiato>0) {
			ultimoscambiato=0;
			for (int i=0; i<n; i++)
				if (autoArray[i].isMaggioreKm(autoArray[i+1])==true) {
					temp=autoArray[i];
					autoArray[i]=autoArray[i+1];
					autoArray[i+1]=temp;
					ultimoscambiato=i;
				}
			n=ultimoscambiato;
		}
		return autoArray;
	}
}
