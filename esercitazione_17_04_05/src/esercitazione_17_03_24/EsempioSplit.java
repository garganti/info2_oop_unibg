package esercitazione_17_03_24;

import java.util.StringTokenizer;

public class EsempioSplit {
	
	public static void main(String[] args) {
		String s = "ciao sono io";
		String[] st = s.split(" ");
		for(String n: st){
			System.out.println(n);
		}
	}

}
