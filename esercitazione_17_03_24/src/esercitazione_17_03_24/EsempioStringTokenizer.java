package esercitazione_17_03_24;

import java.util.StringTokenizer;

public class EsempioStringTokenizer {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ciao sono io");
		while(st.hasMoreTokens()){
			String n = st.nextToken();
			System.out.println(n);
		}
	}

}
