package cap05;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class EsempioStringT {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Manzoni,Promessi Sposi", ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String l = "Manzoni,Promessi Sposi";
		String[] parti = l.split(",");
		for(String e: parti) {
			System.out.println(e);
		}
		// per stampare degli array
		System.out.println(Arrays.toString(parti));
		System.out.println(parti.toString()); // non va bene
		
		Vector<String> v = new Vector<String>();
		v.add("piero");
		v.add("anna");
		v.add("zorro");
		System.out.println(v.toString());
		Collections.sort(v);
		System.out.println(v.toString());
	}

}
