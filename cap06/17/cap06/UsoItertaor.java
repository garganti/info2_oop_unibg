package cap06;

import java.util.Iterator;
import java.util.Vector;

public class UsoItertaor {

	public static void main(String[] args) {
		Vector<String> bravi = new Vector<>();
		
		bravi.add("giovanni");
		bravi.add("piera");
		bravi.add("rio");
		
		// uso di iteratr
		Iterator<String> i = bravi.iterator();
		while(i.hasNext()){
			String nb = i.next();
			System.out.println( nb + " è bravo");
		}
		// ==> 
		for(String nb: bravi){
			System.out.println( nb + " è bravo");			
		}
		
	}
	
}
