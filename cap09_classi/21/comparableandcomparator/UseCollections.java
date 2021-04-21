package comparableandcomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseCollections {

	public static void main(String[] args) {
		// classe arrays
		List<String> nomi = Arrays.asList("a","z","m");
		System.out.println(nomi);
		// classe Collections
		// disordina
		Collections.shuffle(nomi);
		System.out.println(nomi);
		// ordina
		Collections.sort(nomi);
		System.out.println(nomi);
		//
		String max = Collections.max(nomi);
		System.out.println("max " + max);
		
		
		
		
		
	}
	
}
