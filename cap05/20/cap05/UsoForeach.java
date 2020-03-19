package cap05;

public class UsoForeach {

	public static void main(String[] args) {
		// 
		int[] numeriPari = new int[10];
		// riempiamo un array con i primi 10 numeri pari 2, 4 ...
		for (int i = 1; i <= 10; i++) {
			numeriPari[i - 1] = i * 2;
		}
		int[] numeriPari2 = {2,4,6};
		
		String[] nomi = {"piero", "gio", "mary"};

		// 4 nomi di cui solo il primo valido
		String[] classe = {"piero", null , null, null};

		//System.out.println(numeriPari.toString());
		for(int j = 0; j < numeriPari.length; j++) {
			System.out.print(numeriPari[j] + " ");
		}
		
		for (int e : numeriPari) {
			System.out.print(e + " ");
		}
		
	}

}
