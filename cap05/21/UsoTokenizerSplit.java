import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;


class Cane{
	int eta;
	
	void abbia() {}
	
}


public class UsoTokenizerSplit {

	
	public static void main(String[] args) {
		String data = "Alessandro Manzoni;Fermo e Lucia;1825";
		StringTokenizer st = new StringTokenizer(data, ";");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String[] splittedData = data.split(";");
		System.out.println(splittedData[2]);
		
		System.out.println(splittedData);
		
		System.out.println(Arrays.toString(splittedData));
		
		Vector<String> nomi = new Vector<String>(); 
		nomi.add("luigi");
		nomi.add("angelo");
		nomi.add("zorro");
		for(String n: nomi) {
			System.out.println(n);
		}
		//nomi.
		Collections.sort(nomi);
		for(String n: nomi) {
			System.out.println(n);
		}
		ArrayList al;
		
		int[] nomiArray = new int[60];
		// 
		System.out.println(nomiArray.length); 
		
		System.out.println(nomi.size());
		
		
		// java lambda expression
		nomi.stream().forEach(System.out::println);
		
	}
	
}
